package edu.umb.cs.cs410.hw03;
/*
 * Hector Mata
 * CS 410
 * Homework 3
 * 11/09/2017
 */

import java.util.ArrayList;


public class RectangleAreaCalc implements AreaCalculator {

    @Override
    public float getArea(ArrayList<Point> points) {

        Point p1 = points.get(0);
        Point p2 = points.get(1);
        Point p3 = points.get(2);
        float length = p1.distance(p2);
        float width = p1.distance(p3);
        return length * width;
    }
}
