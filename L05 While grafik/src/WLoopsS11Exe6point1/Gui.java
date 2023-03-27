package WLoopsS11Exe6point1;

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
			int y1 = 180; // start point: (x1,y1)
			int y2 = 180; // end point: (x2,y2)
			int x1 = 10;
			int x2 = 180;
		gc.strokeLine(x1, y1, x2, y2);
		for (int i = 0; i < 16; i++) {
			if (i % 5 == 0) {
				int x = 10 + i * 10;
				gc.strokeLine(x, y1+6, x, y1-6);
				gc.strokeText("0", 8, 192);
				gc.strokeText("5", 58, 192);
				gc.strokeText("10", 108, 192);
				gc.strokeText("15", 158, 192);

			}
				int x = 10 + i * 10;
				gc.strokeLine(x, y1+3, x, y1-3);
			}

		}
	}
