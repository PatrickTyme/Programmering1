package Opgave3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
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
        Circle sun = new Circle(300, 70, 40);
        pane.getChildren().add(sun);
        sun.setFill(Color.YELLOW);
        sun.setStroke(Color.BLACK);

        Rectangle house = new Rectangle(50, 200, 120, 120);
        pane.getChildren().add(house);
        house.setFill(Color.RED);

        Rectangle window = new Rectangle(75, 220, 40, 40);
        pane.getChildren().add(window);
        window.setFill(Color.BLACK);

        Rectangle chimney = new Rectangle(135, 120, 25, 60);
        pane.getChildren().add(chimney);
        chimney.setFill(Color.GRAY);

        Polygon roof = new Polygon(30, 200, 110, 120, 190, 200);
        pane.getChildren().add(roof);
        roof.setFill(Color.FORESTGREEN);

        Line ground = new Line(380, 320, 20, 320);
        pane.getChildren().add(ground);

        Rectangle treeLog = new Rectangle(270, 220, 40, 100);
        pane.getChildren().add(treeLog);
        treeLog.setFill(Color.BROWN);

        Circle leaf1 = new Circle(270, 220, 25);
        pane.getChildren().add(leaf1);
        leaf1.setFill(Color.FORESTGREEN);
        leaf1.setStroke(Color.BLACK);

        Circle leaf2 = new Circle(260, 200, 25);
        pane.getChildren().add(leaf2);
        leaf2.setFill(Color.FORESTGREEN);
        leaf2.setStroke(Color.BLACK);

        Circle leaf3 = new Circle(290, 180, 25);
        pane.getChildren().add(leaf3);
        leaf3.setFill(Color.FORESTGREEN);
        leaf3.setStroke(Color.BLACK);

        Circle leaf4 = new Circle(310, 200, 25);
        pane.getChildren().add(leaf4);
        leaf4.setFill(Color.FORESTGREEN);
        leaf4.setStroke(Color.BLACK);

        Circle leaf5 = new Circle(310, 220, 25);
        pane.getChildren().add(leaf5);
        leaf5.setFill(Color.FORESTGREEN);
        leaf5.setStroke(Color.BLACK);

        Circle leaf6 = new Circle(285, 220, 25);
        pane.getChildren().add(leaf6);
        leaf6.setFill(Color.FORESTGREEN);
        leaf6.setStroke(Color.BLACK);
    }
}
