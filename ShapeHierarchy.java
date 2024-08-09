//. Shape Hierarchy:
// Create a class named Shape with a method to calculate area (abstract).
// Create subclasses for Circle, Rectangle, and Triangle inheriting from Shape.
// Implement the calculateArea() method in each subclass accordingly.
// Create an array of Shape objects and calculate the total area of all shapes
class Shape{
    void calculateArea(){
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    void calculateArea(){
        System.out.println("Circle Area: "+(3.14*(radius/2)));
    }
}
class Rectangle extends Shape{
    double length, width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    void calculateArea(){
        System.out.println("Rectangle Area: "+(length*width));
    }
}
class Triangle extends Shape{
    double base, hieght;
    Triangle(double base, double hieght){
        this.base = base;
        this.hieght = hieght;
    }
    @Override
    void calculateArea(){
        System.out.println("Triangle Area: "+(base*hieght)/2);
    }
}
public class ShapeHierarchy {
    public static void main(String[]args){
        Shape circle = new Circle(34);
        Shape rectangle = new Rectangle(14.5,32.4);
        Shape triangle = new Triangle(12,23.4);
        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();
    }
}
