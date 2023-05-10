package spinners;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Spinner<Integer> mySpinner;
    @FXML
    private Label myLabel;

    int currentVal;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //spinners are useless without spinner factories
        SpinnerValueFactory<Integer> spinnerFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10);
        spinnerFactory.setValue(1); //default value
        mySpinner.setValueFactory(spinnerFactory);

        mySpinner.valueProperty().addListener((observableValue, integer, t1) -> {
            currentVal = mySpinner.getValue();
            myLabel.setText(String.valueOf(currentVal));
        });


    }
}
