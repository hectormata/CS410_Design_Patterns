package edu.umb.cs.cs410.hw03;
/*
 * Hector Mata
 * CS 410
 * Homework 3
 * 11/09/2017
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public float distance(Point p2) {
        int dx = x - p2.x;
        int dy = y - p2.y;
        float dist = (float)Math.sqrt(dx * dx + dy * dy);
        return dist;
    }
}
