package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double findDistance(Point destination) {
        if (x == destination.x && y == destination.y)
            return 0;
        else if (y == destination.y)
            return Math.abs(x - destination.x);
        else if (x == destination.x)
            return Math.abs(y - destination.y);
        else
            return Math.sqrt(Math.pow(x - destination.x, 2) + Math.pow(y - destination.y, 2));
    }

    public double findDirection(Point destination) {
        if (y == destination.y && destination.x > x)
            return 0;
        else if (y == destination.y && destination.x < x)
            return Math.PI;
        else if (x == destination.x && destination.y > y)
            return Math.PI / 2;
        else if (x == destination.x && destination.y < y)
            return 3 * Math.PI / 2;
        else
            return Math.atan2(Math.abs(y - destination.y), Math.abs(x - destination.x));
    }
}
