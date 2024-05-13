package com.example.projectjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Class to store information about the employee page.
 * @author sheilaRodríguez
 */
public class EmployeePageController implements Initializable
{

    private Button reservationsOption;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }

    /**
     * Actions events to make the fxml move to another.
     */
    public void makeReservation(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Reservations.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Reservations");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }


    public void seeOrders(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Orders.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Orders");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }


    public void seeStock(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Stock.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Stock");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }
}
