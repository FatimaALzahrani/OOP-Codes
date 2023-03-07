/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_3_HashMap;


/**
 *
 * @author 12fat
 * 7. Write a Java program to test if a map contains a mapping for the specified value. Sample Output:
The Original map: {1=Red, 2=Green, 3=Black, 4=White, 5=Blue}           
1. Is value 'Green' exists?                                            
Yes!                                                                   
                                                                       
2. Is value 'orange' exists?                                           
No!  
 */
import java.util.HashMap;
import java.util.Map;

public class FMA_Ex7 {
    public static void main(String args[]) {
  HashMap < Integer, String > FMA_Map = new HashMap < Integer, String > ();
  FMA_Map.put(1, "Red");
  FMA_Map.put(2, "Green");
  FMA_Map.put(3, "Black");
  FMA_Map.put(4, "White");
  FMA_Map.put(5, "Blue");
  System.out.println("The Original map: " + FMA_Map);
  System.out.println("1. Is value 'Green' exists?");
  if (FMA_Map.containsValue("Green")) {
     for(Map.Entry s:FMA_Map.entrySet()){
      if(s.getKey()=="Green"){
      int count=Integer.parseInt(String.valueOf(s.getValue()))+1;
      FMA_Map.put(count, String.valueOf(s.getKey()));
      }
  }
  } else {
   System.out.println("No!");
  }
    HashMap < String, Integer > FMA_Map2 = new HashMap < String, Integer > ();
    FMA_Map2.put("Fatimah",1);
    FMA_Map2.put("moha",1);
    FMA_Map2.put("abdu",1);
    FMA_Map2.put("Fatimah",1);
    FMA_Map2.put("allah",1);
      if (FMA_Map2.containsKey("Fatimah")) {
     for(Map.Entry s:FMA_Map2.entrySet()){
      if(s.getKey()=="Fatimah"){
      int count=Integer.parseInt(String.valueOf(s.getValue()))+1;
      Integer count2=((Number)s.getValue()).intValue()+2;
      FMA_Map2.put(String.valueOf(s.getKey()),count2);
      }
  }
  } else {
      FMA_Map2.put("Fatimah",1);
  }
        System.out.println(FMA_Map2);
        
 }
    
}
