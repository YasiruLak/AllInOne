package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowAFinalFormController {
    public AnchorPane windowAContext;

    public void backToHome(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) windowAContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoardFinalForm.fxml"))));
    }
}
