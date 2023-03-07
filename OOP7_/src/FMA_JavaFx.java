/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
import javafx.application.Application;  
import javafx.scene.Group;
import javafx.stage.Stage;  
import javafx.scene.control.Button;  
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;  
public class FMA_JavaFx extends Application {
// @Override  
 public void start(Stage primaryStage) throws Exception {  
 // TODO Auto-generated method stub  
 //Create a Button
 Button Buttonbtn1=new Button("Say, Hello World");  
 //Create a layout and add button to it
 Group root=new Group();  
 root.getChildren().add(Buttonbtn1);  
 //Create a Scene
 Scene scene=new Scene(root);
 //Prepare the Stage
 primaryStage.setScene(scene);  
 primaryStage.setTitle("First JavaFX Application");  
 primaryStage.show();  
}  
 //Create the main method
    public static void main(String[] args) {
        Application.launch(args);
    }

}