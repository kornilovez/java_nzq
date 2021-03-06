package ru.stqa.pft.sandbox;

public class Point {

    public double a;
    public double b;

    public Point(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double distance(Point p) {

        return Math.sqrt(Math.pow((this.b - p.b), 2) + (Math.pow((this.a - p.a), 2)));
    }

}
