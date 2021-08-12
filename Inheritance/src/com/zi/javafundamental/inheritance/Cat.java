package com.zi.javafundamental.inheritance;

public class Cat extends Animal {

    // add override
    private  String race;
    private String habitat;

    public Cat(String race, String habitat) {
        this.race = race;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Race Cat: " + race + ", habitat: " + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  Cat) {
            Cat other = (Cat) obj;
            return this.race.equals(other.race);
        } else {
            return false;
        }
    }

    public Cat() {
        super(); // call constructor from parent class
        System.out.println("Construct Cat");
    }

    public void eat() { // overriding
        System.out.println("Cat is eating..");
    }

    public void eat(String food) { // overloading
        System.out.println("Cat is eating " + food);
    }
}
