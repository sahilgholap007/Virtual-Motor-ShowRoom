package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HarleyDavidsonController {
	
    @FXML
    private JFXButton FatBob;

    @FXML
    private JFXButton HeritageClassic;

    @FXML
    private JFXButton LowRider;

    @FXML
    private JFXButton back;

    @FXML
    void FatBob(ActionEvent event) throws IOException {
    	
        FatBob.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/FatBob.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }

    @FXML
    void HeritageClassic(ActionEvent event) throws IOException {
    	
        FatBob.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/HeritageClassic.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }

    @FXML
    void LowRider(ActionEvent event) throws IOException {
    	
        LowRider.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/LowRiders.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }

    @FXML
    void back(ActionEvent event) throws IOException {
    	
        back.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BikeBrands.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }

}
