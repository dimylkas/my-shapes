package com.globallogic.myshapes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        Shape c1 = new Circle("GREEN", 10);
        Shape r1 = new Rectangle("RED", 11, 22);
        Shape t1 = new Triangle("BLACK", 5, 5, 5);

        Shape[] myShapes = new Shape[3];
        myShapes[0] = c1;
        myShapes[1] = r1;
        myShapes[2] = t1;
         */

        Shape[] myShapes = {
                new Circle("GREY", 20),
                new Circle("GREEN", 10),
                new Rectangle("PEPPERS", 77, 88),
                new Rectangle("HOT", 33, 44),
                new Rectangle("RED", 11, 22),
                new Rectangle("CHILI", 55, 66),
                new Triangle("STAR", 6, 7, 8),
                new Triangle("BLACK", 5, 5, 5),
        };


        Arrays.sort(myShapes);

        for (Shape s : myShapes) {
            s.draw();
        }

        System.out.println("---------------------------");

        Rectangle[] myRectangles = {
                new Rectangle("PEPPERS", 77, 88),
                new Rectangle("HOT", 33, 44),
                new Rectangle("RED", 11, 22),
                new Rectangle("CHILI", 55, 66),
        };

        Arrays.sort(myRectangles, new ShapeComparator());

        for (Rectangle r : myRectangles) {
            r.draw();
        }

        System.out.println("---------------------------");

        System.out.println("sumArea = " + sumArea(myShapes));
        System.out.println("getNumOfShapes = " + Shape.getNumOfShapes());
    }

    static double sumArea(Shape[] shapes) {
        double area = 0.0;

        for (Shape s : shapes) {
            area += s.calcArea();
        }

        return area;
    }
}
