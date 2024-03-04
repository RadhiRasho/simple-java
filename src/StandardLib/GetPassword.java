package StandardLib;

import java.io.Console;

public class GetPassword {
    public static void getPass() {
        Console console = System.console();

        char[] password = console.readPassword("Enter the secret password: ");

        // Now do something with the password
        // Turn into all Capital Letters
        String PASS = new String(password).toUpperCase();
        System.out.println("pass: " + PASS);
    }
}
