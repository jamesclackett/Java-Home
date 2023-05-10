package scenes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600,600, Color.ALICEBLUE);

        Text text = new Text();
        text.setText("HELLO THERE");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("", 50));

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLANCHEDALMOND);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.00, 200.00,
                200.00,300.00,
                300.00,300.00);
        triangle.setFill(Color.RED);

        Image image = new Image("file:JavaFX/src/main/resources/gui/java_icon.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        //Circle circle = new Circle();

        //Nodes are added to Group, Group is added to Scene, Scene is added to Stage
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
