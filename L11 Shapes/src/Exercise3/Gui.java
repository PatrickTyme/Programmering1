package Exercise3;

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
        Circle circle = new Circle(200, 200, 60);
        pane.getChildren().add(circle);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Circle circle2 = new Circle(180, 180, 8);
        pane.getChildren().add(circle2);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);

        Circle circle3 = new Circle(220, 180, 8);
        pane.getChildren().add(circle3);
        circle3.setFill(Color.WHITE);
        circle3.setStroke(Color.BLACK);

        Line line = new Line(175, 220, 225, 220);
        pane.getChildren().add(line);
    }
}
