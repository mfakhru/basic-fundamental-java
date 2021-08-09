package com.zi.javafundamental.accessmodifier.package3;

public class Main {

    public static void main(String[] args) {
        System.out.println("The value is " + Calculate.value);

        for(int x = 0; x < 5; x++) {
            new Calculate();
        }

        System.out.println("To " + Calculate.value);

        System.out.println("getValue have " + Calculate.getValue());
    }
}
