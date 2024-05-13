package com.example.projectjava;

import Clases.Client;
import Clases.Employee;
import Clases.User;
import Clases.UserLists;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Class to store information about the signIn page.
 * @author sheilaRodríguez.
 */
public class SignInController implements Initializable
{
    private UserLists userLists;
    private Button signInButton;
    private RadioButton radioButton1;
    private RadioButton radioButton2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        userLists = new UserLists();
    }

    /**
     * Function to register users, choose a radio button
     * and add users to the list.
     */
    public void signIn() throws IOException
    {
        String name, surname, email, password, phoneNumber,address;

        if (radioButton1.isSelected())
        {
            userLists.addUsers(new Employee());
        }

        else if (radioButton2.isSelected())
        {
            userLists.addUsers(new Client());
        }

        User users = new User();
        userLists.addUsers(users);
    }


    public void chooseEmployee(ActionEvent event) {
    }

    public void chooseClient(ActionEvent event) {
    }
}
