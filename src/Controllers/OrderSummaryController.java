package Controllers;



import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class OrderSummaryController {
	
    @FXML
    private Text address;

    @FXML
    private Text amount;

    @FXML
    private Text email;

    @FXML
    private Text modelname;

    @FXML
    private Text fname;

    @FXML
    private Text pincode;
    
    @FXML
    private Text lname; 
    
    @FXML
    private JFXButton print;

    @FXML
    void print(ActionEvent event) throws IOException {
    	
	    print.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BookingFinal.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show(); 

    }
    
    public void ShowInformation(String fnames, String addresss, String pincodes, String lnames, String emails, String Amounts,String Models) {
    	
    	fname.setText(fnames);
    	lname.setText(lnames);
    	address.setText(addresss);
    	pincode.setText(pincodes);
    	email.setText(emails);
    	modelname.setText(Models);
    	amount.setText(Amounts);
   	
    	
    }
    

}
