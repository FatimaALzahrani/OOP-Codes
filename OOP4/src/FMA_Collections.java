
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * فاطمة محمد عبد الله الزهراني / الاسم
 *  442006322/الرقم الجامعي
 *  F51/الشعبة
 */
/*
                                    *  Collections  *
         هي انترفيس تخزن مجموعة من البيانات من نفس النوع وفيها ابستراكت ميثود تورثها الكلاسات
اللي تسوي لها امبيلمنيشن ومن هذي الدوال ااد للاضافه وريموف للحذف                 
ومن الابستراكت كلاس اللي تسوي لها امبلمنت                               
             Set                            |                       List                       |          Queue
ما تقبل التكرار وكل عناصرها تكون فريده-     | تقبل التكرار ونفس المصفوفه بس هذي حجمها مو ثابت- |
           null تقبل القيمة -               |           null ما تقبل القيمة -                  | 
لا تحتفظ بترتيب الادخال         -             | تحتفظ بترتيب الادخال وهي اندكسد مو زي السيت يعني- |
:ولها انواع كل واحد يرتب على اساس وهم.      |    :نقدر نوصل للعناصر برقم الاندكس ولها انواع .   |
1)HashSet                                   |1)ArrayList                                       |
Hash code يكون فيها الترتيب على اساس شي اسمه|مصفوفه كنها بس حجمها مو ثابت ديناميك      .       |
set نفس خصائص ال.                           |List<Integer> ar = new ArrayList<Integer>();      |
Set<String> hs = new HashSet<String>();     |ArrayList<Integer> ar = new ArrayList<Integer>(); |
HashSet<String> hs = new HashSet<String>(); |2)LinkedList                                      |
2)TreeSet                                   |لينمد ليست نفس اللي في التراكيب بيكون حاويه بس .  |
بترتب العناصر تصاعديا بنفس طريقة التري.     |تختلف عن المصفوفه ان هذي بيكون فيها بوينتر  .     |
TreeSet<String> set = new TreeSet<String>();|  اي موشر فبيسهل علينا الحذف والاضافه من اي مكان.  |
3)HashLinkedSet                             |                                                  |
ما فيها تكرارات بس تحتفظ بترتيب الادخال.     |                                                  |
LinkedHashSet<String> lhs =                 |                                                  |
new LinkedHashSet<String>();                |                                                  |
____________________________________________________________________________________________________________________________
                                         *  Map  *
    مو زي الكوليكشن هذي نخزن في كل مكان عنصرين ويمثلون مفتاح وقيمه والمفتاح لازم ما يتكرر    
المفتاح ممكن يكون نفس نوع القيمه او لا عادي ولها انواع كل واحد يرتب على اساس وهم          
1)HashMap                                 
Hash code يكون فيها الترتيب على اساس شي اسمه
Map<String,Integer> map = new HashMap<String,Integer>();  
HashMap<String,Integer> map = new HashMap<String,Integer>(); 
2)TreeMap                                
بترتب العناصر تصاعديا بنفس طريقة التري حسب الكي
TreeMap<String,Integer> treemap = new TreeMap<String,Integer>();
3)HashLinkedMap            
تحتفظ بترتيب الادخال
LinkedHashMap<String,Integer> linkedmap = new LinkedHashMap<String,Integer>();               
*/

public class FMA_Collections {
    public static void main(String[] args) {
        System.out.println("1. Write a Java program to append the specified element to the end of a hash set");
        //انشائنا هاش ست من نوع سترينق وحزنا فيها قيم الالوان ومو مهم الترتيب لان اصلا بيخربطها لان هاش سيت ما تحتفظ بترتيب الادراج
          HashSet<String> FMA_set = new HashSet<String>();
          //استخدامنا الداله ااد عشان نضيف عناصر للسيت
          FMA_set.add("Red");
          FMA_set.add("White");
          FMA_set.add("Pink");
          FMA_set.add("Yellow");
          FMA_set.add("Black");
          FMA_set.add("Green");
        //طباعة عناصر السيت واذا كتبنا اسم الاوبجكت فهو بيستدعي الداله تو سترينق
          System.out.println("The Hash Set: " + FMA_set);// or FMA_set.toString()
//The Hash Set: [Red, White, Pink, Yellow, Black, Green]
         System.out.println("__________________________________________________________________");
         System.out.println("2. Write a Java program to convert a hash set to a List/ArrayList");
         //ننشئ سيت فاضيه من نوع سترينق لان الالوان نصوص
          HashSet<String> FMA_set0 = new HashSet<String>();
          //اضافة عناصر 
          FMA_set0.add("Red");
          FMA_set0.add("White");
          FMA_set0.add("Pink");
          FMA_set0.add("Yellow");
          FMA_set0.add("Black");
          FMA_set0.add("Green");
    System.out.println("Original Hash Set: " + FMA_set0);
    // hashset as constructor argument وبنمرر له . arraylist constructor بنستخدم ال
    //بنسخ جميع العناصر من السيت إلى قائمة المصفوفه التي تم إنشاؤها 
      ArrayList<String> FMA_List = new ArrayList<String>(FMA_set0);
    System.out.println("ArrayList contains: " + FMA_List);
//Original Hash Set: [Red, White, Pink, Yellow, Black, Green]            
//ArrayList contains: [Red, White, Pink, Yellow, Black, Green]
         System.out.println("__________________________________________________________________");
    System.out.println("3. Write a Java program to compare two sets and retain elements which are same on both sets.");
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
        //retainAll method 
        //retains or keeps only the elements in this collection that are contained in the invoked collection and removes all the elements that are not contained in the specified collection.
        //يحتفظ فقط بالعناصر الموجودة في هذه المجموعة المضمنة في المجموعة التي تم استدعاؤها ويزيل كافة العناصر غير المضمنة في المجموعة المحددة.
        //يسوي سيت فيها عناصر السيتين وبيحذف كل العناصر اللي مو موجوده في الثنتين فبيبقى المشترك بس
        FMA_set1.retainAll(FMA_set2);
        System.out.println(FMA_set1);
//Frist HashSet content: [Red, White, Black, Green]                      
//Second HashSet content: [Red, Pink, Black, Orange]                     
//HashSet content:                                                       
//[Red, Black]
         System.out.println("__________________________________________________________________");
        System.out.println("4. Write a Java program to get the number of elements in a tree set.");
        //انشأ تري سيت 
        TreeSet<String> FMA_TreeSet = new TreeSet<String>();
        //اضفنا للتري سيت عناصر
          FMA_TreeSet.add("Black");
          FMA_TreeSet.add("Green");
          FMA_TreeSet.add("Pink");
          FMA_TreeSet.add("Red");
          FMA_TreeSet.add("orange");
        //طبعنا التري سيت باسم الاوبجكت
     System.out.println("Original tree set: " + FMA_TreeSet);//or FMA_TreeSet.toString()
        //طبعنا عدد عناصر السيت واللي هي حجمها باستخدم الداله سايز
    System.out.println("Size of the tree set: " + FMA_TreeSet.size());
//Original tree set: [Black, Green, Pink, Red, orange]                   
//Size of the tree set: 5 
         System.out.println("__________________________________________________________________");
        System.out.println("5. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element. ");
           TreeSet <Integer>FMA_TreeSet2 = new TreeSet<Integer>();     
            FMA_TreeSet2.add(12);
            FMA_TreeSet2.add(37);
            FMA_TreeSet2.add(36);
            FMA_TreeSet2.add(20);
            FMA_TreeSet2.add(82);
            FMA_TreeSet2.add(90);
        //higher تستخدم عشان ترجع اول اكبر عدد من العدد المحدد بين الاقواس في السيت
        //ceiling ستخدم للعثور على عنصر أكبر من أو يساوي العنصر المحدد, عكس فلوور
        System.out.println("Strictly greater than 76 : "+FMA_TreeSet2.higher(76));//or FMA_TreeSet.ceiling(76)
        System.out.println("Strictly greater than 31 : "+FMA_TreeSet2.higher(31));
//Strictly greater than 76 : 82                                          
//Strictly greater than 31 : 36
         System.out.println("__________________________________________________________________");
       System.out.println("6. Write a Java program to associate the specified value with the specified key in a HashMap.");
       //انشأنا ماب والكي بيكون عدد صحيح والفاليو بيكون سترينق يعني نص
       HashMap<Integer,String> FMA_Map= new HashMap<Integer,String>();//associate
       //اظافة عناصر للماب
        FMA_Map.put(1, "Red");
        FMA_Map.put(2, "Green");
        FMA_Map.put(3, "Black");
        FMA_Map.put(4, "White");
        FMA_Map.put(5, "Blue");
        //عندي طرق كثير عشان اطبع عناصرها  ومنها 
        //1)
        for(Map.Entry s:FMA_Map.entrySet()){
            System.out.println(s.getKey()+" "+s.getValue());
        }
        /*
        //2) احول القيم اللي في الكي في مصفوفه والقيم حقت الفاليو في مصفوفه وبعدين اطبع بلوب امر عليهم نفس الممصفوفه واستخدم اي حجم لان نفس الشي
        ArrayList<String>Value=new ArrayList<String>(FMA_Map.values());
        ArrayList<Integer>Key=new ArrayList<Integer>(FMA_Map.keySet());  
     for (int i = 0; i < Value.size(); i++) {
         System.out.println(Key.get(i)+" "+Value.get(i));
     }
     //3)يمكننا استخدام طريقة كي سيت للحصول على مجموعة من المفاتيح ثم الحصول على القيمة باستخدام طريقة get ()
     for (int key : FMA_Map.keySet()){  
	System.out.println(key+ " " + FMA_Map.get(key));
     }
*/
//1 Red                                                                  
//2 Green                                                                
//3 Black                                                                
//4 White                                                                
//5 Blue
         System.out.println("__________________________________________________________________");
        System.out.println("7. Write a Java program to test if a map contains a mapping for the specified value.");
        //انشانا ماب
        HashMap < Integer, String > FMA_Map2 = new HashMap < Integer, String > ();
        //حطينا فيها عناصر ببت
            FMA_Map2.put(1, "Red");
            FMA_Map2.put(2, "Green");
            FMA_Map2.put(3, "Black");
            FMA_Map2.put(4, "White");
            FMA_Map2.put(5, "Blue");
            //طباعة الماب وسؤال
            System.out.println("The Original map: " + FMA_Map2);
            System.out.println("1. Is value 'Green' exists?");
            //containsValueالتحقق من وجود القيمة الممره بين الاقواس في الماب 
            //containsKey من وجود المفتاح الممره بين الاقواس في الماب 
            if (FMA_Map2.containsValue("Green")) {
             System.out.println("Yes! ");//لو موجود اطبغ يس
            } else {
             System.out.println("No!");// لو مو موجود اطبع نو
            }
            System.out.println("");// /nانزل سطر او نقدر نستخدم 
            //سؤال
            System.out.println("2. Is value 'orange' exists?");
            //التحقق من وجود القيمة
            if (FMA_Map2.containsValue("orange")) {
             System.out.println("Yes! ");
            } else {
             System.out.println("No!");
            }
//The Original map: {1=Red, 2=Green, 3=Black, 4=White, 5=Blue}           
//1. Is value 'Green' exists?                                            
//Yes!                                                                   
//                                                                       
//2. Is value 'orange' exists?                                           
//No!  
         System.out.println("__________________________________________________________________");
        System.out.println("8. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.");
         // Create a tree map
        TreeMap <String,String> FMA_TreeMap = new TreeMap <String,String> ();
        // Put elements to the map 
        FMA_TreeMap.put("C1", "Green");
        FMA_TreeMap.put("C2", "Red");
        FMA_TreeMap.put("C3", "White");
        FMA_TreeMap.put("C4", "Black");
        //print treemap
        System.out.println("Orginal TreeMap content: " + FMA_TreeMap);
        //firstKey تطبع اول مفتاح في الماب
        //lastKey تطبع اخر مفتاح في الماب
        System.out.println("Greatest key: " + FMA_TreeMap.firstKey());
        System.out.println("Least key: " + FMA_TreeMap.lastKey());
//Orginal TreeMap content: {C1=Green, C2=Red, C3=White, C4=Black}        
//Greatest key: C1                                                       
//Least key: C4
         System.out.println("__________________________________________________________________");
        System.out.println("9. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.");
          // Create a tree map
        TreeMap < Integer, String > FMA_TreeMap3 = new TreeMap < Integer, String > ();
        // Put elements to the map 
        FMA_TreeMap3.put(10, "Red");
        FMA_TreeMap3.put(20, "Green");
        FMA_TreeMap3.put(40, "Black");
        FMA_TreeMap3.put(50, "White");
        FMA_TreeMap3.put(60, "Pink");
        System.out.println("Orginal TreeMap content: " + FMA_TreeMap3);
        System.out.println("Checking the entry for 10: ");
        //headMap بتطبع كل الاعداد اللي اقل من العدد الاول ولو المدخل الثاني ترو او يساويه لو كان فولس او ما حطينا ما يساوي بس اقل
        System.out.println("Key(s): " + FMA_TreeMap3.headMap(10, true));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + FMA_TreeMap3.headMap(20, true));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + FMA_TreeMap3.headMap(70, true));
//Orginal TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}                                                                      
//Checking the entry for 10:                                             
//Key(s): {10=Red}                                                       
//Checking the entry for 20:                                             
//Key(s): {10=Red, 20=Green}                                             
//Checking the entry for 70:                                             
//Key(s): {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
         System.out.println("__________________________________________________________________");
        System.out.println("10. Write a Java program to print all the elements of a ArrayList using the position of the elements.");
        //انشانا اري ليست
          ArrayList <String> FMA_ArrayList = new ArrayList <String> ();
          //ادخلنا لها عناصر
            FMA_ArrayList.add("Red");
            FMA_ArrayList.add("Green");
            FMA_ArrayList.add("Black");
            FMA_ArrayList.add("White");
            FMA_ArrayList.add("Pink");
            //طبعناها
            System.out.println("Original array list: " + FMA_ArrayList);
            //بينزل سطر عشان الان وبعدين بيطبع الجمله
            System.out.println("\nPrint using index of an element: ");
            //هنا بيطبع العناصر باستخدام الاندكس بس يثبت لنا انها اندكسد يعني نقدر نوصلها بالاندكس وتحتفظ بالترتيب اللي ادرجنا فيه البيانات
            for (int i = 0; i < FMA_ArrayList.size(); i++)
             System.out.println(FMA_ArrayList.get(i));
//Original array list: [Red, Green, Black, White, Pink]                  
//                                                                       
//Print using index of an element:                                       
//Red                                                                    
//Green                                                                  
//Black                                                                  
//White                                                                  
//Pink 
         System.out.println("__________________________________________________________________");
        System.out.println("11. Write a Java program to shuffle the elements in a linked list");
        //انشانا لينكد ليست
        LinkedList<String> FMA_LinkedList = new LinkedList<String>();
        //اعطيناها قيم
        FMA_LinkedList.add("Red");
        FMA_LinkedList.add("Green");
        FMA_LinkedList.add("Black");
        FMA_LinkedList.add("Pink");
        FMA_LinkedList.add("Orange");
        //طباعتها بالترتيب حقنا قبل ما نستخدم الداله
        System.out.println("Linked list before shuffling: ");
        System.out.println(FMA_LinkedList);
        //الطباعه بعد استخدام الداله
        System.out.println("Linked list after shuffling: ");
        //shuffle داله من كلاس كوليكشن وهي تخربط ترتيب القائمة حقتنا بشكل عشوائي
          Collections.shuffle(FMA_LinkedList);
        System.out.println(FMA_LinkedList);
//Linked list before shuffling:                                          
//[Red, Green, Black, Pink, orange]                                      
//Linked list after shuffling:                                           
//[orange, Pink, Red, Black, Green]
    }
}
