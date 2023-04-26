package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(3, 4);
        System.out.println("Rectangle area: " + myShape.getArea());
        System.out.println("Rectangle perimeter: " + myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println("Square area: " + myShape.getArea());
        System.out.println("Square perimeter: " + myShape.getPerimeter());

        Quadrilateral newQuad = new Square(3);
        System.out.println("Square area: " + newQuad.getArea());
        System.out.println("Square perimeter: " + newQuad.getPerimeter());
        newQuad.setLength(4);
        System.out.println("Square area: " + newQuad.getArea());
        System.out.println("Square perimeter: " + newQuad.getPerimeter());


        Square newSquare = new Square(4);
        System.out.println(newSquare.getLength());
        System.out.println(newSquare.getArea());
        newSquare.setLength(3);
        System.out.println(newSquare.getLength());
        System.out.println(newSquare.getArea());

    }
}
