package Opgaver2.ex1;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GuiListView2 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Person Administration");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final ListView<Person> lvwNames = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();
    private final CheckBox cbx = new CheckBox();


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
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        Label lblTitle = new Label("Title:");
        pane.add(lblTitle, 0, 1);

        // add a label to the pane (at col=0, row=1)
        Label lblPersons = new Label("Persons:");
        pane.add(lblPersons, 0, 3);
        GridPane.setValignment(lblPersons, VPos.TOP);

        // add a text field to the pane (at col=1, row=0)
        pane.add(txfName, 1, 0);

        pane.add(txfTitle, 1, 1);

        // add a listView to the pane(at col=1, row=1)
        pane.add(lvwNames, 1, 3);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);

        ChangeListener<Person> listener = (ov, oldString, newString) -> this.selectionChanged();
        lvwNames.getSelectionModel().selectedItemProperty().addListener(listener);

        lvwNames.getSelectionModel().clearSelection();

        // add a button to the pane (at col=4, row=2)
        Button btnAdd = new Button("Add person");
        pane.add(btnAdd, 4, 2);
        // btnAdd.setDefaultButton(true);

        // connect a method to the button
        btnAdd.setOnAction(event -> this.addAction());

        pane.add(cbx, 1, 2);
        cbx.setText("Senior");
        cbx.setSelected(false);

        // add a button to the pane (at col=4, row=1)
        // Button btnDelete = new Button("Delete");
        //pane.add(btnDelete, 4, 1);

        // connect a method to the button
        //btnDelete.setOnAction(event -> this.deleteAction());
    }

    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Selection changed actions

    private void selectionChanged() {
        Person selected = lvwNames.getSelectionModel().getSelectedItem();
        if (selected != null) {
            txfName.setText(selected.getName());
            txfTitle.setText(selected.getTitle());
            cbx.setSelected(selected.isSenior());
        } else {
            txfName.clear();
        }
    }

    // -------------------------------------------------------------------------
    // Button actions

    private void addAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        boolean senior = cbx.isSelected();
        if (name.length() > 0) {
        Person person = new Person(name, title, senior);
        persons.add(person);
            lvwNames.getItems().setAll(persons);
            txfName.clear();
            txfTitle.clear();
            cbx.setSelected(false);
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

