/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author 12fat
 */
public class Main {
   //Write a main program that offers a course entitled: "Object Oriented Programming" 
    //for his teacher "LeBron James". Add three students to this course
    public static void main(String[] args) {
        course course = new course(3,"Object Oriented Programming","LeBron James");
        course.printStudents();
    }
}
