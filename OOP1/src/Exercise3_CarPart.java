/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */

import javax.swing.JOptionPane;

public class Exercise3_CarPart {
private String modelNumber; 
private String partNumber; 
private String cost;

public void setparameter(String x, String y,String z) {
modelNumber=x; 
partNumber=y; 
cost=z;
}//setparameter

public void display(){
System.out.println("Model Number: " + modelNumber + "  part Number: "+partNumber + " Cost " + cost);
}//display method
}//main class
class CarPartRunner {
public static void main(String [] args) {
Exercise3_CarPart car1=new Exercise3_CarPart ();
String x=JOptionPane.showInputDialog("What is Model Number?" );
String y=JOptionPane.showInputDialog("What is Part Number?" ); 
String z=JOptionPane.showInputDialog("What is Cost?" );
car1.setparameter(x,y,z);
car1.display();
String f=JOptionPane.showInputDialog("What is Model Number of car2?" );
String m=JOptionPane.showInputDialog("What is Part Number of car2?" ); 
String s=JOptionPane.showInputDialog("What is Cost of car2?" );
car1.setparameter(f,m,s);
car1.display();
}//main method
}//main class
