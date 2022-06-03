package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BookingFinal {
	
    @FXML
    private JFXButton ExploreMore;

    @FXML
    void StartPage(ActionEvent event) throws IOException {
    	
        ExploreMore.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/HomePage.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show();

    }

}
