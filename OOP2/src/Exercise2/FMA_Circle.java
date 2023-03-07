/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;


/**
 *
 * @author 12fat
 */
public class FMA_Circle extends FMA_GraphicObject{
double radious;
int x,y;
FMA_Circle(double r,int newX,int newY){
radious=r;
x=newX;
y=newY;
}

public void draw(){
    System.out.println("Circle is begin drawn");
}
public void MoveTo(){
    System.out.println("Circle move to "+x+","+y+" axis");
}
public void resize(){
    System.out.println("Circle is Resized!");
}
public double area(){
double a=Math.PI*this.radious*this.radious;
return a;
}
}