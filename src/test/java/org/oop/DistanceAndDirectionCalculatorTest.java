package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.oop.DistanceAndDirectionCalculator.direction;

public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double distance = origin.distance(origin);

        assertEquals(0, distance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double distance = origin.distance(point1);
        double distance1 = origin.distance(point2);

        assertEquals(1, distance);
        assertEquals(1, distance1);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double distance = point1.distance(point2);

        assertEquals(2, distance);
    }

    @Test
    void shouldReturnDistanceBetweenTwoPointsWhenPointsAreInDifferentAxis()
    {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(5, 6);

        double distance = point1.distance(point2);

        assertEquals(5,distance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double direction = origin.direction(point1);
        double direction1 = origin.direction(point2);

        assertEquals(0, direction);
        assertEquals(0, direction1);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        double direction = origin.direction(point1);
        double direction1 = origin.direction(point2);

        assertEquals(Math.PI, direction);
        assertEquals(Math.PI, direction1);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        double direction = origin.direction(point1);
        double direction1 = origin.direction(point2);

        assertEquals(Math.PI / 2, direction);
        assertEquals(Math.PI / 2, direction1);
    }

}
