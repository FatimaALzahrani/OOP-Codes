/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author 12fat
 */
//TestLivingThing main class to test my application
public class FMA_TestLivingThing {
    public static void main(String[] args) {
        // create a Human object
        FMA_LivingThing HumanObject = new FMA_Human("Humans");
        // create a Dog object
        FMA_LivingThing DogObject = new FMA_Dog("Dogs");
        // create a cat object
        FMA_LivingThing CatObject = new FMA_Cat("Cats");
        // create a Tree object
        FMA_LivingThing TreeObject = new FMA_Tree("Trees");

        // call all the methods for each object
        System.out.println("For Human object:");
        HumanObject.breath();
        HumanObject.eat();
        HumanObject.walk();
        HumanObject.sleep();
        System.out.println("________________________________");
        System.out.println("For Dog object:");
        DogObject.breath();
        DogObject.eat();
        DogObject.walk();
        DogObject.sleep();
        System.out.println("________________________________");
        System.out.println("For cat object:");
        CatObject.breath();
        CatObject.eat();
        CatObject.walk();
        CatObject.sleep();
        System.out.println("________________________________");
        System.out.println("For Tree object:");
        TreeObject.breath();
        TreeObject.eat();
        TreeObject.walk();
        TreeObject.sleep();
    }
}