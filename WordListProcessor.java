import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class WordListProcessor {
    // read file
    public static void main(String[] args) throws IOException {
        System.out.println("HCC CMSY-167 Java Programming II Copyright Howard Community College. \nAll Rights Reserved \nWordGame: Word List Processor\n");

        Scanner input = new Scanner(System.in);
        Path inputFilePath = null;

        //Users/adam0789/Desktop/Files/College/Classes/Java-2/java-ii-assignments-AdamOwolabi/Projects/WordGame/popular.txt/3

        boolean isFileValid = false;
        //checks if file exists
        while (isFileValid != true) {


            //Get output filepath from user
            System.out.println("Input File: ");
            String file = input.nextLine();



            //get file using its path
            inputFilePath = Paths.get(file);

            //inputFilePath = inputFilePath.toAbsolutePath();
            //System.out.println("TEs: "+ inputFilePath);

            if (!Files.exists(inputFilePath)) {
                inputFilePath = inputFilePath.toAbsolutePath();
                System.out.printf("File does not exist: %s", inputFilePath.toAbsolutePath());
                isFileValid = false;
            } else {
                System.out.printf("Using input File: %s", inputFilePath.toAbsolutePath());
                isFileValid = true;
//            }
            }

            System.out.println("\nEnter Output file: ");

            //Get output filepath from user
            String outputFile = input.nextLine();
            Path outputFilePath = Paths.get(outputFile);

            System.out.printf("Using input File: %s", outputFilePath.toAbsolutePath());

            //count variables
            int fiveCount = 0;
            int wordIgnore = 0;

            //open and read the file
            Scanner readFile = new Scanner(inputFilePath);

            //formatter object to write in file
            try (Formatter formatter = new Formatter(outputFilePath.toFile())) {

                String words = "";
                //while loop to print each line
                while (readFile.hasNextLine()) {

                    //read file
                    words = readFile.nextLine();

                    //remove whitespaces
                    words = words.replaceAll("/^[A-Z]+/gm", "");


                    words = words.replaceAll("/\\W/gm", "");



                    //+"/\\W+/gm"+ "/\\d+/gm"
                    //Change to upperCase
                    words = words.toUpperCase();

                    //Before adding, check if word is a 5-letter word
                  if (words.length() == 5 && !words.matches("/\\W/gm")) {
                      //write each 5-letter word to output file.
                      formatter.format(words + "\n");
                      fiveCount += 1;
                  } else{
                      }
                        wordIgnore += 1;
                    }
                }

                //print Summary
                System.out.printf("\nWord5Count: %d and wordsIgnored : %d", fiveCount, wordIgnore);
            }
        }
    }



//if(!Files.exists(inputFilePath)){
// System.out.printf("File does not exist: %s", inputFilePath.toAbsolutePath());
 // isFileValid = false;
 //  } else {
//                System.out.println(inputFilePath.toAbsolutePath());
//               // Files.exists(inputFilePath);
//                isFileValid = true;
//            }
