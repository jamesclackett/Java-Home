package scenebuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
    // class to manipulate fxml programmatically

    @FXML //FXMLLoader tells program that the item below is an fxml node
    private Circle myCircle;
    private double x,y;

    public void up(ActionEvent e){
        myCircle.setCenterY(y-=10);
    }
    public void down(ActionEvent e){
        myCircle.setCenterY(y+=10);
    }
    public void left(ActionEvent e){
        myCircle.setCenterX(x-=10);
    }
    public void right(ActionEvent e){
        myCircle.setCenterX(x+=10);
    }

}
