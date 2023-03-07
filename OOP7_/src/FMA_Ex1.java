/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
import javafx.scene.shape.Rectangle;
import javafx.application.Application;  
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.stage.Stage;  
import javafx.scene.control.*; 
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;  
import javafx.scene.image.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
public class FMA_Ex1 extends Application {
// @Override  
 public void start(Stage primaryStage) throws Exception {  
  primaryStage.setTitle("Ex1 Application");  
  StackPane g=new StackPane();
  GridPane sp = new GridPane(); 
  //•Geometrical (Graphical) objects (2D and 3D) such as − Circle, Rectangle, Polygon, etc.
  Rectangle rect1 = new Rectangle();
      rect1.setX(1500.0f);
      rect1.setY(1500.0f);
      rect1.setWidth(450.0f);
      rect1.setHeight(450.0f);
      rect1.setFill(Color.LIGHTBLUE);
      rect1.setStrokeWidth(1);
      rect1.setStroke(Color.DARKSLATEGREY);  
   //•UI Controls such as − Button, Checkbox, Choice Box, Text Area, etc.
 Text scenetitle = new Text("Welcme Dr.Samia in my Appliction :)");
 scenetitle.setFont(
Font.font("Tahoma", 20)); 
sp.add(scenetitle, 0, 0);
Label userName = new Label("User Name:"); 
//sp.add(userName, 0, 2);
//1- text area
TextField userTextField = new TextField();
//sp.add(userTextField,1, 2);
Label pw = new Label("Password: ");
//sp.add(pw, 0, 3);
PasswordField pwBox = new PasswordField();
//sp.add(pwBox, 1, 3);
//2-Choice Box
Label chbx1 = new Label("chose your Gender :");
ChoiceBox<String> choiceBox = new ChoiceBox<String>();
ObservableList<String> list = choiceBox.getItems();
list.add("male");
list.add("fmale");
//3-Check Box
Label chb = new Label("I agree to the terms and conditions");
CheckBox ck = new CheckBox();
//4- Button
Button Buttonbtn1=new Button("Log in");  
  //•Media elements such as Audio, Video and Image Objects.
 Image img=new Image("787e1d2cdbecee74f0ff6469298ea99c.jpg");
 ImageView imgview=new ImageView(img);
 // بسوي ليبل بس عشان احط سطر بين الاشياء ترتيب بس
 Label Line = new Label(" ");  
 Label Line2 = new Label(" ");  
 Label Line3= new Label(" ");  
 Label Line4 = new Label(" ");  
 Label Line5 = new Label(" ");  
 Label Line6 = new Label(" ");  
 //
 sp.add(Line,0, 1); 
 sp.add(imgview, 0,2);
HBox user = new HBox(userName,userTextField);
HBox pas = new HBox(pw,pwBox);
HBox root = new HBox(chbx1,choiceBox);
HBox chekb = new HBox(ck,chb);
sp.add(Line6,0, 3); 
sp.add(user,0, 4); 
sp.add(Line2,0, 5); 
sp.add(pas,0, 6); 
sp.add(Line3,0, 7); 
sp.add(root,0, 8); 
sp.add(Line4,0, 9); 
sp.add(chekb,0,10);
sp.add(Line5,0, 11); 
sp.add(Buttonbtn1,0,12); 
 g.getChildren().add(rect1);
 g.getChildren().add(sp);
//set button action 
       Label l = new Label();
        Buttonbtn1.setOnAction((ActionEvent e)->{
        l.setText(userName.getText());
       });
 //Create a Scene
 Scene scene=new Scene(g);
 //Prepare the Stage
 primaryStage.setScene(scene);  
 primaryStage.show();  
}  
 //Create the main method
    public static void main(String[] args) {
        Application.launch(args);
    }

}