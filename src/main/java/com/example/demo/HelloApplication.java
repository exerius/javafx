package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(100.0, 100.0,
                50.0, 150.0,
                100.0, 200.0,
                200.0, 200.0,
                250.0, 150.0,
                200.0, 100.0);
        Arc arc =  new Arc(50, 250, 30, 40, 90, 100);
      //  arc.setFill(null);
        arc.setType(ArcType.CHORD);
        Path star = new Path();
        star.getElements().addAll(new MoveTo(150, 0),
                new LineTo(120, 30),
                new LineTo(180, 30),
                new ClosePath(),
                new MoveTo(120, 10),
                new LineTo(180, 10),
                new LineTo(150, 40),
                new ClosePath());
        star.setFillRule(FillRule.NON_ZERO);
        star.setFill(Color.YELLOW);
        Pane pane =  new Pane(new Circle(300,100,50),
                new Line(-100,-100,300,300),
                new Rectangle(30,30,70,70), polygon, arc,star
               );

        Scene scene = new Scene(pane, 350, 350);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}