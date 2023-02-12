package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Second extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Circle circle1 = new Circle(50,50, 30, Color.YELLOW);
        Circle circle2 = new Circle(90,50, 30, Color.BLUE);
        Shape intersection =  Shape.intersect(circle1, circle2);
        intersection.setFill(Color.GREEN);
        Circle circle3 = new Circle(50, 120, 30, Color.BLUE);
        Circle circle4 = new Circle(90, 120, 30, Color.YELLOW);
        Shape union = Shape.union(circle4, circle3);
        union.setFill(Color.GREEN);
        Circle circle5 = new Circle(50, 190, 30, Color.BLUE);
        Circle circle6 = new Circle(90, 190, 30, Color.YELLOW);
        Shape substraction = Shape.subtract(circle5, circle6);
        substraction.setFill(Color.GREEN);
        Text text = new Text(50, 250,"Gagarin Yaroslav");
        text.setFill(Color.RED);
        text.setUnderline(true);
        text.setFont(Font.font("Verdana", 30));
        Image image = new Image("Flag.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(260);
        imageView.setFitHeight(60);
        imageView.setFitWidth(90);
        Glow glow = new Glow();
        glow.setLevel(0.9);
        imageView.setEffect(glow);
        Ellipse ellipse = new Ellipse(200,  50, 70, 30);
        ellipse.setEffect(new Reflection());
        Rectangle rectangle = new Rectangle(200, 100, 40, 70);
        rectangle.setEffect(new MotionBlur());
        Circle circle = new Circle(200, 200, 30);
        Lighting lighting = new Lighting();
        lighting.setLight(new Light.Distant());
        lighting.setSurfaceScale(6);
        circle.setEffect(lighting);
        circle.setFill(Color.RED);
        Pane pane = new Pane(circle1, circle2, intersection, circle3, circle4, union, circle6, circle5, substraction,
                text, imageView, ellipse, rectangle, circle);
        Scene scene = new Scene(pane, 350, 350);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
