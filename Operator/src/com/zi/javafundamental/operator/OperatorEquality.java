package com.zi.javafundamental.operator;

public class OperatorEquality {

    public static void main(String[] args) {

        int value = 8;
        int anotherValue = 5;
        boolean result;
        System.out.println("Value = 8 dan anotherValue = 5");

        result = value == anotherValue;
        System.out.println("Hasil 'value == another value' adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan..");
        result = value != anotherValue;
        System.out.println("Hasil dari 'value != anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Lebih besar dari..");
        result = value > anotherValue;
        System.out.println("Hasil dari 'value > anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Sama  atau lebih besar dari..");
        result = value >= anotherValue;
        System.out.println("Hasil dari 'value >= anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Kurang dari..");
        result = value < anotherValue;
        System.out.println("Hasil dari 'value < anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Sama  atau kurang dari..");
        result = value <= anotherValue;
        System.out.println("Hasil dari 'value <= anotherValue' adalah " + result);
        System.out.println();
    }
}
