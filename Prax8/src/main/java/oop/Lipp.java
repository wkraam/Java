package oop;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Lipp extends Application {
    @Override
    public void start(Stage peaLava) throws Exception {
        Group grupp = new Group();
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        joonista(gc);

        grupp.getChildren().add(canvas);
        peaLava.setScene(new Scene(grupp));

        peaLava.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                canvas.setHeight((double) newValue-33);
                joonista(gc);
            }
        });
        peaLava.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                canvas.setWidth((double) newValue);
                joonista(gc);
            }
        });

        peaLava.show();
    }

    private void joonista(GraphicsContext gc){
        double h = gc.getCanvas().getHeight();
        double w = gc.getCanvas().getWidth();
        gc.setFill(Color.BLUE);
        gc.fillRect(0,0,w,h/3);
        gc.setFill(Color.BLACK);
        gc.fillRect(0, h/3, w, h/3);
        gc.setFill(Color.WHITE);
        gc.fillRect(0, h*2/3, w, h/3);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
