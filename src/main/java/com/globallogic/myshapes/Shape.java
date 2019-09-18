package com.globallogic.myshapes;

abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    private static int numOfShapes = 0;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;

        numOfShapes += 1;
    }

    public static int getNumOfShapes() {
        return numOfShapes;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    abstract double calcArea();

    @Override
    public String toString() {
        return "Shape, color is: " + shapeColor;
    }

    @Override
    public void draw() {
        String className = this.getClass().getSimpleName();

        System.out.println("This is " + className + ", color: " + getShapeColor() + ", " + toString() + " Shape area is:" + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape s = (Shape) o;

        if (calcArea() > s.calcArea()) return 1;
        if (calcArea() < s.calcArea()) return -1;
        return 0;
    }
}
