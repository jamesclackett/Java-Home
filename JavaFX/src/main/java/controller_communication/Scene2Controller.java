package controller_communication;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
    @FXML
    Label nameLabel;

    public void displayName(String userName){
        nameLabel.setText("Hello: " + userName);
    }
}
