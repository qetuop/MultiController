/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicontroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import static multicontroller.PrimaryViewController.counter;

/**
 * FXML Controller class
 *
 * @author Brian
 */
public class SecondaryViewController implements Initializable {

    static int counter = 0;
    int myCounter;

    private Main mainApp;

    public SecondaryViewController() {
        myCounter = counter++;
        System.out.println("SVC::ctor() " + myCounter);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("SVC::initialize() " + myCounter);
    }

    public void setMainApp(Main mainApp) {
        System.out.println("SVC::setMainApp()::" + myCounter);
        this.mainApp = mainApp;
        System.out.println("mainApp=" + mainApp);
    }

    @FXML
    protected void handleButtonAction(ActionEvent event) {
        System.out.println("SVC Button " + mainApp.getModelData().getMyCounter());
    }
}
