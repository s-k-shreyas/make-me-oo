package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point destination) {
        if(x == destination.x && y == destination.y)
            return 0;
        else if(y == destination.y)
            return Math.abs(x- destination.x);
        else if(x == destination.x)
            return Math.abs(y - destination.y);
        else
            return Math.sqrt(Math.pow(x - destination.x, 2) + Math.pow(y - destination.y, 2));
    }

    public double direction(Point destination) {
        if(y == destination.y && destination.x > 0)
            return 0;
        else if(y == destination.y && destination.x < 0)
            return Math.PI;
        else if(x == destination.x && destination.y > 0)
            return Math.PI/2;
        else if(x == destination.x && destination.y < 0)
            return 3 * Math.PI/2;
        else
            return Math.atan2(Math.abs(y - destination.y), Math.abs(x - destination.x));
    }
}
