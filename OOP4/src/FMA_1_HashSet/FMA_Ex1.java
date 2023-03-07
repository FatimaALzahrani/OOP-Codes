/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_1_HashSet;

import java.util.HashSet;
import java.util.Set;
//يشيل التكرارات
//يرتب العناصر عشوائيا مو بنفس الترتيب اللي دخلنا
/**
 *
 * @author 12fat
 * 1.	Write a Java program to append the specified element to the end of a hash set , Sample Output:
The Hash Set: [Red, White, Pink, Yellow, Black, Green]
 */
public class FMA_Ex1 {
    public static void main(String[] args) {
     HashSet<String> FMA_set = new HashSet<String>();
          FMA_set.add("Red");
          FMA_set.add("White");
          FMA_set.add("Pink");
          FMA_set.add("Yellow");
          FMA_set.add("Black");
          FMA_set.add("Green");
    System.out.println("The Hash Set: " + FMA_set);
    //شرح على ارقام
         Set<Integer> FMA_setNum = new HashSet<Integer>();
          FMA_setNum.add(5);
          FMA_setNum.add(3);
          FMA_setNum.add(-1);
          FMA_setNum.add(0);
          FMA_setNum.add(1);
          FMA_setNum.add(10);
    System.out.println("The Hash Set: " + FMA_setNum);
   }
}
