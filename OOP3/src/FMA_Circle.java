/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
class FGA_Circle{
private double radius;
private String color;

//كونستركترات
FGA_Circle(){
this.radius=1.0;
this.color="red";
}
FGA_Circle(double radius){
this.radius=radius;
}
FGA_Circle(double radius,String color){
this.radius=radius;
this.color=color;
}
//grtters
public double getRadius(){
return this.radius;
}
public String getColor(){
return this.color;
}
public double getArea(){
return Math.PI*radius*radius;
}
//setters
public void setRadius(double radius){
this.radius=radius;
}
public void setcolor(String color){
this.color =color;
}
//Describle itself
public String toString(){
return "radius="+radius+" ,color="+color;
}
}