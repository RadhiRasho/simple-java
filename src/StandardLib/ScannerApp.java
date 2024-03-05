package StandardLib;

import java.util.Scanner;

public class ScannerApp {
    public static void scanner() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Gender: ");
        char gender = sc.next().charAt(0);

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Mobile Number: ");
        long mobileNo = sc.nextLong();

        System.out.print("CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Dev: ");
        boolean dev = sc.nextBoolean(); // true | false values only

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Dev: " + dev);

        sc.close();
    }
}
