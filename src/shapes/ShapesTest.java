package shapes;

import org.w3c.dom.css.Rect;

import static shapes.Rectangle.getArea;
import static shapes.Rectangle.getPerimeter;
import static shapes.Square.getArea;
import static shapes.Square.getPerimeter;


public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(getPerimeter(box1.length, box1.width));
        System.out.println(getArea(box1.length, box1.width));

        Rectangle box2 = new Square(5);
        System.out.println(getPerimeter(box2.length));
        System.out.println(getArea(box2.length));
    }
}
