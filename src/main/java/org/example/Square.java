package org.example;
public class Square extends Rectangle {
    private double side;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
