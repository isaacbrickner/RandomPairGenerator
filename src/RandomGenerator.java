import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.*;

public class RandomGenerator {

  private static ArrayList<String> randomPairs;
  private static String studentName1, studentName2;
  private static ArrayList<String> pair;

  public static void getPair() {
    for (int i = 0; i <= pair.size(); i++) {
      pair.get(i);
    }
  }

  public RandomGenerator() {
    randomPairs = new ArrayList<String>();
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
      pair.add(studentName1 + " and " + studentName2 + " is a pair \n");
      System.out.println(studentName1 + " and " + studentName2 + " is a pair \n");
    }
  }

}
