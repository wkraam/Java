package oop;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Riigilipud extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Riigilipud");
        Group root = new Group();
        Canvas canvas = new Canvas(600, 280);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);

        Button nupp1 = new Button("Olen nõus"); // luuakse nupp

        Reflection peegeldus = new Reflection();
        peegeldus.setFraction(0.9);

        Rectangle rect = new Rectangle(200, 200, 200, 100);
        rect.setArcHeight(15);
        rect.setArcWidth(40);

        Path path = new Path();
        path.getElements().add(new MoveTo(600, 200));
        path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
        path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
        PathTransition pT = new PathTransition();
        PauseTransition pt = new PauseTransition(Duration.millis(1000));
        pT.setDuration(Duration.seconds(3));
        pT.setPath(path);
        pT.setNode(rect);
        pT.setCycleCount(Timeline.INDEFINITE);
        pT.setAutoReverse(true);
        //pT.play();
        RotateTransition rt = new RotateTransition(Duration.millis(3300));
        rt.setByAngle(180);
        rt.setCycleCount(4);
        rt.setAutoReverse(true);

        //ParallelTransition pt = new ParallelTransition(rect, pT, rt);
        //pt.play();
        SequentialTransition seqT = new SequentialTransition (rect,pt , pT, rt);
        seqT.play();

        nupp1.setEffect(peegeldus);
        nupp1.setLayoutX(180); // nupu paigutamine x-koordinaadi mõttes
        nupp1.setLayoutY(40); // nupu paigutamine y-koordinaadi mõttes

        root.getChildren().addAll(canvas, rect, nupp1);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        //Botswana
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(30);
        gc.strokeLine(40, 10, 140, 10);
        gc.strokeLine(40, 66, 140, 66);
        gc.setLineWidth(20);
        gc.setStroke(Color.BLACK);
        gc.strokeLine(35, 38, 145, 38);

        //Fääri saared
        gc.setLineWidth(20);
        gc.setStroke(Color.BLUE);
        gc.strokeLine(35, 130, 120, 130);
        gc.strokeLine(65, 100, 65, 160);
        gc.setLineWidth(10);
        gc.setStroke(Color.RED);
        gc.strokeLine(30, 130, 125, 130);
        gc.strokeLine(65, 95, 65, 165);

        //Ghana
        gc.setLineWidth(30);
        gc.strokeLine(40, 200, 140, 200);
        gc.setStroke(Color.YELLOW);
        gc.strokeLine(40, 230, 140, 230);
        gc.setStroke(Color.GREEN);
        gc.strokeLine(40, 260, 140, 260);

        gc.fillPolygon(new double[]{90, 94, 105, 96, 99, 90, 81, 84, 75, 86},
                       new double[]{215, 228, 228, 234, 245, 238, 245, 234, 228, 228}, 10);

    }
}
