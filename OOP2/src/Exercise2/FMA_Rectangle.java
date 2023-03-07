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
public class FMA_Rectangle extends FMA_GraphicObject{
int hight;
int width; 
int x,y;
FMA_Rectangle(int h,int w,int newX,int newY){
this.hight=h;
this.width=w;
this.x=newX;
this.y=newY;
}

public void draw(){
    System.out.println("Rectangle is begin drawn");
}
public void MoveTo(){
    System.out.println("Rectangle move to "+x+","+y+" axis");
}
public void resize(){
    System.out.println("Rectangle is Resized!");
}
public double area(){
return hight*width;
}
}
