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
public class Exercise1_Date2 {
    //Date class that composed of three attributes: name,  month, year and day; so the class contains three Data Members
    String name;
    int month;
    int year;
    int day;
    //DisplayMethod to display your name and  date as day/ month / year
  public void DisplayMethod() {
       System.out.println("Name is : " + name );
       System.out.println("born on : "+day+"/"+month+"/"+year);
  }//Display Method
}//main class
//Test the Date class. By creating a date object  that contains my date of birth  then print it.
class test1{
public static void main(String[] args) {
    Exercise1_Date2 FMA_object = new Exercise1_Date2();
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name? ");
    FMA_object.name=input.next();
    System.out.println("What day were you born? ");
    FMA_object.day=input.nextInt();
    System.out.println("In what month were you born? ");
    FMA_object.month=input.nextInt();
    System.out.println("What year were you born? ");
    FMA_object.year=input.nextInt();
    FMA_object.DisplayMethod();
}//main method 
}//class test
