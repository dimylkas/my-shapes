package com.globallogic.myshapes;

public class Triangle extends Shape{
    private final double a;
    private final double b;
    private final double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    double calcArea() {
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    @Override
    public String toString() {
        return "a= " + getA() + ", b= " + getB() + ", c= " + getC();
    }
}
