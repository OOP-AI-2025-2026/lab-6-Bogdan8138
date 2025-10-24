package org.example.draw;

import javafx.scene.canvas.GraphicsContext;

public class RectShape extends Shape {
    private double x, y, w, h;

    public RectShape(double x, double y, double w, double h) {
        this.x = x; this.y = y; this.w = w; this.h = h;
    }

    @Override
    public void draw(GraphicsContext g) {
        g.strokeRect(x, y, w, h);
    }
}
