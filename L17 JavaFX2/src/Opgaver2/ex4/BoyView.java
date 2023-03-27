package Opgaver2.ex4;

import Opgaver2.ex1.Person;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BoyView extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Boys");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final ListView<Boy> lvwNames = new ListView<>();
    private final ArrayList<Boy> boys = new ArrayList<>();



    private void initContent(GridPane pane) {

        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 0);
        GridPane.setValignment(lblNames, VPos.TOP);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 2);


        // add a text field to the pane (at col=1, row=0)
        pane.add(txfName, 1, 2);


        // add a listView to the pane(at col=1, row=1)
        pane.add(lvwNames, 1, 0);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);


        // add a button to the pane (at col=4, row=2)
        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 3, 2);
        // btnAdd.setDefaultButton(true);

        // connect a method to the button
        btnAdd.setOnAction(event -> this.addAction());

    }

    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Selection changed actions


    // -------------------------------------------------------------------------
    // Button actions

    private void addAction() {
        String name = txfName.getText().trim();
        if (name.length() > 0) {
        Boy boy = new Boy(name);
        boys.add(boy);
            lvwNames.getItems().setAll(boys);
            txfName.clear();
        } else {

            }

        }
}

   /* private void deleteAction() {
        int index = lvwNames.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            names.remove(index);
            txfName.clear();
            lvwNames.getItems().setAll(names);
        } */

