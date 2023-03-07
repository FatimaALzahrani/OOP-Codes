/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FMA_1_HashSet;

import java.util.HashSet;

/**
 *
 * @author 12fat
 * 3. Write a Java program to compare two sets and retain elements which are same on both sets. Sample Output:
Frist HashSet content: [Red, White, Black, Green]                      
Second HashSet content: [Red, Pink, Black, Orange]                     
HashSet content:                                                       
[Red, Black]

 */
public class FMA_Ex3 {
    public static void main(String[] args) {
     HashSet<String> FMA_set1 = new HashSet<String>();
          FMA_set1.add("Red");
          FMA_set1.add("White");
          FMA_set1.add("Black");
          FMA_set1.add("Green");
        System.out.println("Frist HashSet content: "+FMA_set1);
     HashSet<String> FMA_set2 = new HashSet<String>();
          FMA_set2.add("Red");
          FMA_set2.add("Pink");
          FMA_set2.add("Black");
          FMA_set2.add("Orange");
        System.out.println("Second HashSet content: "+FMA_set2);
        System.out.println("HashSet content: ");
        //retains or keeps only the elements in this collection that are contained in the invoked collection and removes all the elements that are not contained in the specified collection.
        //يحتفظ فقط بالعناصر الموجودة في هذه المجموعة المضمنة في المجموعة التي تم استدعاؤها ويزيل كافة العناصر غير المضمنة في المجموعة المحددة.
        FMA_set1.retainAll(FMA_set2);
        System.out.println(FMA_set1);
    }
}
