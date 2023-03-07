/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_6_LinkedList;


/**
 *
 * @author 12fat
 * 11. Write a Java program to shuffle the elements in a linked list. Sample Output:
Linked list before shuffling:                                          
[Red, Green, Black, Pink, orange]                                      
Linked list after shuffling:                                           
[orange, Pink, Red, Black, Green]
 */
import java.util.Collections;
import java.util.LinkedList;
public class FMA_Ex11 {
    public static void main(String[] args) {
        LinkedList<String> FMA_LinkedList = new LinkedList<String>();
        FMA_LinkedList.add("Red");
        FMA_LinkedList.add("Green");
        FMA_LinkedList.add("Black");
        FMA_LinkedList.add("Pink");
        FMA_LinkedList.add("Orange");
        System.out.println("Linked list before shuffling: ");
        System.out.println(FMA_LinkedList);
        System.out.println("Linked list after shuffling: ");
          Collections.shuffle(FMA_LinkedList);
        System.out.println(FMA_LinkedList);
        System.out.println("fatima".substring(3));
    }
}