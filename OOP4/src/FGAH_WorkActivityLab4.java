//لان بنحتاجها عند انشاء اي كوليكشن .utilنستدعي كل الكلاسات من بكج 
import java.util.*;
/**
 * 
 * Group : F51
 * |________________________________________|_________________|
 * |            Name                        |  University ID  |
 * |________________________________________|_________________|
 * |Fatima Mohammed Abduallah Alzahrani     |  442006322      |
 * |Atheer Abdulwahab Abdulhadi Abdulqader  |  442013423      |
 * |Alhanoof abdullah Alzahrani             |  442012434      |
 * |Ghadi Fahd Saleh Al-Ghamdi              |  442001566      |
 * |________________________________________|_________________|
 * 
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

public class FGAH_WorkActivityLab4 {
    public static void main(String[] args) {
        //1.A HashSet that contains your group members first names’  
        HashSet<String> FGAH_FirstName = new HashSet<String>();
        FGAH_FirstName.add("Atheer");
        FGAH_FirstName.add("Ghadi");
        FGAH_FirstName.add("Alhanoof");
        FGAH_FirstName.add("Fatima");
        //2.A HashSet that contains your group members last names’
        HashSet<String> FGAH_LastName = new HashSet<String>();
        FGAH_LastName.add("Abdulwahab");
        FGAH_LastName.add("Fahd");
        FGAH_LastName.add("abdullah");
        FGAH_LastName.add("Mohammed");
        //3.Tree set that contains your group members birthdates  
        TreeSet<String> FGAH_BirthDates = new TreeSet<String>();
        FGAH_BirthDates.add("15/06/1423");
        FGAH_BirthDates.add("09/12/1423");
        FGAH_BirthDates.add("25/12/1423");
        FGAH_BirthDates.add("03/05/1423");
        //4.Hash map that contains your id number as a key and your group members names’ as a value 
        HashMap<Integer,String> FGAH_IdName = new HashMap<Integer,String>();
        FGAH_IdName.put(442013423,"Atheer");
        FGAH_IdName.put(442001566,"Ghadi");
        FGAH_IdName.put(442012434,"Alhanoof");
        FGAH_IdName.put(442006322,"Fatima");
        //5.Print your hash set , tree set and your hash map. Use suitable statement before printing each one.  
        System.out.println("nThe First Nmes’ of group members is : "+FGAH_FirstName);//or FGAH_FirstName.toString()
        System.out.println("\nThe Last Nmes’ of group members is : "+FGAH_LastName);//or FGAH_LastName.toString()
        System.out.println("\nThe Birth Dates of group members is : "+FGAH_BirthDates);//or FGAH_BirthDates.toString()
        System.out.println("\nThe Name and Id number of group members is : ");// Or we can print it directly by: FGAH_IdName or FGAH_IdName.toString()
        int num=1;
        for(Map.Entry entry : FGAH_IdName.entrySet()){
            System.out.println(num+"- The ID number is : "+entry.getKey()+" ,And The Name is : "+entry.getValue());
            num++;
        }
        //6.Print the size of your tree set  0.25
        System.out.println("\nThe size of tree set 'number of member is' : "+FGAH_BirthDates.size());
        //7.Write  statement to test if the value “Samia” is exist in your hash map or not and print yes it is there  
        System.out.println("\nIs value 'Samia' exists?");
        if(FGAH_IdName.containsValue("Samia")){
            System.out.println("Yes, Dr. Samia is a member of the group 'exists in Map'");
        }else{
            System.out.println("No, Dr. Samia is not a member of the group 'not exists in Map'");
        }
        //8.Compare your hashsets and print element which are same in both sets.
        System.out.println("\nSimilar names in the first Set containing the first name and the second containing the second name:");
        FGAH_FirstName.retainAll(FGAH_LastName);
        System.out.println(FGAH_FirstName);//print [] becuse set FGAH_FirstName and set FGAH_LastName It has no common element 
    }
}
