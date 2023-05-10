package listview;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ListView<String> listView; //note for fxml: fixed-cell size is -1 by default (size to fit)
    @FXML
    private Label myLabel;

    String[] food = {"pizza", "sushi", "ramen"};
    String currentFood;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll(food);
        listView.getSelectionModel().selectedItemProperty().addListener((observableValue, s, t1) -> {
            currentFood = listView.getSelectionModel().getSelectedItem();
            myLabel.setText(currentFood);
        });

    }
}
