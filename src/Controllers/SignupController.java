package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.*;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import DBConnection.DBHandler;

public class SignupController implements Initializable {
	
	  @FXML
	    private AnchorPane Parentpane;

	    @FXML
	    private TextField name;

	    @FXML
	    private TextField loc;

	    @FXML
	    private TextField pass;

	    @FXML
	    private JFXButton login;

	    @FXML
	    private JFXButton signup;

	    @FXML
	    private JFXRadioButton male;

	    @FXML
	    private ToggleGroup Gender;

	    @FXML
	    private JFXRadioButton female;

	    @FXML
	    private ImageView progress;
	    
	    private Connection connection;
	    private DBHandler handler;
	    private PreparedStatement pst;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		progress.setVisible(false);
		name.setStyle("-fx-text-inner-color: #ffffff;");
		pass.setStyle("-fx-text-inner-color: #ffffff;");
		loc.setStyle("-fx-text-inner-color: #ffffff;");
		
		handler = new DBHandler();
	}
	
	
	@FXML
	public void SignUp(ActionEvent ae3) {
		progress.setVisible(true);
		PauseTransition pt = new PauseTransition();
		pt.setDuration(Duration.seconds(3));
		pt.setOnFinished(ev ->{
			System.out.println("SignUp sucessful");
		});
		pt.play();
		
		String insert = "INSERT INTO project(names,password,gender,Email)"
				+ "VALUES(?,?,?,?)";
		
		connection = handler.getConnection();
		try {
			pst = connection.prepareStatement(insert);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			pst.setString(1, name.getText());
			pst.setString(2, pass.getText());
			pst.setString(3, getGender());
			pst.setString(4, loc.getText());
			
			pst.executeUpdate();
			
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		}
	
	
	@FXML
	public void loginAction(ActionEvent ae2) throws IOException {
		signup.getScene().getWindow().hide();
		
		Stage login = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/LoginMain.fxml"));
		Scene scene = new Scene(root);
		login.setScene(scene);
		login.show();
		login.setResizable(false);
		
	}
	
	public String getGender() {
		String gen ="";
		
		if(male.isSelected()){
			gen = "male";
		}
		else if(female.isSelected()){
			gen = "female";
		}
	
		return gen;
		
	}
	

}
