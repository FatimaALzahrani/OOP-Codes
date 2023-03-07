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
public class Student {
    //Add the following attributes to the Student class : 
    int number;
    String name;
    int age;
    //هذي اضافة عشان احط للطلاب اسماء 
    Student(){}
    Student(int number,String name,int age){
    this.number=number;
    this.name=name;
    this.age=age;
    }
    //Add the following methods to the Student class : 
    public int getNumber(){
    return this.number;
    }
    //هذول ما قالتهم بس حطت نقاط فاتوقع تقصد نحطهم
    public String getName(){
    return this.name;
    }
    public int getAge(){
    return this.age;
    }
}
