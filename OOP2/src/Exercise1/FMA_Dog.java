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

//sub-classes dogs
class FMA_Dog extends FMA_LivingThing {

    // constructor
    public FMA_Dog(String species) {
        super(species);//super() calls the parent constructor with no arguments.
    }
    //override the walk method by returning appropriate message in the child classes. 
    public void sleep() {
        System.out.println(name + " sleep at night");
    }
    public void breath() {
        System.out.println(name + " breathe by their nose");
    }
    public void walk() {
        System.out.println(name + " walk on four legs");
    }
    public void eat() {
        System.out.println(name + " eat dog food");
    }
}