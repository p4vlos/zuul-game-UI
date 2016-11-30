/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import assignment2.mygame.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 *
 * @author Pavlos Nicoloau
 */
public abstract class FXMLDocumentController implements Initializable {
    
    
    @FXML 
    private TextArea textArea; //this is the big text area in the middle

   
    @FXML
    private void exitGame() {
       System.exit(1);
    }
    
    @FXML
    private void northClicked() {
        textArea.appendText("Go North button Clicked\n");
    }
    
    @FXML
    private void eastClicked() {
        textArea.appendText("Go East button Clicked\n");
    }
    
    @FXML
    private void southClicked() {
        textArea.appendText("Go South button Clicked\n");
    }
    
    @FXML
    private void westClicked() {
        textArea.appendText("Go West button Clicked\n");
    }
    
    @FXML
    private void dropClicked() {
        textArea.appendText("Drop button Clicked\n");
    }
    
    @FXML
    private void takeClicked() {
        textArea.appendText("Take button Clicked\n");
    }
    
    @FXML
    private void giveClicked() {
        textArea.appendText("Give button Clicked\n");
    }
    
    @FXML
    private void helpClicked() {
        textArea.appendText("Help me know!\n");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public abstract boolean execute(Player player);
}
