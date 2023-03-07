/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_5_ArrayList;


/**
 *
 * @author 12fat
 * 10. Write a Java program to print all the elements of a ArrayList using the position of the elements. Sample Output:
Original array list: [Red, Green, Black, White, Pink]                  
                                                                       
Print using index of an element:                                       
Red                                                                    
Green                                                                  
Black                                                                  
White                                                                  
Pink 
 */
import java.util.ArrayList;
public class FMA_Ex10 {
 public static void main(String[] args) {
  ArrayList <String> FMA_ArrayList = new ArrayList <String> ();
  FMA_ArrayList.add("Red");
  FMA_ArrayList.add("Green");
  FMA_ArrayList.add("Black");
  FMA_ArrayList.add("White");
  FMA_ArrayList.add("Pink");
  System.out.println("Original array list: " + FMA_ArrayList);
  System.out.println("\nPrint using index of an element: ");
  for (int i = 0; i < FMA_ArrayList.size(); i++)
   System.out.println(FMA_ArrayList.get(i));
 }
}
