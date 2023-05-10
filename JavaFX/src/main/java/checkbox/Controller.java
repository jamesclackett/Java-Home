package checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    CheckBox myCheckBox;
    @FXML
    Label myLabel;

    public void change(){
        if (myCheckBox.isSelected())
            myLabel.setText("ON");
        else
            myLabel.setText("OFF");
    }
}
