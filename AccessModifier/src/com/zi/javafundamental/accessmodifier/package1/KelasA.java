package com.zi.javafundamental.accessmodifier.package1;

public class KelasA {

    // access modifier => private
    private int memberA = 5;

    // access modifier => default
    char memberB = 'A';
    double memberC = 1.5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        // call private member and private function
        int hasil = functionA() + memberA;
        return hasil;
    }

    protected void methodC() {
        System.out.println("Access modifier!");
    }
}
