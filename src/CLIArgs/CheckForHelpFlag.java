package CLIArgs;

public class CheckForHelpFlag {
    public static void checkHelpFlag(String[] args) {
        for (String arg : args) {
            if (arg.equals("--help") || arg.equals("-h")) {
                System.out.println("Help argument (--help | -h) detected");
                System.exit(0);
            }
        }
    }
}
