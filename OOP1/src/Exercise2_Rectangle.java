/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * حل الاكسرسايز الثاني برمجة شيئية لو كان المستخدم ما بيدخل
 */
public class Exercise2_Rectangle {
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
class runner{
public static void main(String[] args) {
    Exercise2_Rectangle FMA_object = new Exercise2_Rectangle();
    FMA_object.length=12;
    FMA_object.width=2;
    FMA_object.calculateArea();
}//main method 
}//class test