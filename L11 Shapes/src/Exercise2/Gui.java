package Exercise2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

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
        Rectangle rektangel = new Rectangle(100, 40, 200, 75);
        pane.getChildren().add(rektangel);
        rektangel.setFill(Color.BLUE);

        Text text = new Text(120, 90, "PATRICK");
        text.setFill(Color.RED);
        pane.getChildren().add(text);
        text.setFont(Font.font("Comic Sans MS", FontPosture.REGULAR, 40));



    }
}
