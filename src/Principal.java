
import com.prototype.shapes.Circle;
import com.prototype.shapes.Rectangle;
import com.prototype.shapes.Shape;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("blue");
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes sao objetos diferentes");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": E eles sao identicos");
                } else {
                    System.out.println(i + ": Mas eles nao sao identicos");
                }
            } else {
                System.out.println(i + ": Objetos Shape são os mesmos");
            }
        }
    }
}
