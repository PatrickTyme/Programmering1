package WLoopsS13Exa8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

	@Override
	public void start(Stage stage) {
		GridPane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Loops");
		stage.setScene(scene);
		stage.show();
	}

	private GridPane initContent() {
		GridPane pane = new GridPane();
		Canvas canvas = new Canvas(200, 200);
		pane.add(canvas, 0, 0);
		this.drawShapes(canvas.getGraphicsContext2D());
		return pane;
	}

	// ------------------------------------------------------------------------

	private void drawShapes(GraphicsContext gc) {
			int x = 100;
			int y = 100;
			int r1 = 25;
			int r2 = 20;
			int r3 = 6;
			gc.strokeOval(x - r1, y - r1, 2 * r1, 2 * r1);
			gc.strokeOval(x - r2, y - r2, 2 * r2, 2 * r2);
			gc.fillOval(x - r3, y - r1 - r3 / 2, 2 * r3, r3);
		}
	}
