package org.example.tirdjavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {

    public TextField textField;

    @FXML
    protected void fillQuestionaire() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("QuestionWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        QuestionWindowController questionWindowController = fxmlLoader.getController();
        questionWindowController.setLabelUser(textField.getText());
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}