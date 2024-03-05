package StandardLib;

public class App {
    public static void main(String[] args) throws Exception {
        // ! Reading Bytes From Standard Input Stream
        // ReadBytes.readBytes();

        // ! Prompting user using Scanner as a wrapper for easier access and using the
        // ! Standard Output and Input Streams
        // UserInput.userInput(); // ? Users Scanner class wrapper around Input Stream
        // ? Scanner does a lot of post-processing and there for is slower
        // UserInput.userInputViaBuffer(); // ? Uses a Buffered Reader with Input Stream
        // ? Buffered Reader is preferred for large input streams

        // ! Prompting user using the methods of the Scanner like nextBoolean()...
        // ScannerApp.scanner();

        // ! Use Console to ask for a password where the keys the user inputs aren't
        // ! logged
        // GetPassword.getPass();

        // ! Read Standard Input Stream lines until there isn't anymore
        // ReadLines.readLines();

        // ! Write to Standard Output Stream
        // Stdout.stdOut();

        // ! Write to Standard Error Stream
        // ! Can be redirected to a specific file using the following command when
        // ! running the App: java Your/File.java > output.txt 2> err.txt;
        // Stderr.stdError();
    }
}
