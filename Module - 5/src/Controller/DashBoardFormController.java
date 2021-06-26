package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormController {
    public AnchorPane context;

    public void openWindowOne(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/WindowA.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);

    }

    public void openWindowTwo(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/WindowB.fxml");
        Parent load = FXMLLoader.load(resource);
        context.getChildren().clear();
        context.getChildren().add(load);
    }

}
