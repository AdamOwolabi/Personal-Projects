package edu.howardcc.cmsy167;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Driver for Monte Carlo Pi estimation
 */
public class MonteCarloPi {

    public static final int NUM_THREADS = 6;
    public static final int NUM_ITERATIONS = 100_000_000;

    public static void main(String[] args) throws InterruptedException {

        int numProcessors = Runtime.getRuntime().availableProcessors();
        System.out.printf("Available Processors: %s\n", numProcessors);

        int iterationsPerThread = NUM_ITERATIONS/NUM_THREADS;
        PiCalculator piCalculator = new PiCalculator(iterationsPerThread);

        Instant startTime = Instant.now();

        // Create an executor (thread pool)
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);

        // Submit tasks for each thread
        for (int i = 0; i < NUM_THREADS; i++) {
            // Submit a task to our executor
            executorService.execute(piCalculator);
        }

        // Shut down the executor service
        executorService.shutdown();

        // Wait for threads to finish
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        // Read results
        piCalculator.getPiEstimate();

        Instant finishTime = Instant.now();

        long timeInMilliseconds = Duration.between(startTime, finishTime).toMillis();
        System.out.printf("Approximation of Pi using %d iterations and %d thread(s) completed in %d milliseconds: %f\n",
                NUM_ITERATIONS, NUM_THREADS, timeInMilliseconds, piCalculator.getPiEstimate());

    }

    /**
     * Uses a Monte Carlo method to estimate Pi
     */
    public static class PiCalculator implements Runnable {

        private final int iterations;

        int circlePoints = 0;
        int squarePoints = 0;

        public PiCalculator(int iterations) {
            this.iterations = iterations;
        }

        public void run() {

            final Random random = new Random();

            int thisThreadCirclePoints = 0;
            int thisThreadSquarePoints = 0;

            for (int i = 0; i < iterations; i++) {
                double x = random.nextDouble();
                double y = random.nextDouble();
                double d = x * x + y * y;

                if (d <= 1) {
                    thisThreadCirclePoints++;
                }
                thisThreadSquarePoints++;
            }

            synchronized (this) {
                this.circlePoints += thisThreadCirclePoints;
                this.squarePoints += thisThreadSquarePoints;
            }

        }

        public double getPiEstimate() {
            return 4.0 * ((double)circlePoints / (double)squarePoints);
        }
    }
}
