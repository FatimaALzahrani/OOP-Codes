/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

/**
 *
 * @author 12fat
 */
 // Definition of class Circle
public class FMA_Circle extends FMA_Point{
protected double radius;
//no-argument constructor
public FMA_Circle(){
// implicit call to superclass constructor here 
setRadius(0);
}
//constructor
public FMA_Circle( double circleRadius, int xCoordinate, int yCoordinate){
super(xCoordinate, yCoordinate ); // call superclass constructor
setRadius( circleRadius);
}
// set radius of Circle
public void setRadius( double circleRadius ){
radius = ( circleRadius >= 0 ? circleRadius : 0);
}
//get radius of Circle 
public double getRadius(){
return radius;
}
//calculate area of Circle 
public double area(){
return Math.PI* radius * radius;
}
//convert Circle to a String represention 
public String toString(){
return String.format( "Center = [%s]; Radius = %f",super.toString(), radius);
}
// return shape name 
public String getName(){
return "Circle"; } 
}// end class Circle

