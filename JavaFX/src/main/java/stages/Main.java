package stages;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // nodes are like components
        // group is a group of nodes (like a panel)
        // stage is like a frame

        Group root = new Group();
        Scene scene = new Scene(root, Color.BEIGE);

        Image icon = new Image("file:JavaFX\\src\\main\\resources\\gui\\java_icon.png");

        stage.setWidth(430);
        stage.setHeight(430);
        stage.setResizable(false);
        //stage.setX(); sets where stage whill appear on screen
        //stage.setY();
        //stage.setFullScreen(true);
        //stage.setFullScreenExitHint("Press q");
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.getIcons().add(icon);
        stage.setTitle("stage demo program");
        stage.setScene(scene);
        stage.show(); // stage is like a jframe
    }
}