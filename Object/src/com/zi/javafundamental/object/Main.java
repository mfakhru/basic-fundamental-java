package com.zi.javafundamental.object;

public class Main {

    public static void main(String[] args) {

        // creat object, named 'objectAnimal'
        Animal Elang = new Animal("Elang");
        Animal Kucing = new Animal("Kucing");

        Elang.weightAnimal(5);
        Elang.numberFeetAnimal(2);
        Elang.printName();

        Kucing.weightAnimal(2);
        Kucing.numberFeetAnimal(4);
        Kucing.printName();
    }
}
