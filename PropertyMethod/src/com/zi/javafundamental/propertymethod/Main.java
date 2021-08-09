package com.zi.javafundamental.propertymethod;

public class Main {

    public static void main(String[] args) {

        // We add 1 argument with int 2
        // The value is value used for inisiasi variable age

        Animal cat = new Animal(2);
        cat.eat();
        cat.walk();
        cat.run();

        // example using getAge function
        System.out.println("That age is " + cat.getAge());

        // Calculate BMI (body mass index)
        // weight (kg)/ (height(m) * height(m) )
        double bmi = cat.getWeight() / ((cat.getHeight() * 0.01) * (cat.getHeight() * 0.01));
        System.out.println("That BMI is " + bmi);
    }
}
