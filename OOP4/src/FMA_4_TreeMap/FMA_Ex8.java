/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_4_TreeMap;


/**
 *
 * @author 12fat
 * 8. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map. Sample Output:
Orginal TreeMap content: {C1=Green, C2=Red, C3=White, C4=Black}        
Greatest key: C1                                                       
Least key: C4
 */
import java.util.TreeMap;
public class FMA_Ex8 {
    public static void main(String args[]) {
  // Create a tree map
  TreeMap <String,String> FMA_TreeMap = new TreeMap <String,String> ();
  // Put elements to the map 
  FMA_TreeMap.put("C1", "Green");
  FMA_TreeMap.put("C2", "Red");
  FMA_TreeMap.put("C3", "White");
  FMA_TreeMap.put("C4", "Black");
  System.out.println("Orginal TreeMap content: " + FMA_TreeMap);
  System.out.println("Greatest key: " + FMA_TreeMap.firstKey());
  System.out.println("Least key: " + FMA_TreeMap.lastKey());
 }
}
