package StandardLib;

import java.util.Scanner;

public class ReadLines {
    public static void readLines() {
        Scanner sc = new Scanner(System.in);

        // Read and print out each line.
        while (sc.hasNextLine()) {
            String inputLine = sc.nextLine();
            System.out.println(inputLine);
        }

        sc.close();
    }
}
