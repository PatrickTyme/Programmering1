package Opgave.Opgave2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise2 extends Application {


    private final TextField txfNumber = new TextField();


    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise2");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private void initContent(GridPane pane) {
        // show or hide grid lines
        //pane.setGridLinesVisible(true);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("Number:");
        pane.add(lblName, 0, 0, 1, 2);


        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        pane.add(txfNumber, 1, 0, 1, 2);
        txfNumber.setPrefWidth(50);
        txfNumber.setText("0");


        // add a button to the pane (at col=1, row=1)
        Button btnInc = new Button("Inc");
        pane.add(btnInc, 2, 0);
        GridPane.setMargin(btnInc, new Insets(0, 10, 0, 10));

        Button btnDec = new Button("Dec");
        pane.add(btnDec, 2, 1);
        GridPane.setMargin(btnDec, new Insets(0, 10, 0, 10));

        btnInc.setOnAction(event -> this.incAction());

        btnDec.setOnAction(event -> this.decAction());
    }

    // ---------------------------------------------------
    // Method action

    private void incAction() {
        int inc = Integer.parseInt(txfNumber.getText()) + 1;
        txfNumber.setText(String.valueOf(inc));

    }
    private void decAction() {
        Integer dec = Integer.parseInt(txfNumber.getText()) - 1;
        txfNumber.setText(dec.toString());
    }
}



