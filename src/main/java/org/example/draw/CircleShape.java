package org.example.draw;

import javafx.scene.canvas.GraphicsContext;

public class CircleShape extends Shape {
    private double x, y, r;

    public CircleShape(double x, double y, double r) {
        this.x = x; this.y = y; this.r = r;
    }

    @Override
    public void draw(GraphicsContext g) {
        g.strokeOval(x - r, y - r, 2*r, 2*r);
    }
}
