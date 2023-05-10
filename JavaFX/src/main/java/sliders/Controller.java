package sliders;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.DragEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private Slider mySlider;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mySlider.valueProperty().addListener((observableValue, number, t1) -> changeTemp());
    }



    public void changeTemp(){
        //String temp = String.format("%.2f", mySlider.getValue());
        int temp = (int) mySlider.getValue();
        myLabel.setText(temp + "C");
    }
}
