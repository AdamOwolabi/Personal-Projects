import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.*;

public class Score {
    String timeStamp;

    @Override
    public String toString() {
        return "Score{" +
                "timeStamp='" + timeStamp + '\'' +
                ", secretWord='" + secretWord + '\'' +
                ", guessCount=" + guessCount +
                '}';
    }

    String secretWord;
    int guessCount;

    public Score(String timeStamp, String secretWord, int guessCount ) {
        this.timeStamp = timeStamp;
        this.secretWord = secretWord;
        this.guessCount = guessCount;
    }

    public Score() {
        timeStamp = "";
        secretWord = "";
        guessCount = 0;
    }


    public int getGuessCount() {
        return guessCount;
    }

    public void setGuessCount(int guessCount) {
        this.guessCount = guessCount;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }




    public static void saveScores(List<Score> x, String y) {

        Path file = Paths.get(y);

        try {
            Formatter formatter = new Formatter(file.toAbsolutePath().toFile());

            for(Score score: x){
                formatter.format((score.getTimeStamp() + "," + score.getSecretWord()+","+ score.getGuessCount()) + "\n");
            }
            System.out.println(x);
            formatter.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Score> readScore(Path x){
        List<Score> scoreList = new ArrayList<Score>();

        Scanner readFile;
        try {
            readFile = new Scanner(x);
        } catch (IOException e) {
            return scoreList;
        }


        while(readFile.hasNextLine()){
            String zyx = readFile.nextLine();
            //2022-09-11 13:56,THINS,3

         String xyz = zyx.toString();

          String[] tokens = xyz.split(",");

          String date = tokens[0];
          String word = tokens[1];
          String guessCount = tokens[2];
          guessCount = guessCount.trim();
          int convert = Integer.parseInt(guessCount);




          Score score = new Score(date, word, convert);
          score.setTimeStamp(date);
          score.setSecretWord(word);
          score.setGuessCount(convert);

          scoreList.add(score);

        }
        return scoreList;
    }

    public static List<Score> getScoreFromDB() throws SQLException {
        List<Score> scores = new ArrayList<>();
        Connection connection = DriverManager.getConnection("jdbc:derby:DataBase");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(
            "SELECT * FROM SCORES"
        );
        while(resultSet.next()){
            String secretWord = resultSet.getString(1);
            String timeStamp = resultSet.getString(2);
            int guessCount = resultSet.getInt(3);

            Score ReadScore = new Score(secretWord, timeStamp, guessCount);
            scores.add(ReadScore);
        }

        return scores;
    }

    public static void saveScoreToDB(Score score) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:derby:DataBase");
       Statement ps1 = connection.createStatement();
       String query = ("INSERT INTO SCORES(SECRET_WORD, TIMESTAMP, GUESS_COUNT) " +
               "VALUES('"+score.secretWord+"', '"+score.timeStamp+"', "+score.guessCount+")");
        ps1.execute(query);

    }
}
