/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Brian
 */
public class PrimaryViewController implements Initializable {
    static int counter = 0;
    int myCounter;
    
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
    
    public int getMycounter() { return myCounter;}
    
}
