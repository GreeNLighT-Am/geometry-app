
import org.greenlight.geometry.library.shapes.Circle;
import org.greenlight.geometry.library.shapes.Rectangle;
import org.greenlight.geometry.library.shapes.Shape;
import org.greenlight.geometry.library.shapes.Triangle;
import org.greenlight.geometry.utils.GeometryUtils;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle(3.0, 4.0, 5.0)
        );

        for (Shape shape : shapes) {
            System.out.printf("%s -> Площадь: %.2f, Периметр: %.2f%n",
                    shape.getClass().getSimpleName(),
                    shape.getArea(),
                    shape.getPerimeter());
        }

        System.out.println(GeometryUtils.compareByArea(new Circle(3.0), new Circle(4.0)));
    }
}