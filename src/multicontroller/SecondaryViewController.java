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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;

/**
 * FXML Controller class
 *
 * @author Brian
 */
public class SecondaryViewController implements Initializable {

    private PrimaryViewController pvc;


    public SecondaryViewController() {
        System.out.println("SVC::ctor() ");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("SVC::initialize() ");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("PrimaryView.fxml"));
        try {
            Parent root = (Parent) loader.load();
        } catch (IOException ex) {
            Logger.getLogger(SecondaryViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
        pvc = loader.getController();
        System.out.println("1:PVC counter = " + pvc.getMycounter());

        URL location = getClass().getResource("PrimaryView.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
        try {
            Parent root = (Parent) fxmlLoader.load(location.openStream());
            pvc = fxmlLoader.getController();
            System.out.println("2:PVC counter = " + pvc.getMycounter());
        } catch (IOException ex) {
            Logger.getLogger(SecondaryViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setPrimaryController(PrimaryViewController ctrl) {
        this.pvc = ctrl;
    }

}
