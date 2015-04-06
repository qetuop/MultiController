/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicontroller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author Brian
 */
public class Main extends Application {

    //@FXML private AnchorPane primary;
    //@FXML private PrimaryViewController primary;
    
    //private ObservableList<Person> personData = FXCollections.observableArrayList();
    Model model = new Model();

    @Override
    public void start(Stage stage) throws Exception {
      
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("MainView.fxml"));
            Parent root = loader.load();
            
            MainViewController mvc = loader.getController();
            mvc.setMainApp(this);
      
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    public Model getModelData() {
        return model;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
