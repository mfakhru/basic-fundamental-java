package com.zi.javafundamental.inheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(); // call constructor
        System.out.println("Whether animal is Object ->" + (animal instanceof Object));
        System.out.println("Whether animal is Animal ->" + (animal instanceof Animal));
        System.out.println("Whether animal is Cat ->" + (animal instanceof Cat));

        System.out.println("-------------");
        Cat cat = new Cat(); // call constructor
        System.out.println("Whether animal is Object ->" + (cat instanceof Object));
        System.out.println("Whether cat is Animal ->" + (cat instanceof Animal));
        System.out.println("Whether cat is Cat ->" + (cat instanceof Cat));

        System.out.println("-------------");

        animal.eat(); // cat inheritance method eat() from parent class Animal
        cat.eat();
        cat.eat("meal");

        System.out.println("-------------");

        Cat meow = new Cat("Ocicat", "Tropical");
        Cat puss = new Cat("Ocicat", "Sub Tropical");
        Cat popo = new Cat("Anggora", "Sub Tropical");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("Meow equals puss ? " + meow.equals(puss));
        System.out.println("Meow equals popo ? " + meow.equals(popo));

        System.out.println("-------------");

        Object o = new Cat(); // Cat is object
        Animal h = new Cat(); // Cat is animal
        Cat k = new Cat(); // Cat is cat,

        // o.eat() -> error, no one object in method eat()
        h.eat();
        k.eat();

        Object object = k; // directly assigned
        Animal animalK = k; // directly assigned

        // object.eat(); -> error
        animalK.eat();

        Cat catK = (Cat) h; // can't be assigned directly, need casting
        catK.eat();

        Animal tiger = new Animal();
        Cat anggora = (Cat) tiger; // compile OK but runtime error ClassCastException

    }
}
