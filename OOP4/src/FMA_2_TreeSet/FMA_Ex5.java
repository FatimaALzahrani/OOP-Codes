/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_2_TreeSet;


/**
 *
 * @author 12fat
 * 5. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element. Sample Output:
Strictly greater than 76 : 82                                          
Strictly greater than 31 : 36
 */
import java.util.TreeSet;
public class FMA_Ex5 {
  public static void main(String[] args) {
   TreeSet <Integer>FMA_TreeSet = new TreeSet<Integer>();     
   FMA_TreeSet.add(12);
   FMA_TreeSet.add(37);
   FMA_TreeSet.add(36);
   FMA_TreeSet.add(20);
   FMA_TreeSet.add(82);
   FMA_TreeSet.add(90);
   //  ُستخدم للعثور على عنصر أكبر من أو يساوي العنصر المحدد, عكس فلوور
   System.out.println("Strictly greater than 76 : "+FMA_TreeSet.higher(76));//or FMA_TreeSet.ceiling(76)
   System.out.println("Strictly greater than 31 : "+FMA_TreeSet.higher(31));
   }
}

