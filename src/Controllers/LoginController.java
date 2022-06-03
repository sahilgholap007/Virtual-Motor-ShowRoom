package Controllers;


import java.io.IOException;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import DBConnection.DBHandler;
public class LoginController implements Initializable {


    @FXML
    private JFXButton SignUp;
    
    @FXML
    private TextField username;

    @FXML
    private JFXButton Login;

    @FXML
    private JFXCheckBox RememberMe;

    @FXML
    private JFXButton ForgotPassword;

    @FXML
    private PasswordField password;

    @FXML
    private ImageView progress;
    
    private DBHandler handler;
    private Connection connection;
    private PreparedStatement pst;
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		progress.setVisible(false);	
		
		
		username.setStyle("-fx-text-inner-color: white");
		password.setStyle("-fx-text-inner-color: white");
		
		handler = new DBHandler();
	}
	
	
	@FXML
	public void loginAction(ActionEvent e) throws IOException {
		
		progress.setVisible(true);
		PauseTransition pt = new PauseTransition();
		pt.setDuration(Duration.seconds(3));
		pt.setOnFinished(ev ->{
			
			// RETRIVE DATA
			
			connection = handler.getConnection();
			String q1 = "SELECT * from project where names=? and password=?";
			
			try {
				pst = connection.prepareStatement(q1);
				pst.setString(1, username.getText());
				pst.setString(2, password.getText());
				
				ResultSet rs = pst.executeQuery();
				
				int count = 0;
				
				while(rs.next())
				{
					count=count+1;	
				}
				
				if(count==1) 
				{
					Login.getScene().getWindow().hide();
					
					Stage home = new Stage();
					try {
					Parent root = FXMLLoader.load(getClass().getResource("/FXML/HomePage.fxml"));
					
					Scene scene = new Scene(root);
					home.setScene(scene);
					home.show();
					
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
					
				}
				else 
				{
					Alert alert = new Alert(Alert.AlertType.ERROR);
				    alert.setHeaderText(null);
				    alert.setContentText("Username or Password is invalid");
				    alert.show();
				    progress.setVisible(false);
				   
				}		
			
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			
			finally {
				try {
					connection.close();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				}
			
			
		});
		pt.play();
		
		
		
	}
	
	@FXML
	public void SignUp(ActionEvent e1) throws IOException {
		
		Login.getScene().getWindow().hide();
		
		Stage signup = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/SignUp.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
		signup.setScene(scene);
		signup.show();
		signup.setResizable(false);
	}
	
}
	

