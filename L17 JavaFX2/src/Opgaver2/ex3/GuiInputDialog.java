package Opgaver2.ex3;

import Opgaver2.ex2.Person;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Optional;

public class GuiInputDialog extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo InputDialog");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        personWindow = new AddPersonWindow("Add person", stage);
    }

    // -------------------------------------------------------------------------

    private final ListView<Persona> lvwNames = new ListView<>();
    private final ArrayList<Persona> persons = new ArrayList<>();
    private AddPersonWindow personWindow;

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);

        Label lblName = new Label("Persons:");
        pane.add(lblName, 0, 0);

        pane.add(lvwNames, 0, 1);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);

        Button btnFill = new Button("Add person");
        pane.add(btnFill, 2, 1);
        btnFill.setOnAction(event -> this.addAction());
    }

    // -------------------------------------------------------------------------

   private void addAction() {
        personWindow.showAndWait();

        if (personWindow.getActualPerson() != null) {
            Persona person = personWindow.getActualPerson();
            persons.add(person);
            lvwNames.getItems().setAll(persons);
        }

    }
}
