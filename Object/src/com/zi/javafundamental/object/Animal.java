package com.zi.javafundamental.object;

public class Animal {

    String name;
    int weight;
    int numberFeet;

    // constructor class Animal,
    // konstruktor adalah method yang pertama dijalankan ketika
    // object diciptakan.

    public Animal(String nameAnimal) {
        name = nameAnimal;
    }

    public void weightAnimal(int weightAnimal) {
        weight = weightAnimal;
    }

    public void numberFeetAnimal(int numberFeetAnimal) {
        numberFeet = numberFeetAnimal;
    }

    public void printName() {
        System.out.println("Nama Hewan : " + name);
        System.out.println("Berat Hewan : " + weight + " kg");
        System.out.println("Jumlah Kaki : " + numberFeet);
    }
}
