package CLIArgs;

public class CheckForCommandLineArgs {
    public static void checkForCliArgs(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("No Arguments were provided");
        }
    }
}
