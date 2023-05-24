package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Salgsannonce;
import model.Vare;
import storage.Storage;

public class Gui extends Application {


    @Override
    public void init() {
        Controller.initStorage();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Handelsplatform");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    private final ListView<Salgsannonce> lvwAnnoncer = new ListView<>();
    private final ListView<Vare> lvwVarer = new ListView<>();
    private final Label lblAktiveAnnoncer = new Label("Aktive annoncer: ");
    private final Label lblVarer = new Label("Varer: ");

    private final TextField txfKøber = new TextField();
    private final TextField txfAftaltPris = new TextField();
    private final TextField txfFilNavn = new TextField();


    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);


        pane.add(lblAktiveAnnoncer, 0, 0);
        pane.add(lvwAnnoncer, 0, 1, 3, 5);
        lvwAnnoncer.setPrefHeight(200);
        lvwAnnoncer.setPrefWidth(300);
        lvwAnnoncer.getItems().setAll(Storage.getSalgsannoncer());

        pane.add(lblVarer, 4, 0);
        pane.add(lvwVarer, 4, 1, 3, 5);
        lvwVarer.setPrefHeight(200);
        lvwVarer.setPrefWidth(550);
        lvwVarer.getItems().setAll(Storage.getVarer());


    }
}
