package CLIArgs;

public class PrintCommandLineArgs {
    public static void printArgs(String[] args) {
        // Iterate through each string in the args array
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
