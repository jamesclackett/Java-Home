package datepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller {
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label dateLabel;

    public void changeDate(ActionEvent event){
        LocalDate date = datePicker.getValue();
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd MM yyyy"));
        dateLabel.setText(formattedDate);
    }
}
