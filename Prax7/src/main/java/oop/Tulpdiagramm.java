package oop;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tulpdiagramm extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle("Tulpdiagramm");
        Group root = new Group();
        Canvas canvas = new Canvas(260, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);

        root.getChildren().addAll(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc) throws FileNotFoundException {
        File file = new File("src\\main\\java\\oop\\tulbad.txt");
        Scanner scanner = new Scanner(file);
        int y_coord = 150;
        int x_coord = 40;
        gc.setLineWidth(10);
        while (scanner.hasNextLine()) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 50) gc.setStroke(Color.BLUE);
            else gc.setStroke(Color.RED);
            gc.strokeLine(x_coord, y_coord, x_coord, y_coord - number);
            gc.setLineWidth(1);
            gc.strokeText(String.valueOf(number), x_coord-7, y_coord+20);
            gc.setLineWidth(10);
            x_coord += 20;
        }
    }
}
