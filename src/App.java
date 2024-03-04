import java.util.Arrays;

// THE PRIMITIVES AND BASICS

public class App {
    public static void main(String[] args) throws Exception {
        // Creating and initializing custom character
        char a = 'G';

        // Integer data type is generally
        // used for numeric values
        int i = 89;

        // use byte and short
        // if memory is a constraint
        byte b = 4;

        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;

        short s = 56;

        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;

        // by default fraction value
        // is double in java
        double d = 4.355453532;

        // for float use 'f' as suffix as standard
        float f = 4.7333434f;

        // need to hold big range of numbers then we need
        // this data type
        long l = 12121;

        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);

        System.out.println("PRIMITIVE DATA TYPES\n");
        int x = 10;
        int y = x;
        System.out.print("Initially: ");
        System.out.println("x = " + x + ", y = " + y);

        // Here the change in the value of y
        // will not affect the value of x
        y = 30;

        System.out.print("After changing y to 30: ");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println(
                "**Only value of y is affected here "
                        + "because of Primitive Data Type\n");

        System.out.println("REFERENCE DATA TYPES\n");
        int[] c = { 10, 20, 30, 40 };

        // Here complete reference of c is copied to d
        // and both point to same memory in Heap
        int[] dArray = c;

        System.out.println("Initially");
        System.out.println("Array c: "
                + Arrays.toString(c));
        System.out.println("Array d: "
                + Arrays.toString(dArray));

        // Modifying the value at
        // index 1 to 50 in array d
        System.out.println("\nModifying the value at "
                + "index 1 to 50 in array d\n");
        dArray[1] = 50;

        System.out.println("After modification");
        System.out.println("Array c: "
                + Arrays.toString(c));
        System.out.println("Array d: "
                + Arrays.toString(dArray));
        System.out.println(
                "**Here value of c[1] is also affected "
                        + "because of Reference Data Type\n");
    }
}
