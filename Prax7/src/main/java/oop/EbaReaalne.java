package oop;

import javafx.animation.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EbaReaalne extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage peaLava){
    FlowPane flow = new FlowPane();

    TextField tekst = new TextField("mingi tekst");
    flow.getChildren().add(tekst);

    ListView<String> list = new ListView<String>();
    ObservableList<String> items =FXCollections.observableArrayList (
            "Esimene", "Teine", "Kolmas", "Neljas");
    list.setMaxHeight(100);
    list.setItems(items);
    flow.getChildren().add(list);

    BorderPane border = new BorderPane();
    border.setMinWidth(250);

    Button nupp1 = new Button("1");
    border.setLeft(nupp1);
    Button nupp2 = new Button("2");
    border.setRight(nupp2);

    HBox hbox = new HBox();
    Label silt1 = new Label("silt1");
    Label silt2 = new Label("silt2");
    Button button = new Button("Click me!");
    Canvas canvas = new Canvas(300, 280);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    drawShapes(gc);
    Rectangle rect = new Rectangle (0, 0, 100, 100);
    rect.setArcHeight(50);
    rect.setArcWidth(50);
    rect.setFill(Color.RED);
    RotateTransition rt = new RotateTransition(Duration.millis(3000));
    PauseTransition pt = new PauseTransition(Duration.millis(1000));
    rt.setByAngle(180f);
    rt.setCycleCount(4);
    rt.setAutoReverse(true);
    SequentialTransition seqT = new SequentialTransition (rect, pt,rt);
    seqT.play();
    hbox.getChildren().addAll(silt1, silt2, button, canvas, rect);
    border.setCenter(hbox);

    flow.getChildren().add(border);

    Scene stseen1 = new Scene(flow, 700, 400, Color.SNOW);
    peaLava.setScene(stseen1);
    peaLava.show();
  }

  private void drawShapes(GraphicsContext gc) {
    gc.setFill(Color.YELLOWGREEN);
    gc.fillPolygon(new double[]{130, 260, 0},
            new double[]{0, 200, 200}, 3);
    gc.setFill(Color.WHITE);
    gc.fillPolygon(new double[]{130, 240, 20},
            new double[]{20, 190, 190}, 3);

  }
}
