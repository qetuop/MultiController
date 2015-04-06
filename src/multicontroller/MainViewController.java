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
import javafx.scene.Node;
import javafx.scene.control.Label;

/**
 *
 * @author Brian
 */
public class MainViewController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private Node primary;   // Class from ?PrimaryView.fxml (AnchorPane inherits from Node) // name from MainView.fxml? fx:id="primary" 
    
    // controller for included component fx:id="primary" will be
    // injected by FXMLLoader if it finds a variable whose name is composed of the
    // include element fx:id followed by "Controller" => in our case that's 
    // "primaryController"
    @FXML
    private PrimaryViewController primaryController;

    @FXML
    private Node secondary;   
    @FXML
    private SecondaryViewController secondaryController;
    
    private Main mainApp;

    static int counter = 0;
    int myCounter;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    public MainViewController() {
        myCounter = counter++;
        System.out.println("MVC::ctor() " + myCounter);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("MVC::initialize()");
        System.out.println(primaryController);
        System.out.println(primary);
        System.out.println(secondaryController);
        System.out.println(secondary);
        
        // its too late/early to set here
        // setMainApp has not been called yet, mainApp is still null
        //primaryController.setMainApp(mainApp);
    }

    public void setMainApp(Main mainApp) {
        System.out.println("MVC::setMainApp()::" + myCounter);
        this.mainApp = mainApp;
        System.out.println("mainApp=" + mainApp);
        
        // hopefully it's not too late to call this here
        //PC/SC can't use the main app in its initalize/ctor
        primaryController.setMainApp(mainApp);
        secondaryController.setMainApp(mainApp);
    }

}
