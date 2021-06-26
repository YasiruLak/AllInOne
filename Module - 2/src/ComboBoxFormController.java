import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ComboBoxFormController {
    public ComboBox<String> cmbLanguages;
    public TextField txtAnswer;

    public void initialize() {
        cmbLanguages.getItems().addAll(
                "Java",
                "Java Script",
                "C++",
                "Swift",
                "C#"
        );
        cmbLanguages.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(oldValue);
            System.out.println(newValue);
            txtAnswer.setText(newValue);
        });
    }
}

