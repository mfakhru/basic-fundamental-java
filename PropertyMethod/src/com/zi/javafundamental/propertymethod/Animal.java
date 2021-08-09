package com.zi.javafundamental.propertymethod;

public class Animal {

    // property or fields
    // inisiasi with inisial value
    double height = 30;
    double weight = 4;

    // inisiasi with contructor
    int age;

    /**

     // constructor with param
     Animal(int ageParam) {
     age = ageParam;

     // var ageParam = parameter
     // age = property/fields
     }

     */

    // kita rubah
    Animal(int age) {
        this.age = age;
    }
    // this mereferensikan object Animal
    // kode this.umur = akses ke atribut Age Class Animal in Class Animal

    void run() {
        System.out.println("Run so fast");
    }

    void walk() {
        System.out.println("Walking so slow");
    }

    void eat() {
        System.out.println("Eating with mouth..");
    }

    double getWeight() {
        return weight;
    }

    double getHeight() {
        return height;
    }

    int getAge() {
        return age;
    }
}
