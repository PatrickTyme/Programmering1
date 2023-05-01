package Opgaver.Opg2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class AddPersonWindow extends Stage {

        public AddPersonWindow(String title, Stage owner) {
            this.initOwner(owner);
            this.initStyle(StageStyle.UTILITY);
            this.initModality(Modality.APPLICATION_MODAL);
            this.setMinHeight(100);
            this.setMinWidth(200);
            this.setResizable(false);

            this.setTitle(title);
            GridPane pane = new GridPane();
            this.initContent(pane);

            Scene scene = new Scene(pane);
            this.setScene(scene);
        }

        private final TextField txfName = new TextField();
        private final TextField txfAge = new TextField();
        private final Label stars = new Label("**");
        private Person actualPerson = null;
    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        Label lblAge = new Label("Age:");
        pane.add(lblAge, 0, 1);

        pane.add(txfName, 1, 0);
        pane.add(txfAge, 1, 1);

        Label lblError = new Label("");
        lblError.setTextFill(Color.RED);
        pane.add(lblError, 1, 2);

        pane.add(stars, 2, 1);
        stars.setVisible(false);
        stars.setTextFill(Color.RED);

        txfName.setOnMouseClicked(event -> {
            lblError.setText("");
        });


        HBox buttonBox = new HBox(20);
        pane.add(buttonBox, 0, 3, 2, 1);
        buttonBox.setPadding(new Insets(10, 10, 0, 10));
        buttonBox.setAlignment(Pos.CENTER);

        Button btnCancel = new Button("Cancel");
        buttonBox.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        buttonBox.getChildren().add(btnOK);
        btnOK.setOnAction(event -> this.okAction(lblError, stars));
    }




        // -------------------------------------------------------------------------
        // Button actions

        private void cancelAction() {
            txfName.clear();
            txfName.requestFocus();
            txfAge.clear();
            actualPerson = null;
            AddPersonWindow.this.hide();
        }

    private void okAction(Label lblError, Label stars) {
        String name = txfName.getText().trim();
        String ageString = txfAge.getText().trim();
        int age = 0;

        try {
            age = Integer.parseInt(ageString);
            if (age < 0) {
                lblError.setText("Age cannot be negative");
                stars.setVisible(true);
            } else if (ageString.isEmpty()) {
                lblError.setText("Age is required");
                stars.setVisible(true);
            } else {
                stars.setVisible(false);
                lblError.setText("");
            }
        } catch (NumberFormatException e) {
            lblError.setText("Age is not an integer");
            stars.setVisible(true);
            return;
        }

        if (name.length() > 0 && age > 0) {
            actualPerson = new Person(name, age);
            txfName.clear();
            txfAge.clear();
            txfName.requestFocus();
            AddPersonWindow.this.hide();
        } else {
            lblError.setText("Input is empty");
            stars.setVisible(true);
        }
    }

        public Person getActualPerson() {
            return actualPerson;
        }
    }
    //Alert alert = new Alert(Alert.AlertType.)
//                //Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                alert.setTitle("Add person");
//                alert.setHeaderText("Information missing");
//                alert.setContentText("Type name and age");
//                alert.show();
