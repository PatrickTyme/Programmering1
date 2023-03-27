package Exercise5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
        Circle circle = new Circle(50, 80, 40);
        pane.getChildren().add(circle);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLUE);
        circle.setStrokeWidth(3);

        Circle circle2 = new Circle(130, 80, 40);
        pane.getChildren().add(circle2);
        circle2.setFill(Color.TRANSPARENT);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeWidth(3);

        Circle circle3 = new Circle(210, 80, 40);
        pane.getChildren().add(circle3);
        circle3.setFill(Color.TRANSPARENT);
        circle3.setStroke(Color.RED);
        circle3.setStrokeWidth(3);

        Circle circle4 = new Circle(90, 120, 40);
        pane.getChildren().add(circle4);
        circle4.setFill(Color.TRANSPARENT);
        circle4.setStroke(Color.YELLOW);
        circle4.setStrokeWidth(3);

        Circle circle5 = new Circle(170, 120, 40);
        pane.getChildren().add(circle5);
        circle5.setFill(Color.TRANSPARENT);
        circle5.setStroke(Color.GREEN);
        circle5.setStrokeWidth(3);
    }
}
