package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceAndDirectionCalculatorTest {

    @Test
    void shouldReturnZeroForDistanceBetweenSamePoint() {
        Point origin = new Point(0, 0);

        double distance = origin.findDistance(origin);

        assertEquals(0, distance);
    }

    @Test
    void shouldReturnOneForDistanceBetweenOriginAndPointOnUnitCircle() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double distance = origin.findDistance(point1);
        double distance1 = origin.findDistance(point2);

        assertEquals(1, distance);
        assertEquals(1, distance1);
    }

    @Test
    void shouldReturnTwoForDistanceBetweenPointsOnOppositeUnitCircle() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double distance = point1.findDistance(point2);

        assertEquals(2, distance);
    }

    @Test
    void shouldReturnDistanceBetweenTwoPointsWhenPointsAreInDifferentAxis() {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(5, 6);

        double distance = point1.findDistance(point2);

        assertEquals(5, distance);
    }

    @Test
    void shouldReturnZeroRadiansIfXIsInPositiveDirection() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double direction = origin.findDirection(point1);
        double direction1 = origin.findDirection(point2);

        assertEquals(0, direction);
        assertEquals(0, direction1);
    }

    @Test
    void shouldReturnPiRadiansIfDirectionMeasuredBetweenOriginAndPointOnNegativeXAxis() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        double direction = origin.findDirection(point1);
        double direction1 = origin.findDirection(point2);

        assertEquals(Math.PI, direction);
        assertEquals(Math.PI, direction1);
    }

    @Test
    void shouldReturnHalfPiRadiansIfDirectionMeasuredBetweenOriginAndPointOnYAxis() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        double direction = origin.findDirection(point1);
        double direction1 = origin.findDirection(point2);

        assertEquals(Math.PI / 2, direction);
        assertEquals(Math.PI / 2, direction1);
    }

    @Test
    void shouldReturnThreePiByTwoRadianIfDirectionMeasuredBetweenOriginAnfPointInNegativeYAxis()
    {
        Point origin = new Point(0, 0);
        Point point = new Point(0, -2);

        double direction = origin.findDirection(point);

        assertEquals(3 * Math.PI / 2, direction);
    }

    @Test
    void shouldReturnDirectionBetweenPointsOtherThanOnXAndYAxis() {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(5, 7);

        double direction = point1.findDirection(point2);

        assertEquals(Math.PI / 4, direction);
    }
}
