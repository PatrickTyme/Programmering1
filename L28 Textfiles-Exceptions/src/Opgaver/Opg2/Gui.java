package Opgaver.Opg2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Gui extends Application {
    public void start(Stage stage) {
        stage.setTitle("Exercise 2");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        personWindow = new AddPersonWindow("Add person", stage);
    }

    // -------------------------------------------------------------------------

    private final ListView<Person> lvwPersons = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();
    private AddPersonWindow personWindow;

    private void initContent(GridPane pane) {
        this.initPersons();

        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblPersons = new Label("Persons:");
        pane.add(lblPersons, 0, 0);

        Button btnAdd = new Button("Add Person");
        pane.add(btnAdd, 0, 6);
        btnAdd.setOnAction(event -> this.addAction());


        // add a listView to the pane(at col=1, row=0)
        pane.add(lvwPersons, 0, 1, 1, 5);
        lvwPersons.setPrefWidth(250);
        lvwPersons.setPrefHeight(300);
        lvwPersons.getItems().setAll(persons);
    }

    private void initPersons() {
        persons.add(new Person("Robert", 34));
        persons.add(new Person("John", 40));
        persons.add(new Person("Jack", 25));
        persons.add(new Person("Mary", 20));
    }

    private void addAction() {
        personWindow.showAndWait();

        if (personWindow.getActualPerson() != null) {
            Person person = personWindow.getActualPerson();
            persons.add(person);
            lvwPersons.getItems().setAll(persons);
        }
    }
}
