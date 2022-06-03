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
import javafx.stage.Stage;


public class BookingController implements Initializable {
	
    @FXML
    private JFXButton Back;

    @FXML
    private JFXButton Book;

    @FXML
    private TextField addresss;

    @FXML
    private DatePicker date;

    @FXML
    private TextField fnames;

    @FXML
    private TextField lnames;

    @FXML
    private TextField number;

    @FXML
    private TextField pincodes;
    
    @FXML
    private TextField Models;
    
    @FXML
    private TextField Amounts;
    
    @FXML
    private TextField emails;
    
    private Connection connection;
    private DBHandler handler;
    private PreparedStatement pst;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	handler = new DBHandler();
    	
    	fnames.setStyle("-fx-text-inner-color: white");
    	lnames.setStyle("-fx-text-inner-color: white");
    	number.setStyle("-fx-text-inner-color: white");
    	date.setStyle("-fx-text-inner-color: white");
    	pincodes.setStyle("-fx-text-inner-color: white");
    	Models.setStyle("-fx-text-inner-color: white");
    	Amounts.setStyle("-fx-text-inner-color: white");
    	emails.setStyle("-fx-text-inner-color: white");
    	addresss.setStyle("-fx-text-inner-color: white");
    	
    	}
    
    @FXML
    void PreviousPage(ActionEvent event) throws IOException {
    	
        Back.getScene().getWindow().hide();
     	
     	Stage home = new Stage();	    	
     	Parent root = FXMLLoader.load(getClass().getResource("/FXML/CarBrands.fxml"));
     	Scene scene = new Scene(root);
     	home.setScene(scene);
     	home.show();


    }
    
    
    @FXML
    void BookingFinal(ActionEvent event) throws IOException {   
    	
        Book.getScene().getWindow().hide();
      	
      	FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/OrderSummary.fxml"));
      	Parent root = loader.load();
        
      	OrderSummaryController Scene2Controller = loader.getController();
      	
      	Scene2Controller.ShowInformation(fnames.getText(),lnames.getText(),addresss.getText(), Amounts.getText() ,Models.getText(), pincodes.getText(), emails.getText() );
      	
       	Stage home = new Stage();	    	
       	Scene scene = new Scene(root);
       	home.setScene(scene);
       	home.show();
    	
		String insert = "INSERT INTO booknow(fname,lname,address,date,pincode,mobnumber,model,amount)"
				+ "VALUES(?,?,?,?,?,?,?,?)";
		
		connection = handler.getConnection();
		try {
			pst = connection.prepareStatement(insert);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {	
			
			pst.setString(1, fnames.getText());
			pst.setString(2, lnames.getText());
			pst.setString(3, addresss.getText());
			pst.setString(4, ((TextField)date.getEditor()).getText());
			pst.setString(5, pincodes.getText());
			pst.setString(6, number.getText());
			pst.setString(7, Models.getText());
			pst.setString(8, Amounts.getText());
			
			pst.executeUpdate();
			
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

    }
}
