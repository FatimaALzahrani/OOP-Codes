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
// Point.java Il Definition of class Point
public class FMA_Point implements FMA_Shape{
protected int x, y; // coordinates of the Point
public FMA_Point(){//نستخدم الكونستركتر اذا بنكتب بعد نيو اسم الكلاس
// no-argument constructor public Point()
setPoint(0, 0);//ميثود تاخذ متغيرين 
}
// constructor
public FMA_Point( int xCoordinate, int yCoordinate ){
setPoint(xCoordinate, yCoordinate );
}
// Set x and y coordinates of Point
public void setPoint( int xCoordinate, int yCoordinate){
x = xCoordinate;
y = yCoordinate;
}
//get x coordinate 
public int getXO(){
return x;}
//get y coordinate
public int getY(){
return y;}
//convert point into String representation
public String toString(){//اعادة تعريف الميثود الموجوده بكلاس الاوبجكت
return String.format("%d, %d", x, y );
}
// calculate area 
public double area(){
return 0.0;
}
//calculate volume 
public double volume(){
return 0.0;
}
//return shape name 
public String getName(){
return "Point";
}
}// end class Point
