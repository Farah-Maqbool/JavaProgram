
class ShapeA{
    void calculateArea(){
        System.out.println("Shape");
    }
}
class CircleA extends Shape{
    double radius;
    CircleA(double radius){
        this.radius = radius;
    }
    @Override
    void calculateArea(){
        System.out.println("Circle Area: "+(3.14*(radius/2)));
    }
}
class RectangleA extends Shape{
    double length, width;
    RectangleA(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    void calculateArea(){
        System.out.println("Rectangle Area: "+(length*width));
    }
}
class TriangleA extends Shape{
    double base, hieght;
    TriangleA(double base, double hieght){
        this.base = base;
        this.hieght = hieght;
    }
    @Override
    void calculateArea(){
        System.out.println("Triangle Area: "+(base*hieght)/2);
    }
}
public class ShapeCalculatorA {
    public static void main(String[]args){
        Shape circle = new CircleA(34);
        Shape rectangle = new RectangleA(14.5,32.4);
        Shape triangle = new TriangleA(12,23.4);
        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();
    }
}

