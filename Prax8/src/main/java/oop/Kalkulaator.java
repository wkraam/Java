package oop;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class Kalkulaator extends Application {

    private static DoubleProperty väärtus = new SimpleDoubleProperty();

    public static void main(String[] args) {
        launch(args);
    }

    public static void looNumbriNupp(String nr, Button nupp){
        nupp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                väärtus.set(väärtus.get()*10 + Integer.parseInt(nr));
            }
        });
    }
    public static void looKustutaNupp(Button nupp){
        nupp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                väärtus.set(Math.floor(väärtus.get()/10));
            }
        });
    }

    public static void looCNupp(Button nupp){
        nupp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                väärtus.set(0);
            }
        });
    }

    public HBox looHBox(String[] nupudeNimed, Color peamineVärv, Color teineVärv, List<String> alternatiivid){
        HBox väljund = new HBox();
        for (int i = 0; i < nupudeNimed.length; i++) {
            Button nupp = new Button(nupudeNimed[i]);
            if (nupudeNimed[i].matches("[0-9]")){
                looNumbriNupp(nupudeNimed[i], nupp);
            }
            nupp.setStyle("-fx-pref-width: 64px;");
            if (alternatiivid.contains(nupudeNimed[i])) {
                nupp.setStyle(String.valueOf(teineVärv));
                System.out.println("eriline! "+nupudeNimed[i]);
            }
            else nupp.setStyle(String.valueOf(peamineVärv));
            HBox.setMargin(nupp, new Insets(0, 5, 0, 5));
            väljund.getChildren().add(nupp);
        }
        return väljund;
    }

    @Override
    public void start(Stage lava){
        lava.setTitle("Kalkulaator");
        Group juur = new Group();
        BorderPane bp = new BorderPane();
        TextField input = new TextField();
        input.setAlignment(Pos.BASELINE_RIGHT);
        input.setEditable(false);
        input.textProperty().bind(Bindings.format("%.0f", väärtus));
        bp.setTop(input);

        Button backspace = new Button("Backspace");
        backspace.setStyle("-fx-text-fill: red; -fx-pref-width: 144px;");
        looKustutaNupp(backspace);
        HBox.setMargin(backspace, new Insets(0, 64, 0, 5));

        Button CE = new Button("CE");
        CE.setStyle("-fx-text-fill: red; -fx-pref-width: 64px;");
        looCNupp(CE);
        HBox.setMargin(CE, new Insets(0, 2, 0, 0));

        Button C = new Button("C");
        C.setStyle("-fx-text-fill: red; -fx-pref-width: 64px;");
        looCNupp(C);
        HBox.setMargin(C, new Insets(0, 5, 0, 0));

        HBox hBox = new HBox();
        hBox.getChildren().addAll(backspace, CE, C);
        bp.setCenter(hBox);

        VBox vBox = new VBox();

        String[] rida2 = new String[]{"7", "8", "9", "/", "sqrt"};
        String[] rida3 = new String[]{"4", "5", "6", "*", "%"};
        String[] rida4 = new String[]{"1", "2", "3", "-", "1/x"};
        String[] rida5 = new String[]{"0", "+/-", ",", "+", "="};
        List<String> erilised = new ArrayList<>();
        erilised.add("/");
        erilised.add("*");
        erilised.add("-");
        erilised.add("+");
        erilised.add("=");

        HBox hBox1 = looHBox(rida2, Color.BLUE, Color.RED, erilised);
        HBox hBox2 = looHBox(rida3, Color.BLUE, Color.RED, erilised);
        HBox hBox3 = looHBox(rida4, Color.BLUE, Color.RED, erilised);
        HBox hBox4 = looHBox(rida5, Color.BLUE, Color.RED, erilised);
        VBox.setMargin(vBox, new Insets(5, 0, 0, 0));
        vBox.getChildren().addAll(hBox1, hBox2, hBox3, hBox4);
        bp.setBottom(vBox);

        juur.getChildren().addAll(bp);
        lava.setScene(new Scene(juur));
        lava.show();
    }
}
