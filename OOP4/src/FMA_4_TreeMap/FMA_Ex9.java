/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_4_TreeMap;


/**
 *
 * @author 12fat
 * 9. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key. Sample Output:
Orginal TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}                                                                      
Checking the entry for 10:                                             
Key(s): {10=Red}                                                       
Checking the entry for 20:                                             
Key(s): {10=Red, 20=Green}                                             
Checking the entry for 70:                                             
Key(s): {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 */
import java.util.TreeMap;
public class FMA_Ex9 {
  public static void main(String args[]) {
  // Create a tree map
  TreeMap < Integer, String > FMA_TreeMap = new TreeMap < Integer, String > ();
  // Put elements to the map 
  FMA_TreeMap.put(10, "Red");
  FMA_TreeMap.put(20, "Green");
  FMA_TreeMap.put(40, "Black");
  FMA_TreeMap.put(50, "White");
  FMA_TreeMap.put(60, "Pink");
  System.out.println("Orginal TreeMap content: " + FMA_TreeMap);
  System.out.println("Checking the entry for 10: ");
  System.out.println("Key(s): " + FMA_TreeMap.headMap(10, true));
  System.out.println("Checking the entry for 20: ");
  System.out.println("Key(s): " + FMA_TreeMap.headMap(20, true));
  System.out.println("Checking the entry for 70: ");
  System.out.println("Key(s): " + FMA_TreeMap.headMap(70, true));
 }
}
