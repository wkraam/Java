package oop;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HiireAsukoht extends Application {
    @Override
    public void start(Stage peaLava) throws Exception {
        Group grupp = new Group();
        Scene scene = new Scene(grupp, 400, 400);
        Label lblMouse = new Label();

        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double mouseX = event.getSceneX();
                double mouseY = event.getSceneY();
                lblMouse.setText("("+mouseX+','+mouseY+")");
                lblMouse.setLayoutX(mouseX);
                lblMouse.setLayoutY(mouseY);
            }
        });
        scene.setOnMouseReleased(event -> lblMouse.setText(""));
        grupp.getChildren().add(lblMouse);
        peaLava.setScene(scene);
        peaLava.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
