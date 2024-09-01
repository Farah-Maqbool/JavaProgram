import java.util.ArrayList;

class Shape{
    void calculateArea(){
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    float radius;

    Circle(float radius){
        this.radius = radius;
    }

    @Override
    void calculateArea(){
        System.out.println("Area of Circle= "+(3.14*(radius*radius)));
    }

}
class Rectangle extends Shape{
    float length, width;

    Rectangle(float length, float width){
        this.width = width;
        this.length = length;
    }

    @Override
    void calculateArea(){
        System.out.println("Area of Rectangle= "+(length*width));
    }

}
class Triangle extends Shape{
    float base, height;

    Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea(){
        System.out.println("Area of Rectangle= "+(0.5*(base*height)));
    }
}

public class BasicShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(10,5);
        Shape rectangle = new Rectangle(8,4);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(rectangle);

        for (Shape shape : shapes){
            shape.calculateArea();
        }
    }
}
