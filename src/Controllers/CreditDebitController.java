package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import DBConnection.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;



public class CreditDebitController implements Initializable {
	

    @FXML
    private JFXButton logout;

    @FXML
    private ToggleGroup card;

    @FXML
    private TextField cardno;

    @FXML
    private TextField cvv;
    
    @FXML
    private DatePicker expiry;

    @FXML
    private TextField name;

    @FXML
    private JFXButton pay;
    
    private Connection connection;
    private DBHandler handler;
    private PreparedStatement pst;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	handler = new DBHandler();
    	
    	cardno.setStyle("-fx-text-inner-color: white");
    	cvv.setStyle("-fx-text-inner-color: white");
    	expiry.setStyle("-fx-text-inner-color: white");
    	name.setStyle("-fx-text-inner-color: white");
    	
    	
    	}
    

    @FXML
    void pay(ActionEvent event) throws IOException {
    	
		String insert = "INSERT INTO carddetails(cardno,cvv,date,name)"
				+ "VALUES(?,?,?,?)";
		
		connection = handler.getConnection();
		try {
			pst = connection.prepareStatement(insert);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {	
			
			pst.setString(1, cardno.getText());
			pst.setString(2, cvv.getText());
			pst.setString(3, ((TextField)expiry.getEditor()).getText());
			pst.setString(4, name.getText());

			
			pst.executeUpdate();
			
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	    pay.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BookNow.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show(); 

    }
    
    @FXML
    void logout(ActionEvent event) throws IOException {
    	
	    logout.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/LoginMain.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show(); 

    }
    
}

