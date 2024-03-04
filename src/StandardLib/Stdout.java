package StandardLib;

public class Stdout {
    public static void stdOut() {
        System.out.println("Hello, "); // No newline at end
        System.out.println("World!"); // with newline at end

        // Formatted String.
        System.out.printf("Int: %d, String: %s, Upper Hex: %X, Lower Hex: %x", 23, "Test", 42, 104);
    }
}
