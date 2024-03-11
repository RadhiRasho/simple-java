package VarScoping;

public class App {
    static int x = 11;
    private int y = 33;

    public void method1(int x) {
        App t = new App();
        t.x = 22;
        y = 44;

        System.out.println("App.x: " + App.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String args[]) {
        App t = new App();
        t.method1(5);

        {
            // The variable x has scope within
            // brackets
            int someVar = 10;
            System.out.println(someVar);
        }

        // Uncommenting below line would produce
        // error since variable x is out of scope.

        // ! System.out.println(someVar); // ! someVar is only available through that
        // ! braces above (block of code)

        for (int someVar = 0; someVar < 4; someVar++) {
            System.out.println(someVar);
        }

        // Will produce error
        // ! System.out.println(someVar); // ! Same sentiment as above only block scoped
        // ! to for loop

        int newXSomeVar;
        for (newXSomeVar = 0; newXSomeVar < 4; newXSomeVar++) {
            System.out.println(newXSomeVar);
        }

        System.out.println(newXSomeVar); // * this case it's not block scoped
    }
}