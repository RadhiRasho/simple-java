package StandardLib;

public class Stderr {
    public static void stdError() {
        System.err.print("Hello, "); // ! No newline at end
        System.err.println("World!"); // ! With newline at end

        // ! Formatted string
        System.err.printf("Int: %d, String: %s, UpperHex: %X", 23, "Test", 42);
    }
}
