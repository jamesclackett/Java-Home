package choicebox;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private Label label;

    private String[] food = {"pizza", "hotdog", "burger"};

    /*
        Initializable?

        Normally, class constructor is called first,
        then FXML fields are populated.
        This means that the constructor does not have access
        to the fxml fields. It would be impossible to populate
        the choicebox below in a constructor, for example.
        In classes which implement Initializable, the initialize()
        method is called after the constructor, making it possible
        to access fxml fields.

     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll(food);
        choiceBox.setOnAction(this::changeText);
    }

    public void changeText(ActionEvent e){
        label.setText(choiceBox.getValue());
    }
}
