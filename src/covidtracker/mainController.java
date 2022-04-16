/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtracker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 *
 * @author absasahu
 */
public class mainController implements Initializable {
    
    
    @FXML
    private TabPane tabpane;
    @FXML
    private Tab dashboardtab;
    @FXML
    private Tab tableViewTab;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            Node node= FXMLLoader.load(getClass().getResource("tableViewfxml.fxml"));
            tableViewTab.setContent(node);
        } catch (IOException ex) {
            Logger.getLogger(mainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}
