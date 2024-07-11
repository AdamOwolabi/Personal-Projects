import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Wordle {
    public static void main(String[] args) throws IOException, SQLException {
        System.out.println("HCC CMSY-167 Java Programming II \n Copyright Howard Community College. All Rights Reserved.");
        System.out.println("Welcome to WordGame!\n" + "Find the secret five-letter word in the fewest possible guesses");


        Path commonFilePath = Paths.get("/Users/adam0789/Desktop/Files/College/Classes/Java-2/java-ii-assignments-AdamOwolabi/Projects/WordGame/popular5.txt");
        Path validFilePath = Paths.get("/Users/adam0789/Desktop/Files/College/Classes/Java-2/java-ii-assignments-AdamOwolabi/Projects/WordGame/word5.txt");
        Path dictionaryPath = Paths.get("/Users/adam0789/Desktop/Files/College/Classes/Java-2/java-ii-assignments-AdamOwolabi/Projects/WordGame/dictionary.txt");

        Scanner readCommonFile = new Scanner(commonFilePath);
        Scanner readValidFile = new Scanner(validFilePath);
        Scanner readDictionaryFile = new Scanner(dictionaryPath);

        String words = "";
        String validWords = "";
        String dictionaryWords = "";
        String secretWord = "";
        int guessCounter = 1;
        List<Score> finalList = new ArrayList<>();


        List<String> commonList = new ArrayList<String>();
        Set<String> validSet = new HashSet<>();
        Map<String, String> dictionaryMap = new HashMap<>();

        while (readDictionaryFile.hasNextLine()) {
            dictionaryWords = readDictionaryFile.nextLine();
            String parts[] = dictionaryWords.split(":::");
            dictionaryMap.put(parts[0].toUpperCase(), parts[1]);
        }
        //System.out.printf("Dictionary: %s%n", dictionaryMap);

        while (readCommonFile.hasNextLine()) {
            words = readCommonFile.nextLine();

            //words = words.toUpperCase().replaceAll("/[^A-Z]+/g", "");
            commonList.add(words);
        }
        while (readValidFile.hasNextLine()) {
            validWords = readValidFile.nextLine();
            // validWords = words.toUpperCase().replaceAll("//s+", "");
            validSet.add(validWords);
        }

        Scanner input = new Scanner(System.in);
        secretWord = getRandomElement(commonList);

        //Check if inout is a 5-letter word
        boolean isGuessValid = false;
        while (isGuessValid != true) {
            char wordArray[] = secretWord.toCharArray();


            System.out.printf("Guess #%s: \n", guessCounter);
            String guess = input.nextLine();
            guess = guess.toUpperCase();
            if (guess.length() != 5) {
                System.out.printf("%s is not a valid guess, Try again \n", guess);
                isGuessValid = false;
            } else if (!guess.matches("[a-zA-Z]+")) {
                System.out.println("Invalid word, Try again");
                isGuessValid = false;
            } else if (!validSet.contains(guess)) {
                System.out.println("Not a word, Try again");
                isGuessValid = false;
            } else {
                if (guess.equals(secretWord)) {
                    System.out.printf("Congratulations! you guessed the secret word (%s) in %d guesses %n", secretWord, guessCounter);
                    if (dictionaryMap.containsKey(secretWord)) {
                        System.out.printf("%s : %s %n", secretWord, dictionaryMap.get(secretWord));
                    } else {
                        System.out.printf("No definition found for (%s)%n", secretWord);
                        if (secretWord.endsWith("s")) {
                            secretWord = secretWord.substring(0, secretWord.length() - 1);
                            if (dictionaryMap.containsKey(secretWord)) {
                                System.out.printf("%s : %s %n", secretWord, dictionaryMap.get(secretWord));
                            }
                        }
                    }
                    isGuessValid = true;
                } else {

                    StringBuilder stringBuilder = new StringBuilder();
                    char inputArray[] = guess.toCharArray();
                    guessCounter++;

                    //for loop to compare arrays and print correct guesses
                    for (int i = 0; i < guess.length(); i++) {

                        //checks if letter(guess) is in secretWord
                        if (secretWord.indexOf(inputArray[i]) != -1) {

                            //checks if letter(guess) is in right position
                            if (inputArray[i] == wordArray[i]) {
                                stringBuilder.append(inputArray[i]);
                            } else {
                                stringBuilder.append("?");
                            }
                        } else {
                            stringBuilder.append("-");
                        }
                    }
                    System.out.println("\nYou Guessed: " + guess);
                    System.out.printf("Hint:%13s \n", stringBuilder);
                }
            }
        }
        secretWord = secretWord;
        String time = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(LocalDateTime.now());

        Score lastScore = new Score(time, secretWord, guessCounter);

        // System.out.println("Score List: "+ scoreList.toString());

        List<Score> scoreList = Score.getScoreFromDB();
        scoreList.add(lastScore);
        Score.saveScoreToDB(lastScore);

        for (Score score : scoreList) {
            System.out.printf("%s  %d  %s%n", score.getSecretWord(), score.getGuessCount(), score.getTimeStamp());
        }
    }

    public static String getRandomElement(List<String> list){
        Collections.shuffle(list);
        return list.get(
                ThreadLocalRandom.current().nextInt(0,list.size())
        );
        }
}

