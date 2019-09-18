package com.globallogic.myshapes;

public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);

        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double calcArea() {
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "width= " + getWidth() + ", height=" + getHeight();
    }
}
