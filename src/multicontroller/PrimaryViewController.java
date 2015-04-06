/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Brian
 */
public class PrimaryViewController implements Initializable {

    static int counter = 0;
    int myCounter;

    private Main mainApp;

    public PrimaryViewController() {
        myCounter = counter++;
        System.out.println("PVC::ctor() " + myCounter);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("PVC::initialize() " + myCounter);
    }

    public void setMainApp(Main mainApp) {
        System.out.println("PVC::setMainApp()::" + myCounter);
        this.mainApp = mainApp;
        System.out.println("mainApp=" + mainApp);
    }

    @FXML
    protected void handleButtonAction(ActionEvent event) {
        System.out.println("PVC Button " + mainApp.getModelData().getMyCounter());
    }
}
