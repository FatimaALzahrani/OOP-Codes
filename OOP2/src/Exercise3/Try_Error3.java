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
public class Try_Error3 {
    public static void main(String args[]){
FMA_Circle circle = new FMA_Circle(3.5, 22, 8);
//FMA_Cylinder cylinder = new FMA_Cylinder(10,3.3, 10, 10);
FMA_Cylinder arrayOfCylinder[]= new FMA_Cylinder[3]; 
FMA_Point arrayOfPoint[]= new FMA_Point[3];
//FMA_Cylinder cylinder=(FMA_Cylinder)new FMA_Point(7,11);
//FMA_Point cylinder2=(FMA_Point)cylinder;

FMA_Point point = new FMA_Point(7,11);
FMA_Circle circle2 = new FMA_Circle(3.5, 22, 8);
FMA_Cylinder arrayOfShapes[]= new FMA_Cylinder[2]; // create Shape array
arrayOfShapes[0] =(FMA_Cylinder) point;
arrayOfShapes[1] =(FMA_Cylinder) circle2;

FMA_Circle Circle=new FMA_Cylinder(10,3.3, 10, 10);
FMA_Cylinder cy=(FMA_Cylinder)Circle;
FMA_Circle Circle2=new FMA_Circle(3.3, 10, 10);
        System.out.println(cy);
        System.out.println(Circle);
    }
}


/*

*/