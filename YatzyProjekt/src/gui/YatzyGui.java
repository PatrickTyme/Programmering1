package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.YatzyDice;

import java.util.ArrayList;

public class YatzyGui extends Application {
    private YatzyDice dice = new YatzyDice();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // txfValues shows the face values of the 5 dice.
    private final TextField[] txfValues = new TextField[5];
    // cbxHolds shows the hold status of the 5 dice.
    private final CheckBox[] cbxHolds = new CheckBox[5];
    // txfResults shows the obtained results.
    // For results not set yet, the possible result of 
    // the actual face values of the 5 dice are shown.
    private final ArrayList<TextField> txfResults = new ArrayList<>(15);
    // Shows points in sums, bonus and total.
    private final TextField txfSumSame = new TextField();
    private final TextField txfBonus = new TextField();
    private final TextField txfSumOther = new TextField();
    private final TextField txfTotal = new TextField();

    private final Label lblThrowCount = new Label();
    private final Button btnThrow = new Button(" Throw ");

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        dicePane.setGridLinesVisible(false);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        // add txfValues, chbHolds
        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i] = new TextField();
            dicePane.add(txfValues[i], i, 0);
            txfValues[i].setPrefWidth(75);
            txfValues[i].setPrefHeight(75);
            cbxHolds[i] = new CheckBox(" Hold ");
            dicePane.add(cbxHolds[i], i, 1);

        }

        // add lblThrowCount and btnThrow
        dicePane.add(btnThrow, 4, 2);
        btnThrow.setPrefHeight(25);
        btnThrow.setPrefWidth(75);
        dicePane.add(lblThrowCount, 3, 2);

        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        scorePane.setGridLinesVisible(false);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");

        // add labels for results
        Label numberLabel1 = new Label();
        numberLabel1.setText("1s");
        scorePane.add(numberLabel1, 0, 0);

        Label numberLabel2 = new Label();
        numberLabel2.setText("2s");
        scorePane.add(numberLabel2, 0, 1);

        Label numberLabel3 = new Label();
        numberLabel3.setText("3s");
        scorePane.add(numberLabel3, 0, 2);

        Label numberLabel4 = new Label();
        numberLabel4.setText("4s");
        scorePane.add(numberLabel4, 0, 3);

        Label numberLabel5 = new Label();
        numberLabel5.setText("5s");
        scorePane.add(numberLabel5, 0, 4);

        Label numberLabel6 = new Label();
        numberLabel6.setText("6s");
        scorePane.add(numberLabel6, 0, 5);

        // add txfResults,
        for (int i = 0; i < txfResults.size() + 1; i++) {
            if (i < 6) {
                txfResults.add(i, new TextField());
                scorePane.add(txfResults.get(i), 1, i);
                txfResults.get(i).setPrefWidth(50);
            } else if (i == 6) {
                Label bonus = new Label();
                bonus.setText("Bonus");
                scorePane.add(bonus, 2, 6);
                scorePane.add(txfBonus, 3, 6);
                txfBonus.setPrefWidth(50);
            } else {
                txfResults.add(i, new TextField());
                scorePane.add(txfResults.get(i), 1, i);
                txfResults.get(i).setPrefWidth(50);
            }
        }


        //
        // add labels and text fields for sums, bonus and total.
        // SumSame
        Label sum = new Label();
        sum.setText("Sum");
        scorePane.add(sum, 2, 5);
        scorePane.add(txfSumSame, 3, 5);
        txfSumSame.setPrefWidth(50);
        // Bonus


        //


        // -------------------------------------------------------------------------

        // Create an action method for btnThrow's action.
        // Hint: Create small helper methods to be used in the action method.
        //

        // -------------------------------------------------------------------------

        // Create a method for mouse click on one of the text fields in txfResults.
        // Hint: Create small helper methods to be used in the mouse click method.
        //

    }
}