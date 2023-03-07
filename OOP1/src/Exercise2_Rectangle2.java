/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * حل الاكسرسايز الاول برمجة شيئية لو كان المستخدم هو اللي بيدخل
 */
import java.util.Scanner;
public class Exercise2_Rectangle2 {
    //class Rectangle has two data members :length and width of rectangle
    int length;
    int width ;
    //method calculateArea will return the area of rectangle
  public void calculateArea() {
      //* Area of rectangle = width * hight
       System.out.println("The area of rectangle is " + length * width );
  }//method calculateArea
}//main class

//class runner that will create an object of Rectangle class, add values for length and width, then invoke the method calculateArea. 
class runner1{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Exercise2_Rectangle2 FMA_object = new Exercise2_Rectangle2();
    System.out.println("What is the length of the rectangle whose area you want to calculate? ");
    FMA_object.length=input.nextInt();
    System.out.println("What is the length of the width you want to calculate its area? ");
    FMA_object.width=input.nextInt();
    FMA_object.calculateArea();
}//main method 
}//class runner1