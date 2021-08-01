package com.zi.javafundamental.operator;

public class OperatorConditional {

    public static void main(String[] args) {
        int value = 8;
        int anotherValue = 10;

        System.out.println("Conditional AND");
        boolean result = value == 6 && anotherValue == 10;
        boolean anotherResult = value != 6 && anotherValue ==10;

        System.out.println("Hasil Operator AND pada syarat value = 6 dan anotherValue = 10 adalah " + result);
        System.out.println("Hasil Operator AND pada syarat value != 6 dan anotherValue = 10 adalah " + anotherResult);
        System.out.println();

        System.out.println("Condition OR");
        result = value == 6 || anotherValue == 10;
        anotherResult = value != 6 || anotherValue ==10;

        System.out.println("Hasil Operator OR pada syarat value = 6 dan anotherValue = 10 adalah " + result);
        System.out.println("Hasil Operator OR pada syarat value != 6 dan anotherValue = 10 adalah " + anotherResult);
        System.out.println();
    }
}
