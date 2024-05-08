import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("rectangle is drawn");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("circle is drawn");
    }
}

class DrawShapes {
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

public class ShapeMaker {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Circle());

        DrawShapes.drawShapes(rectangles);
        DrawShapes.drawShapes(circles);
    }
}