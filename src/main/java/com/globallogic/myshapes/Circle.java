package com.globallogic.myshapes;

public class Circle extends Shape {

    private final double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);

        this.radius = radius;
    }

    @Override
    double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "radius= " + getRadius();
    }

    public double getRadius() {
        return radius;
    }
}
