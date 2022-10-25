/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javagui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //remove code from here 
	Button btn = new Button();
        btn.setText("Say 'HAI'");
        btn.setLayoutX(0);
        btn.setLayoutY(100);
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("HELLO");
        });
        
        Button btn2 = new Button();
        btn2.setText("KLIK");
        btn2.setLayoutX(500);
        btn2.setLayoutY(400);
        
//        
        Group root = new Group();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        
        Scene scene = new Scene(root, 600, 450);
        
        primaryStage.setTitle("Hello Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
	//to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}