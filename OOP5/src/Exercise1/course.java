/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

import java.util.Scanner;

/**
 *
 * @author 12fat
 */
public class course {
    String courseName;
    int noOfStudents;
    String teacher;
    //Course() : default constructor
    course(){
    //defult
    }
    //Course(para1, para2, para3)
    course(int para1, String para2, String para3){
    this.courseName=para2;
    this.noOfStudents=para1;
    this.teacher=para3;
    }
    //Add the following methods to the course class : 
    String getCourseName(){
    return this.courseName;
    }
    void setCourseName(String courseName){
    this.courseName=courseName;
    }
    //حتى هنا نقاط اتوقع تقصد نكمل للباقي نحط قيت وسيت
    int getNoOfStudents(){
    return this.noOfStudents;
    }
    String getTeacher(){
    return this.teacher;
    }
    void setNoOfStudents(int noOfStudents){
    this.noOfStudents=noOfStudents;
    }
    void setTeacher(String teacher){
    this.teacher=teacher;
    }
    //printStudents() : to print all students
    void printStudents() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number and name and age of "+noOfStudents+" Student");
        for(int i=0;i<noOfStudents;i++){
            int num=input.nextInt();
            String name=input.next();
            int age=input.nextInt();
            Student student = new Student(num,name,age);
            System.out.println("Number : "+student.getNumber());
            System.out.println("Name : "+student.getName());
            System.out.println("Number : "+student.getAge());
            System.out.println();
}
    }
}
