package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Bane;
import model.Booking;
import model.Spiller;
import java.util.concurrent.CompletionStage;

public class Gui extends Application {

    @Override
    public void init() {
        App.initStorage();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Bane bookings");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }


    // Listviews
    private final ListView<Bane> lvwBaner = new ListView<>();
    private final ListView<Spiller> lvwSpillere = new ListView<>();

    // TextArea
    private final TextArea txaSpillerensBookinger = new TextArea();
    private final TextArea txaAntalBookinger = new TextArea();

    // Textfields
    private final TextField txfDato = new TextField();
    private final TextField txfTid = new TextField();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);


        Label lblBaner = new Label("Baner");
        pane.add(lblBaner, 0, 0);

        pane.add(lvwBaner, 0, 1);
        lvwBaner.setPrefHeight(150);
        lvwBaner.setPrefWidth(200);
        lvwBaner.getItems().setAll(Controller.getBaner());


        Label lblSpillere = new Label("Spillere");
        pane.add(lblSpillere, 1, 0);

        pane.add(lvwSpillere, 1, 1);
        lvwSpillere.setPrefHeight(150);
        lvwSpillere.setPrefWidth(80);
        lvwSpillere.getItems().setAll(Controller.getSpillere());


        Label lblSpillerBookinger = new Label("Spillerens bookinger");
        pane.add(lblSpillerBookinger, 2, 0);

        pane.add(txaSpillerensBookinger, 2, 1, 4, 2);
        txaSpillerensBookinger.setPrefHeight(150);
        txaSpillerensBookinger.setPrefWidth(250);
        //txaSpillerensBookinger.setText();


        Label lblAntalBookinger = new Label("Antal bookinger på banen");
        pane.add(lblAntalBookinger, 0, 2);

        pane.add(txaAntalBookinger, 0, 3);
        txaAntalBookinger.setPrefHeight(100);
        txaAntalBookinger.setPrefWidth(200);
        //txaAntalBookinger.setText();


        Label lblOpretBooking = new Label("Opret booking:");
        pane.add(lblOpretBooking, 2,2);

        Label lblDato = new Label("Dato:");
        pane.add(lblDato, 2, 3);

        pane.add(txfDato, 3, 3);
        txfDato.setPrefWidth(150);

        Label lblTid = new Label("Tid:");
        pane.add(lblTid, 3, 3);

        pane.add(txfTid, 4, 3);

        CheckBox cbxSingle = new CheckBox("Single");
        pane.add(cbxSingle, 5, 3);

        Button btnBookBane = new Button("Book bane til spiller");
        pane.add(btnBookBane, 6, 3);
       // btnBookBane.setOnAction(event -> this.bookBaneAction());

    }
}
