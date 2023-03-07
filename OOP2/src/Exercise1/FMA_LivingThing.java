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
//super class named Living_Thing must contains common data members and constructors, methods and abstract methods.
public abstract class FMA_LivingThing {
    String name;

    // constructor
    public FMA_LivingThing(String species) {
        name = species;
    }

    public abstract void breath();

    public abstract void walk();

    public abstract void eat();
    
    public abstract void sleep();
}