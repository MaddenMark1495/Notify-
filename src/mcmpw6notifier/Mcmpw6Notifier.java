/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcmpw6notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author markmadden
 */
public class Mcmpw6Notifier extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        TextField info = new TextField();
      
        Button btn1 = new Button();
        btn1.setText("Notify");
        btn1.setOnAction((ActionEvent event) -> {
            info.setText("You have been Notified");
        });
        
        Button btn2 = new Button();
        btn2.setText("Clear");
        btn2.setOnAction((ActionEvent event) -> {
            info.setText("");
        });
        
        
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.add(info, 0, 0);
        root.add(btn1,1,0);
        root.add(btn2,1,1);
        root.setAlignment(Pos.CENTER);
        
        
        
        
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("Notifier");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
