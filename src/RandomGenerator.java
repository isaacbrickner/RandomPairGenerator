import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.*;

public class RandomGenerator {

  private static ArrayList<String> randomPairs;
  private static String studentName1, studentName2;
  private static String pair;
  private static ArrayList<String> namePairing;
  InitialWindow filePath;

  public RandomGenerator() {
    randomPairs = new ArrayList<String>();
    namePairing = new ArrayList<String>();
    this.filePath = new InitialWindow();
  }

  public static void loadFiles() {
    try {

      File studentNames = new File("lib/students.txt");
      Scanner myReader = new Scanner(studentNames);

      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        randomPairs.add(data);
      }
      myReader.close();

    } catch (FileNotFoundException error) {
      System.out.println("An error occurred.");
      error.printStackTrace();
    }
  }

  public static void scrambleNames() {
    Collections.shuffle(randomPairs);
    for (int i = 0; i < randomPairs.size(); i += 2) {
      studentName1 = randomPairs.get(i);
      studentName2 = randomPairs.get(i + 1);
      pair = studentName1 + " and " + studentName2 + " is a pair \n";
      namePairing.add(pair);
      System.out.println(studentName1 + " and " + studentName2 + " is a pair \n");
    }
  }

  public static ArrayList<String> getNamePairing() {
    return namePairing;
  }

}
