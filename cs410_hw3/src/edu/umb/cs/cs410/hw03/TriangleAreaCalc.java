package edu.umb.cs.cs410.hw03;
/*
 * Hector Mata
 * CS 410
 * Homework 3
 * 11/09/2017
 */
import java.util.ArrayList;

public class TriangleAreaCalc implements AreaCalculator {

    @Override
    public float getArea(ArrayList<Point> points) {

        Point p1 = points.get(0);
        Point p2 = points.get(1);
        Point p3 = points.get(2);
        float a = p1.distance(p2);
        float b = p2.distance(p3);
        float c = p3.distance(p1);
        float s = (a + b + c) / 2;
        float area = (float)Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
