/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * حل الاكسرسايز الاول برمجة شيئية لو البيانات بدون مستخدم 
 */
public class Exercise1_Date {
    //Date class that composed of three attributes: name,  month, year and day; so the class contains three Data Members
    String name;
    int month;
    int year;
    int day;
    //DisplayMethod to display your name and  date as day/ month / year
  public void DisplayMethod() {
       System.out.println("My Name is " + name );
       System.out.println(day+"/"+month+"/"+year);
  }//Display Method

}//main class
//Test the Date class. By creating a date object  that contains my date of birth  then print it.
class test{
public static void main(String[] args) {
    Exercise1_Date FMA_object = new Exercise1_Date();
    FMA_object.name="Fatimah";
    FMA_object.day=3;
    FMA_object.month=5;
    FMA_object.year=1423;
    FMA_object.DisplayMethod();
}//main method 
}//class test
