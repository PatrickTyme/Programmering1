package Opgaver2.ex3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();

    private Persona actualPersona = null;
    private final CheckBox cbx = new CheckBox();

    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        Label lblTitle = new Label("Title:");
        pane.add(lblTitle, 0, 1);

        pane.add(txfName, 1, 0);

        pane.add(txfTitle, 1, 1);

        HBox buttonBox = new HBox(20);
        pane.add(buttonBox, 0, 2, 2, 1);
        buttonBox.setPadding(new Insets(10, 10, 0, 10));
        buttonBox.setAlignment(Pos.CENTER);

        Button btnCancel = new Button("Cancel");
        buttonBox.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        buttonBox.getChildren().add(btnOK);
        btnOK.setOnAction(event -> this.okAction());

        pane.add(cbx, 1, 1);
        cbx.setText("Senior");
        cbx.setSelected(false);
    }

    // -------------------------------------------------------------------------
    // Button actions

    private void cancelAction() {
        txfName.clear();
        txfName.requestFocus();
        txfTitle.clear();
        cbx.setSelected(false);
        actualPersona = null;
        AddPersonWindow.this.hide();
    }

    private void okAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        boolean senior = cbx.isSelected();

        if (name.length() > 0 && title.length() > 0) {
            actualPersona = new Persona(name, title, senior);
            txfName.clear();
            txfTitle.clear();
            cbx.setSelected(false);
            txfName.requestFocus();
            AddPersonWindow.this.hide();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Add person");
            alert.setHeaderText("Information missing");
            alert.setContentText("Type name and title");
            alert.show();
        }
    }

    // -------------------------------------------------------------------------

    public Persona getActualPerson() {
        return actualPersona;
    }

}

