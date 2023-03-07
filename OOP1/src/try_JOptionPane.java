/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
import javax.swing.JOptionPane;

public class try_JOptionPane {
private String name; 
private int age; 
private double wid;
private double length;
private String cs;
    public void setparameter(String x, int y,double z,double m, String n) {
name=x; 
age=y; 
wid=z;
length=m; 
cs=n;
}//setparameter
    public void display() {
        double bmi=wid/(length*length);
        System.out.println("معلوماتك هي كالتالي: \n"+"اسمك هو "+name+"\nعمرك هو "+age+"\nتخصصك هو "+cs+"\n:(BMI)"+"مؤشر كتلة جسمك  ");
        System.out.println(bmi);
        if(bmi<18){
            System.out.println("نقص في الوزن");
            System.out.println("تحتاجين لزيادة "+(((length*100)-100-3)-wid)+" كغم من اجل الوصول إلى الوزن الطبيعي "+((length*100)-100-2));
        }
        else if(bmi<25){
            System.out.println("وزن طبيعي");
            System.out.println("وزن جميل حافظي على العمل الجيد");
        }else{
            System.out.println("زيادة في الوزن");
            System.out.println("تحتاجين لنقص "+(wid-((length*100)-100-2))+" كغم من اجل الوصول إلى الوزن الطبيعي "+(((length*100)-100-2)));
        }
    }
//    public int bestwid(double lenght){
//    if(length<150)
//            System.out.println("عذرا لا استطيع حسابه جربي في قوقل");
//    else if(length==150)
//        return 47;
//    else if(length<=)
//    }
}
class info{
        public static void main(String[] args) {
        try_JOptionPane info1 = new try_JOptionPane();
        String x=JOptionPane.showInputDialog("ايش اسمك؟" );
        String y=JOptionPane.showInputDialog("كم عمرك؟" );
        String z=JOptionPane.showInputDialog("كم وزنك؟" );
        String m=JOptionPane.showInputDialog("كم طولك بالمتر؟");
        String n=JOptionPane.showInputDialog("ايش تخصصك؟" );
        info1.setparameter(x,Integer.parseInt(y),Double.parseDouble(z),Double.parseDouble(m),n);
        info1.display();
    }
}
