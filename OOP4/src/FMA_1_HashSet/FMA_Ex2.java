/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_1_HashSet;


/**
 *
 * @author 12fat
 * 2. Write a Java program to convert a hash set to a List/ArrayList.Sample Output:
Original Hash Set: [Red, White, Pink, Yellow, Black, Green]            
ArrayList contains: [Red, White, Pink, Yellow, Black, Green]

 */
import java.util.ArrayList;
import java.util.HashSet;
public class FMA_Ex2 {
      public static void main(String[] args) {
     HashSet<String> FMA_set = new HashSet<String>();
          FMA_set.add("Red");
          FMA_set.add("White");
          FMA_set.add("Pink");
          FMA_set.add("Yellow");
          FMA_set.add("Black");
          FMA_set.add("Green");
    System.out.println("Original Hash Set: " + FMA_set);
    //بنستخدمf  arraylist constructor وبعدين بنمرر له f hashset as constructor argument.
    //بنسخ جميع العناصر من السيت إلى قائمة المصفوفه التي تم إنشاؤها حديثا
      ArrayList<String> FMA_List = new ArrayList<String>(FMA_set);
    System.out.println("ArrayList contains: " + FMA_List);
   }
}
