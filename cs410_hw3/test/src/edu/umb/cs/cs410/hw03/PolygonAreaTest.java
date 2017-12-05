package edu.umb.cs.cs410.hw03;
/*
 * Hector Mata
 * CS 410
 * Homework 3
 * 11/09/2017
 */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import java.util.ArrayList;


public class PolygonAreaTest {

    //public static void main(String[] args) {
    @Test
    public void Polygon1() {

        ArrayList<Point> al = new ArrayList<Point>();
        al.add(new Point(1,1));
        al.add(new Point(4,1));
        al.add(new Point(1,5));
        Polygon p = new Polygon(al, new TriangleAreaCalc());
        assertEquals(p.getArea(), 6, 0);
        //System.out.println("The area of the triangle is " + p.getArea());
        p.addPoint(new Point(4,5));
        p.setAreaCalc(new RectangleAreaCalc());
        assertEquals(p.getArea(), 12, 0);
        //System.out.println("The area of the rectangle is " + p.getArea());

    }
    @Test
    public void Polygon2() {

        ArrayList<Point> al2 = new ArrayList<Point>();
        al2.add(new Point(2,1));
        al2.add(new Point(5,1));
        al2.add(new Point(2,5));
        Polygon p = new Polygon(al2, new TriangleAreaCalc());
        assertEquals(p.getArea(), 6, 0);
        //System.out.println("The area of the triangle is " + p.getArea());
        p.addPoint(new Point(5,5));
        p.setAreaCalc(new RectangleAreaCalc());
        assertEquals(p.getArea(), 12, 0);
        //System.out.println("The area of the rectangle is " + p.getArea());
    }

    @Test
    public void Polygon3() {

        ArrayList<Point> al3 = new ArrayList<Point>();
        al3.add(new Point(0,3));
        al3.add(new Point(1,3));
        al3.add(new Point(5,7));
        Polygon p = new Polygon(al3, new TriangleAreaCalc());
        assertEquals(p.getArea(), 1.9999992847442627, 0);
        //System.out.println("The area of the triangle is " + p.getArea());
        p.addPoint(new Point(6,6));
        p.setAreaCalc(new RectangleAreaCalc());
        assertEquals(p.getArea(), 6.4031243324279785, 0);
        //System.out.println("The area of the rectangle is " + p.getArea());
    }

    @Test
    public void Polygon4() {

        ArrayList<Point> al4 = new ArrayList<Point>();
        al4.add(new Point(10,10));
        al4.add(new Point(5,2));
        al4.add(new Point(2,1));
        Polygon p = new Polygon(al4, new TriangleAreaCalc());
        assertEquals(p.getArea(), 9.499985694885254, 0);
        //System.out.println("The area of the triangle is " + p.getArea());
        p.addPoint(new Point(3,4));
        p.setAreaCalc(new RectangleAreaCalc());
        assertEquals(p.getArea(), 113.60017395019531, 0);
        //System.out.println("The area of the rectangle is " + p.getArea());

    }
}
