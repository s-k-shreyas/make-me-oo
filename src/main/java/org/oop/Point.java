package org.oop;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point dest) {
        if(x == dest.x && y == dest.y)
            return 0;
        else if(y == dest.y)
            return Math.abs(x- dest.x);
        else if(x == dest.x)
            return Math.abs(y - dest.y);
        return -1;
    }
}
