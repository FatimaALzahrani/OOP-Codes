/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
import java.util.Scanner;
public class FMA_TestCylinder {
 public static void main(String[] args) {
 FMA_Cylinder cy1 = new FMA_Cylinder(); 
 System.out.println("Radius is " + cy1.getRadius() + " Height is " + cy1.getHeight()  + " Color is " + cy1.getColor() 
 + " Base area is " + cy1.getArea() + " Volume is " + cy1.getVolume());
 FMA_Cylinder cy2 = new FMA_Cylinder(5.0, 2.0);
 System.out.println("Radius is " + cy2.getRadius() + " Height is " + cy2.getHeight()  + " Color is " + cy2.getColor() 
 + " Base area is " + cy2.getArea() + " Volume is " + cy2.getVolume());
     Scanner sc = new Scanner(System.in);
//     System.out.println("***Circle***");
//     System.out.println("--------------");
//     System.out.println("Please inter the circle's base radius:");
//     System.out.println("--------------");
//     double rr=sc.nextDouble();
//     System.out.print("Please inter the circle's height:");
//     System.out.println("--------------");
//      FMA_Circle cy4 = new FMA_Circle(rr,"red");
//     System.out.println("Cylinder information base radiues="+cy4.getRadius()+" ,color="+cy4.getColor()+
//             " , area="+cy4.getArea());

//     System.out.println("***Cylinder***");
//     System.out.println("--------------");
//     System.out.println("Please inter the cylinder's base radius:");
//     System.out.println("--------------");
//     double r=sc.nextDouble();
//     System.out.print("Please inter the cylinder's height:");
//     double h=sc.nextDouble();
//     System.out.println("--------------");
//      FMA_Cylinder cy3 = new FMA_Cylinder(r, h,"red");
//     System.out.println("Cylinder information base radiues="+cy3.getRadius()+" ,color="+cy3.getColor()+" ,height="+cy3.getHeight()+
//             " ,base area="+cy3.getBaseArea()+" \n,Surface area="+cy3.getSurfaceArea()+" ,volume="+cy3.getVolume());
 } 
}
