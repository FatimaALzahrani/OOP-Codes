/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
class FMA_Cylinder extends FGA_Circle{
private double height;
public FMA_Cylinder(){
this.height=1.0;
}

public FMA_Cylinder(double radius, double height){
super(radius);
this.height=height;
}

public FMA_Cylinder(double radius,double hieght,String color){
super(radius,color);
this.height=hieght;
}

public double getHeight(){
return height;
}

public void setHeight(double height){
this.height=height;
}
public double getBaseArea(){
return Math.PI*getRadius()*getRadius();
}
public double getArea(){
return (2*Math.PI*getRadius())*(getRadius()*height);
}
public double getSurfaceArea(){
return 2*Math.PI*getRadius()*height + 2*getBaseArea();
}
public double getVolume(){
return(super.getArea())*height;
}
public String ToString(){
return "height="+height+"radius="+getRadius()+" ,color="+getColor();
}
}