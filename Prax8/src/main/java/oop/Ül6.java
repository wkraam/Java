package oop;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ül6 extends Application {

    @Override
    public void start(Stage peaLava) {
        Group grupp = new Group();
        Scene stseen1 = new Scene(grupp, 300, 300);

        Label lblKüsimus = new Label("Küsimus1: Millised on tsiviilkäibes õhusõidukid?");
        Label lblVastus = new Label("");

        Button btnKontrolli = new Button("Kontrolli");
        btnKontrolli.setDefaultButton(true);
        btnKontrolli.setMinSize(70, 25);

        Button btnClose = new Button("Close");
        btnClose.setCancelButton(true);
        btnClose.setOnAction(ActionEvent -> Platform.exit());
        btnClose.setMinSize(50, 25);

        CheckBox check1, check2, check3, check4;

        check1= new CheckBox("A320");
        check2= new CheckBox("F50");
        check3= new CheckBox("F-16");
        check4= new CheckBox("Jak-44");

        VBox küsimused = new VBox(6);
        küsimused.getChildren().addAll(lblKüsimus, check1, check2, check3, check4, lblVastus);

        HBox nupud = new HBox(16);
        nupud.getChildren().addAll(btnKontrolli, btnClose);

        VBox layout = new VBox(16);
        layout.getChildren().addAll(küsimused, nupud);

        btnKontrolli.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (check3.isSelected() || check4.isSelected()) lblVastus.setText("Vastus on vale");
                else if (check1.isSelected() || check2.isSelected()) lblVastus.setText("Vastus on osaliselt õige");
                if (check1.isSelected() && check2.isSelected()
                && !check3.isSelected() && !check4.isSelected()) {
                    lblVastus.setText("Vastus on õige");
                    btnKontrolli.setDisable(true);
                }

            }
        });
        grupp.getChildren().addAll(layout);

        peaLava.setTitle("Küsimused");
        peaLava.setResizable(false);
        peaLava.setScene(stseen1);
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
