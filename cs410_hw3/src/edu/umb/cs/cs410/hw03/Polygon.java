package edu.umb.cs.cs410.hw03;
/*
 * Hector Mata
 * CS 410
 * Homework 3
 * 11/09/2017
 */
import java.util.ArrayList;

public class Polygon {
    private ArrayList<Point> points;
    private AreaCalculator areaCalc;

    public Polygon(ArrayList<Point> points, AreaCalculator areaCalc) {
        this.points = points;
        this.areaCalc = areaCalc;
    }

    public void setAreaCalc(AreaCalculator calc) {
        this.areaCalc = calc;
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public float getArea() {
        return areaCalc.getArea(points);
    }
}
