package Opgave1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        this.initContent(pane);
        Scene scene = new Scene(pane, 400, 400);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(Pane pane) {
        Circle circle = new Circle(50, 50, 30);
        pane.getChildren().add(circle);
        circle.setFill(Color.CORAL);
        circle.setStroke(Color.BLACK);

        Rectangle rektangel = new Rectangle(100, 40, 75, 25);
        pane.getChildren().add(rektangel);
        rektangel.setFill(Color.BLACK);

        Line line = new Line(150, 100, 100, 70);
        pane.getChildren().add(line);
    }
}
