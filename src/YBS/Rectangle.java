package YBS;

public class Rectangle extends Shape {
    public Rectangle() {

    }

    @Override
    public int getArea(int width, int length) {
        return width * length;
    }

}
