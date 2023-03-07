/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Downcasting;

/**
 *
 * @author 12fat
 */
public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal();
    cat cat = new cat();
    dog dog = new dog();
    Animal animaldog=dog;
//    dog doganimal=(dog)new Animal();
//    doanimalstuff(doganimal);
//dog downdog=(dog)new Animal();
//doanimalstuff(downdog);
    doanimalstuff(animal);
    doanimalstuff(dog);
    doanimalstuff(cat);
    doanimalstuff(animaldog);
    }
    public static void doanimalstuff(Animal animal){
    animal.makenoise();
    if(animal instanceof dog){
    dog mydog=(dog)animal;
    mydog.growl();
    }
    }
}
