package YBS;

public class App {
    public static void main(String[] args) {
        var shape = new Shape();

        var area = shape.getArea(8, 10);

        System.out.println("Area: " + area);

        var rec = new Rectangle();

        area = rec.getArea(520000, 250000);

        System.out.println("Area: " + area);
    }
}
