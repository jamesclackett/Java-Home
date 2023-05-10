package radio_button;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
    @FXML
    private RadioButton radioButtonOne, radioButtonTwo, radioButtonThree;
    @FXML
    private Label myLabel;

    public void getFood(ActionEvent event){
        myLabel.setText(((RadioButton) event.getSource()).getText());
    }
}
