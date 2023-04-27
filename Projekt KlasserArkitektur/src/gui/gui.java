package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Bestilling;
import model.Forestilling;
import model.Kunde;
import model.Plads;

import java.time.LocalDate;
import java.util.ArrayList;

public class gui extends Application {

    public void start(Stage stage) {
        stage.setTitle("Teater Forestillinger");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final ListView<Forestilling> lvwForestillinger = new ListView<>();
    private final ListView<Kunde> lvwKunder = new ListView<>();
    private final ListView<Plads> lvwPladser = new ListView<>();
    private final TextField txfName = new TextField();
    private final TextField txfStart = new TextField();
    private final TextField txfSlut = new TextField();
    private final TextField txfKundeNavn = new TextField();
    private final TextField txfKundeMobil = new TextField();
    private final TextField txfDato = new TextField();


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);


        // forestilling label og lvw
        Label lblForestilling = new Label("Forestillinger:");
        pane.add(lblForestilling, 0, 0);

        pane.add(lvwForestillinger, 0, 1, 2, 1);
        lvwForestillinger.setPrefHeight(250);
        lvwForestillinger.setPrefWidth(250);
        lvwForestillinger.getItems().setAll(Controller.getForestillinger());

        // Kunder label og lvw
        Label lblKunder = new Label("Kunder:");
        pane.add(lblKunder, 2, 0);

        pane.add(lvwKunder, 2, 1, 2, 1);
        lvwKunder.setPrefWidth(250);
        lvwKunder.setPrefHeight(250);
        lvwKunder.getItems().setAll(Controller.getKunder());

        // name label og txf
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 2);

        pane.add(txfName, 1, 2);
        txfName.setPrefWidth(100);

        // start dato label og txf
        Label lblStart = new Label("Start dato:");
        pane.add(lblStart, 0, 3);

        pane.add(txfStart, 1, 3);
        txfStart.setPrefWidth(100);
        txfStart.setPromptText("YYYY-MM-DD");

        // Slut dato label og txf
        Label lblSlut = new Label("Slut dato:");
        pane.add(lblSlut, 0, 4);

        pane.add(txfSlut, 1, 4);
        txfSlut.setPrefWidth(100);
        txfSlut.setPromptText("YYYY-MM-DD");

        // kundenavn label og txf
        Label lblKundeNavn = new Label("Kunde navn:");
        pane.add(lblKundeNavn, 2, 2);

        pane.add(txfKundeNavn, 3, 2);
        txfKundeNavn.setPrefWidth(100);

        // kundemobil label og txf
        Label lblKundeMobil = new Label("Kunde mobil:");
        pane.add(lblKundeMobil, 2, 3);

        pane.add(txfKundeMobil, 3, 3);
        txfKundeMobil.setPrefWidth(100);

        // Button opret forestilling
        Button btnOpretForestilling = new Button("Opret forestilling");
        pane.add(btnOpretForestilling, 1, 5);
        btnOpretForestilling.setOnAction(event -> this.opretForestillingAction());

        // Button opret kunde
        Button btnOpretKunde = new Button("Opret kunde");
        pane.add(btnOpretKunde, 3, 4);
        btnOpretKunde.setOnAction(event -> this.opretKundeAction());

        // PLadser label og lvw
        Label lblPladser = new Label("Pladser:");
        pane.add(lblPladser, 4, 0);

        pane.add(lvwPladser, 4, 1, 3, 1);
        lvwPladser.setPrefWidth(250);
        lvwPladser.setPrefHeight(250);
        lvwPladser.getItems().setAll(Controller.getPladser());
        lvwPladser.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        // dato label og txf
        Label lblDato = new Label("Dato:");
        pane.add(lblDato, 4, 2);

        pane.add(txfDato, 5, 2);
        txfDato.setPrefWidth(200);
        txfDato.setPromptText("YYYY-MM-DD");

        // button Opretbestilling
        Button btnOpretBestilling = new Button("Opret bestilling");
        pane.add(btnOpretBestilling, 5, 3);
        btnOpretBestilling.setOnAction(event -> this.opretBestillingAction());

    }

    private void opretForestillingAction() {
        String name = txfName.getText().trim();
        String start = txfStart.getText().trim();
        String slut = txfSlut.getText().trim();
        if (name.length() > 0) {
            Controller.createForestilling(name, LocalDate.parse(start), LocalDate.parse(slut));
            txfName.clear();
            txfStart.clear();
            txfSlut.clear();
            lvwForestillinger.getItems().setAll(Controller.getForestillinger());
        }

    }

    private void opretKundeAction() {
        String name = txfKundeNavn.getText().trim();
        String mobil = txfKundeMobil.getText().trim();
        if (name.length() > 0) {
            Controller.createKunde(name, mobil);
            txfKundeNavn.clear();
            txfKundeMobil.clear();
            lvwKunder.getItems().setAll(Controller.getKunder());
        }
    }
    private ArrayList<Plads> tidligereBestiltePladser = new ArrayList<>();


    private void opretBestillingAction() {
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Bestilling");
        ButtonType type = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().add(type);

        ArrayList<Plads> pladser = new ArrayList<>();
        String dato = txfDato.getText().trim();
        Forestilling forestilling = lvwForestillinger.getSelectionModel().getSelectedItem();
        Kunde kunde = lvwKunder.getSelectionModel().getSelectedItem();
        pladser.addAll(lvwPladser.getSelectionModel().getSelectedItems());

        // checker om de tidligere valgte pladser er valgt igen, og "sletter" dem fra den tilgængelige liste
        ArrayList<Plads> bestiltePladser = new ArrayList<>(pladser);
        bestiltePladser.retainAll(tidligereBestiltePladser);
        boolean tidligereBestilt = !bestiltePladser.isEmpty();

        Bestilling bestilling = Controller.opretBestillingMedPladser(forestilling, kunde, LocalDate.parse(dato), pladser);
        if (bestilling != null) {
            if (!tidligereBestilt) {
                dialog.setContentText("Bestilling oprettet!");
                tidligereBestiltePladser.addAll(pladser);
            } else {
                dialog.setContentText("Bestillingen er ikke oprettet");
            }
            dialog.showAndWait();
        }
    }

}

