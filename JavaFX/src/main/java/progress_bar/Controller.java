package progress_bar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label myLabel;

    public void addProgress(ActionEvent event){
        double progress = progressBar.getProgress();

        if (Math.round(progress*100) <= 100){
            // math.round because precision is eventually lost with doubles..
            progressBar.setProgress(progress+0.1);
            myLabel.setText(Math.round(progress*100) + "%");
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //could also just put this css in main.fxml, but just to show
        progressBar.setStyle("-fx-accent: cyan;");
    }
}
