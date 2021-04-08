package oop;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ül1 extends Application {

  @Override
  public void start(Stage peaLava) throws Exception {
    Group grupp = new Group();
    Scene scene = new Scene(grupp, 400, 400);
    Rectangle r = new Rectangle(100, 100, 200, 200);
    Button btnExit = new Button("Close");
    Button btnMove = new Button("hyppa");

    r.setFill(Color.BLACK);
    r.setOnMouseEntered(event -> r.setFill(Color.GREEN));
    r.setOnMouseExited(event -> r.setFill(Color.RED));

    btnExit.setCancelButton(true);
    btnExit.setDefaultButton(false);
    btnExit.setOnAction(actionEvent -> Platform.exit());

    btnMove.setDefaultButton(true);
    btnMove.setLayoutX(50);
    btnMove.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        double randXmax = peaLava.getWidth();
        double randYmax = peaLava.getHeight();
        double randX = 0 + (double)(Math.random() * randXmax);
        double randY = 0 + (double)(Math.random() * randYmax);
        if (randXmax - randX < 100) randX = randX - 100;
        if (randYmax - randY < 100) randY = randY - 100;
        btnMove.setLayoutX(randX);
        btnMove.setLayoutY(randY);
      }
    });

    grupp.getChildren().addAll(r, btnExit, btnMove);
    peaLava.setScene(scene);
    peaLava.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
