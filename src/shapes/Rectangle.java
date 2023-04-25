package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static int perimeter(int length, int width) {
        return 2 * (length + width);
    }

    public static int area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println(perimeter(5,7));
        System.out.println(area(5,7));
    }
}
