package org.example;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        shapes[1] = new Rectangle(1.0, 2.0, "RED", false);  // Upcast
        shapes[2] = new Square(6.6); // Upcast

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area is " + shape.getArea());
            System.out.println("Perimeter is " + shape.getPerimeter());
            System.out.println();
        }
    }
}