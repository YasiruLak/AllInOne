package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class DashBoardFinalFormController {
    public AnchorPane DashBoardContext;

    public void OpenWindowOne(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) DashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/WindowAFinalForm.fxml "))));
    }

    public void OpenWindowTwo(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) DashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/WindowBFinalForm.fxml "))));
    }
}
