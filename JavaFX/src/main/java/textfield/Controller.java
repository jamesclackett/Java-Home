package textfield;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField myTextField;
    @FXML
    Button myButton;
    @FXML
    Label myLabel;

    int age;

    public void submit(ActionEvent event){
        try{
            age = Integer.parseInt(myTextField.getText());
            System.out.println(age);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
