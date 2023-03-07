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
public class FMA_Test {
//Test Point, Circle, Cylinder hierarchy with interface shape.
//test Shape hierarchy 
    public static void main(String args[]){
//create shapes 
FMA_Point point = new FMA_Point(7,11);
FMA_Circle circle = new FMA_Circle(3.5, 22, 8);
FMA_Cylinder cylinder = new FMA_Cylinder(10,3.3, 10, 10);
FMA_Shape arrayOfShapes[]= new FMA_Shape[3]; // create Shape array
arrayOfShapes[0] = point;
arrayOfShapes[1] = circle;
arrayOfShapes[2] = cylinder;
//get name and String representation of each shape 
System.out.printf("%s: %s\n%s: %s\n%s: %s\n", point.getName(),point, circle.getName(), circle, cylinder.getName(), cylinder);
//point -> tostring اذا استدعيت اسم الاوبجكت بيطبع 
//get name, area and volume of each shape in arrayOfShapes
for (FMA_Shape shape : arrayOfShapes){
System.out.printf("\n\n%s: %s\nArea = %2f\nVolume = %2f\n",shape.getName(), shape, shape.area(), shape.volume()); 
}//end for
}//end main 
}//end class Test
