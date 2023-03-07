/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_3_HashMap;

/**
 *
 * @author 12fat
 * 6. Write a Java program to associate the specified value with the specified key in a HashMap. Sample Output:
1 Red                                                                  
2 Green                                                                
3 Black                                                                
4 White                                                                
5 Blue
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class FMA_Ex6 {
 public static void main(String args[]) {  
  HashMap<Integer,String> FMA_Map= new HashMap<Integer,String>();  
  FMA_Map.put(1, "Red");
  FMA_Map.put(2, "Green");
  FMA_Map.put(3, "Black");
  FMA_Map.put(4, "White");
  FMA_Map.put(5, "Blue");
  for(Map.Entry s:FMA_Map.entrySet()){
      System.out.println(s.getKey()+" "+s.getValue());
  }
  ArrayList<String>Value=new ArrayList<String>(FMA_Map.values());
  ArrayList<Integer>Key=new ArrayList<Integer>(FMA_Map.keySet());  
     for (int i = 0; i < Value.size(); i++) {
         System.out.println(Key.get(i)+" "+Value.get(i));
     }
     //يمكننا استخدام طريقة كي سيت للحصول على مجموعة من المفاتيح ثم الحصول على القيمة باستخدام طريقة get ()
     for (int key : FMA_Map.keySet()){  
	System.out.println(key+ " " + FMA_Map.get(key));
     }
}
}




















//  for(Map.Entry x:FMA_Map.entrySet()){  
//   System.out.println(x.getKey()+" "+x.getValue());  
//  } 
