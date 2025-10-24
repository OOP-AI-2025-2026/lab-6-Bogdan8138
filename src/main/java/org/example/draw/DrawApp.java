package org.example.draw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class DrawApp extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Draw (Абстрактні класи)");
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext g = canvas.getGraphicsContext2D();

        List<Shape> shapes = Arrays.asList(
                new CircleShape(120, 120, 60),
                new RectShape(200, 50, 120, 90)
        );
        shapes.forEach(s -> s.draw(g));

        stage.setScene(new Scene(new StackPane(canvas), 420, 320));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
