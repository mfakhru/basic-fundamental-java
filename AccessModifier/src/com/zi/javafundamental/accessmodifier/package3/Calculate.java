package com.zi.javafundamental.accessmodifier.package3;

public class Calculate {

    public static int value = 0;

    // static method
    protected static int getValue() {
        return value;
    }

    Calculate() {
        value++;
    }
}
