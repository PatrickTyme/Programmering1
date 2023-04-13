package gui;

import com.sun.source.tree.IfTree;
import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.YatzyDice;

import java.awt.event.MouseEvent;
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
    private final TextField txfSumSame = new TextField("0");
    private final TextField txfBonus = new TextField("0");
    private final TextField txfSumOther = new TextField("0");
    private final TextField txfTotal = new TextField("0");

    private final Label lblThrowCount = new Label();

    private final Button btnThrow = new Button("Throw " + dice.getThrowCount());
    private boolean[] hold = new boolean[5];

    private boolean[] point = new boolean[15];

    private int sumSame = 0;



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
        for (int i = 0; i < txfValues.length; i++){
            txfValues[i] = new TextField("0");
            txfValues[i].setStyle("-fx-font: 30 arial;");
            txfValues[i].setAlignment(Pos.CENTER);
            txfValues[i].setPrefWidth(75);
            txfValues[i].setPrefHeight(75);
            dicePane.add(txfValues[i],i,0);
            cbxHolds[i] = new CheckBox("Hold");
            dicePane.add(cbxHolds[i],i,1);
            txfValues[i].setEditable(false);

        }

        // add lblThrowCount and btnThrow
        dicePane.add(btnThrow,4,2);
        btnThrow.setPrefHeight(25);
        btnThrow.setPrefWidth(75);


        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        scorePane.setGridLinesVisible(false);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int width = 50; // width of the text fields

        // add labels for results
        // add txfResults,
        for (int i = 0; i < 6; i++) {
            txfResults.add(i,new TextField());
            scorePane.add(txfResults.get(i),1,i);
            txfResults.get(i).setPrefWidth(50);
            txfResults.get(i).setEditable(false);
            txfResults.get(i).setOnMouseClicked(event -> this.mouseClicked(event));
        }

        for (int i = 6; i < 15; i++) {
            txfResults.add(i,new TextField());
            scorePane.add(txfResults.get(i), 1, i + 1);
            txfResults.get(i).setPrefWidth(50);
            txfResults.get(i).setEditable(false);
            txfResults.get(i).setOnMouseClicked(event -> this.mouseClicked(event));
        }

        Label lbl1 = new Label("1-s");
        scorePane.add(lbl1,0,0);
        Label lbl2 = new Label("2-s");
        scorePane.add(lbl2,0,1);
        Label lbl3 = new Label("3-s");
        scorePane.add(lbl3, 0,2);
        Label lbl4 = new Label("4-s");
        scorePane.add(lbl4, 0,3);
        Label lbl5 = new Label("5-s");
        scorePane.add(lbl5, 0,4);
        Label lbl6 = new Label("6-s");
        scorePane.add(lbl6, 0,5);
        Label lbl7 = new Label("One pair");
        scorePane.add(lbl7, 0,7);
        Label lbl8 = new Label("Two pairs");
        scorePane.add(lbl8, 0,8);
        Label lbl9 = new Label("Three-same");
        scorePane.add(lbl9, 0,9);
        Label lbl10 = new Label("Four-same");
        scorePane.add(lbl10, 0,10);
        Label lbl11 = new Label("Full house");
        scorePane.add(lbl11, 0,11);
        Label lbl12 = new Label("Small str");
        scorePane.add(lbl12, 0,12);
        Label lbl13 = new Label("Large str");
        scorePane.add(lbl13, 0,13);
        Label lbl14 = new Label("Chance");
        scorePane.add(lbl14, 0,14);
        Label lbl15 = new Label("Yatzy");
        scorePane.add(lbl15, 0,15);


        // add labels and text fields for sums, bonus and total.
        scorePane.add(txfSumSame,3,5);
        txfSumSame.setPrefWidth(50);
        txfSumSame.setEditable(false);
        scorePane.add(txfBonus,3,6);
        txfBonus.setPrefWidth(50);
        txfBonus.setEditable(false);
        scorePane.add(txfSumOther,3,15);
        txfSumOther.setPrefWidth(50);
        txfSumOther.setEditable(false);
        scorePane.add(txfTotal,3,16);
        txfTotal.setPrefWidth(50);
        txfTotal.setEditable(false);


        Label lblSum = new Label("Sum");
        scorePane.add(lblSum, 2,5);
        Label lblSum1 = new Label("Sum");
        scorePane.add(lblSum1, 2,15);
        Label lblBonus = new Label("Bonus");
        scorePane.add(lblBonus, 2,6);
        Label lblTotal = new Label("TOTAL");
        scorePane.add(lblTotal, 2,16);


        btnThrow.setOnAction(Event -> {
            if (dice.getThrowCount() < 3){
                throwAction();
            }
            else {
                throwAction();
                btnThrow.disarm();
                btnThrow.setVisible(false);
            }
        });

        for (int i = 0; i < point.length; i++){
            point[i] = true;
        }



    }



    // -------------------------------------------------------------------------

    // Create an action method for btnThrow's action.
    // Hint: Create small helper methods to be used in
    // the action method.
    public void throwAction() {
        checked();
        dice.throwDice(hold);
        int [] value = dice.getValues();
        for (int i = 0; i < txfValues.length; i++){
            txfValues[i].setText(String.valueOf(value[i]));
        }
        btnThrow.setText("Throw " + dice.getThrowCount());
        points();
        lockedIn();
    }

    public void checked(){
        for (int i = 0; i < cbxHolds.length; i++){
            hold[i] = cbxHolds[i].isSelected();
        }
    }

    public void points(){
        if (dice.getThrowCount() == 4) {
            for (int i = 0; i < txfResults.size();i++){
                if (point[i]) {
                    txfResults.get(i).setText(String.valueOf(dice.getResults()[i]));
                }
            }
        }
    }

    public void lockedIn() {
        for (int i = 0;i < hold.length; i++){
            if (hold[i]) {
                cbxHolds[i].setDisable(true);
            }
        }
    }




    // -------------------------------------------------------------------------

    // Create a method for mouse click on one of the text fields in txfResults.
    // Hint: Create small helper methods to be used in the mouse click method.
    private void mouseClicked(javafx.scene.input.MouseEvent event){
        if (dice.getThrowCount() <= 2){
            return;
        }


        TextField txf = (TextField) event.getSource();
        for (int i = 0; i < txfResults.size(); i++){
            if (txf == txfResults.get(i)){
                if (point[i]) {
                    for (int j = 0; j < cbxHolds.length; j++) {
                        cbxHolds[j].setDisable(false);
                    }
                    if (i > 0 && i <= 5) {
                        sumSame += dice.getResults()[i];
                        txfSumSame.setText(String.valueOf(sumSame));
                    }

                    txf.setStyle("-fx-text-fill: red");

                    point[i] = false;


                } else {
                    return;
                }

                for (int j = 0; j < txfResults.size(); j++) {
                    if (point[j]) {
                        txfResults.get(j).setText("0");
                    }
                }
            }
        }

        dice.resetThrowCount();
        btnThrow.setText("Throw " + dice.getThrowCount());

        btnThrow.arm();
        btnThrow.setVisible(true);
        for (int i = 0; i < cbxHolds.length; i++){
            cbxHolds[i].setSelected(false);
        }

        for (int i = 0; i < txfValues.length; i++){
            txfValues[i].setText("0");
        }



    }



}
