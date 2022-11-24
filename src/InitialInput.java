import java.util.Scanner;


public class InitialInput {
    private static Scanner keyboardInput = new Scanner(System.in);
    private String affirmationFromUser;

    
public InitialInput() {
    }

public static String initialPrompt() {
       return "Would you like to generate random student pairings?\n Enter \"yes\" ";

    
}

public String affirmationInput() {
    affirmationFromUser = keyboardInput.nextLine();
    return affirmationFromUser;
}

public boolean initialInputValidation(String affirmation) {
    if (affirmationFromUser.equals("yes") || affirmationFromUser.equals("Yes")) {
        System.out.println("Great, here are the pairings");
        return true;
        } else { 
        System.out.println("Please enter a valid response:");
        return false;
    }
}

public static Scanner getKeyboardInput() {
    return keyboardInput;
}

public static void setKeyboardInput(Scanner keyboardInput) {
    InitialInput.keyboardInput = keyboardInput;
}

@Override
public String toString() {
    return "InitialInput []";
}

}








