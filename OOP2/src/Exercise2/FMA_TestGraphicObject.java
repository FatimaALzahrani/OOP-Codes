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
import java.util.Scanner;
public class FMA_TestGraphicObject {
    public static void main(String[] args) {
        // create a Human object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle and the new points that move it x and y in order:");
        double r=input.nextDouble();
        int x=input.nextInt();
        int y=input.nextInt();
        System.out.println("Enter the height and width of the rectangle and the new points that you move to x and y in order:");
        int h=input.nextInt();
        int w=input.nextInt();
        int x2=input.nextInt();
        int y2=input.nextInt();
        FMA_GraphicObject Circle = new FMA_Circle(r,x,y);
        FMA_GraphicObject Rectangle = new FMA_Rectangle(h,w,x2,y2);
        // call all the methods for each object
        System.out.println("For Circle object:");
        System.out.println("the area of a circle is "+Circle.area());
        Circle.MoveTo();
        Circle.draw();
        Circle.resize();
        System.out.println("________________________________");
        System.out.println("the area of a rectangle is "+Rectangle.area());
        Rectangle.MoveTo();
        Rectangle.draw();
        Rectangle.resize();
    }
}

