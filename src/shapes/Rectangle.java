package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static int getPerimeter(int length, int width) {
        return 2 * (length + width);
    }

    public static int getArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println(getPerimeter(5,7));
        System.out.println(getArea(5,7));
    }
}
