package StandardLib;

import java.util.Scanner;

public class UserInput {
    public static void userInput() {
        // Create a scanner to wrap the standard input stream for easier access
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter string and press enter
        System.out.print("Enter Your Name: ");
        System.out.println("Hello, " + sc.nextLine());

        // Use the Scanner to then get numeric value from the user.
        System.out.print("Enter and integer: ");
        System.out.println("Your number plus 1 is: " + (sc.nextInt() + 1));

        // Close Scanner After finishing
        sc.close();
    }
}
