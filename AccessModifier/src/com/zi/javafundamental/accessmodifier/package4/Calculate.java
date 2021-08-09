package com.zi.javafundamental.accessmodifier.package4;

public class Calculate {

    final int value = 5;

    // cann't change a final variable
    void changeValue() {
        // error
        value = 10;
    }
}
