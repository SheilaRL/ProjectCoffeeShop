package com.example.projectjava;

import Clases.UserLists;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Class to store information about the login page.
 * @author sheilaRodríguez.
 */
public class LogInController implements Initializable
{
    private UserLists userLists;
    private TextField userName;

    private PasswordField password;

    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private Label labelName, labelPassword;
    private Button enterButton;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        userLists = new UserLists();
    }

    public void LogIn() throws IOException
    {
        userName = new TextField();
        password = new PasswordField();
        radioButton1 = new RadioButton("Employee");
        radioButton2 = new RadioButton("Client");
        enterButton = new Button("Enter");

        enterButton.setOnAction(e -> {
            try {
                enterButton();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    /**
     * Function to make the enter button work and enter the application
     */
    public void enterButton() throws IOException
    {
        String user = userName.getText();
        String passwd = password.getText();
        String typeUser = " ";

        if (radioButton1.isSelected())
        {
            typeUser = "Employee";
        }

        else
        {
            typeUser = "Client";
        }

        if (validUsers(user, passwd, typeUser))
        {
            if (typeUser.equals("Employee"))
            {
                employee(new ActionEvent());
            }

            else
            {
                client(new ActionEvent());
            }
        }
    }

    /**
     * Function to valid users by name and password
     */
    public boolean validUsers(String name, String password, String typeUser)
    {
        boolean resultado = true;

        if (name.equals("Employee1") && password.equals("1234") && typeUser.equals("Employee"))
        {
            resultado = true;
        }

        else if (name.equals("Client1") && password.equals("1234") && typeUser.equals("Client"))
        {
            resultado = true;
        }

        else
        {
            resultado = false;
        }
        return resultado;
    }

    /**
     * Functions to choose to enter as a employee or a client.
     */
    public void employee(ActionEvent event) throws IOException
    {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("EmployeePage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Employee page");
        stage.setMaxHeight(900);
        stage.setMaxWidth(600);
        stage.show();
    }

    public void client(ActionEvent event) throws IOException
    {
        Stage stage2 = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("ClientPage.fxml"));
        Scene scene2 = new Scene(root2);
        stage2.setScene(scene2);
        stage2.setTitle("Client page");
        stage2.setMaxHeight(900);
        stage2.setMaxWidth(600);
        stage2.show();
    }
}
