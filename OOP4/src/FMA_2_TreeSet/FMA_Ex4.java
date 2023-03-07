/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_2_TreeSet;

/**
 *
 * @author 12fat
 * 4. Write a Java program to get the number of elements in a tree set. Sample Output:
Original tree set: [Black, Green, Pink, Red, orange]                   
Size of the tree set: 5 
 */
import java.util.TreeSet;
//ما تسمح بالتكرار , ترتب العناصر تصاعديا,وصول سريع, مايسمح بالنل,  add, search and remove take the time of O(log n) , 
public class FMA_Ex4 {
    public static void main(String[] args) {
     TreeSet<String> FMA_TreeSet = new TreeSet<String>();
          FMA_TreeSet.add("Black");
          FMA_TreeSet.add("Green");
          FMA_TreeSet.add("Pink");
          FMA_TreeSet.add("Red");
          FMA_TreeSet.add("orange");
     System.out.println("Original tree set: " + FMA_TreeSet);
    System.out.println("Size of the tree set: " + FMA_TreeSet.size());
   }
}
