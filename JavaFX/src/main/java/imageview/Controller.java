package imageview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    /*
    ImageView is a node used for painting images loaded with Images
     */

    @FXML
    ImageView myImageView;
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("space.jpg"));

    public void displayImage(){
        myImageView.setImage(myImage);
    }
}
