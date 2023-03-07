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
// Definition of class Cylinder.
public class FMA_Cylinder extends FMA_Circle{
protected double height; // height of Cylinder
//no-argument constructor
public FMA_Cylinder(){
// implicit call to superclass constructor here 
setHeight(0);
}
// constructor
public FMA_Cylinder( double cylinderHeight, double cylinderRadius,int xCoordinate, int yCoordinate ){
//call superclass constructor 
super( cylinderRadius, xCoordinate, yCoordinate );
setHeight(cylinderHeight);
//set height of Cylinder 
}
public void setHeight( double cylinderHeight){
height = ( cylinderHeight >= 0 ? cylinderHeight: 0);
}
//get height of Cylinder 
public double getHeight(){
return height;
}
//calculate area of Cylinder (ie.. surface area) 
public double area(){
return 2* super.area() + 2 * Math.PI*radius * height;
}
//calculate volume of Cylinder 
public double volume(){
return super.area() * height;
}
//convert Cylinder to a String representation 
public String toString(){
 return super.toString() + "; Height = " + getHeight();
}
//return shape name 
public String getName(){
return "Cylinder";
} // end class Cylinder

}