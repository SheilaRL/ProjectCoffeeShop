package com.example.projectjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Class to store information about the welcome page.
 * @author sheilaRodríguez.
 */
public class WelcomePageController implements Initializable
{
    @FXML
    private Button ButtonLogIn;
    @FXML
    private Button ButtonSignIn;
    @FXML
    private Pane welcomePanel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }

    /**
     * Function to choose between logIn or signIn
     */
    public void logIn(ActionEvent actionEvent) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("LogInPage.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Log in");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

    public void signIn(ActionEvent actionEvent) throws IOException
    {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("SignInPage.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Employee page");
        stage.setMaxHeight(900);
        stage.setMaxWidth(600);
        stage.show();
    }
}
