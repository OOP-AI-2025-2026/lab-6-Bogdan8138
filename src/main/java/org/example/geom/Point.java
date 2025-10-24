package org.example.geom;

public class Point implements Movable {
    private double x;
    private double y;

    public Point() {}
    public Point(double x, double y) { this.x = x; this.y = y; }

    @Override
    public void setX(double x) { this.x = x; }

    @Override
    public void setY(double y) { this.y = y; }

    @Override
    public double getX() { return x; }

    @Override
    public double getY() { return y; }

    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(1.5, -2);
        System.out.println("Start: " + p);
        p.moveTo(10, 20);
        System.out.println("MoveTo: " + p);
        p.setX(-3.3); p.setY(7.7);
        System.out.println("SetXY: " + p);
    }
}
