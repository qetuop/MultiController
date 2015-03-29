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
import javafx.scene.control.Label;

/**
 *
 * @author Brian
 */
public class MainViewController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML private PrimaryViewController primaryView;
    @FXML private SecondaryViewController secondaryView;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    public MainViewController() {
        System.out.println("MVC::ctor()");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("MVC::initialize()");
        
        //secondaryView.setPrimaryController(PrimaryView2);
    }    
    
}
