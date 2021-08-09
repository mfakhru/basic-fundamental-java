package com.zi.javafundamental.accessmodifier.package4;

public class Circle {

    static final double PI = 3.141;

    int radius = 7;

    final double getArea() {
        return PI * (radius * radius);
    }
}
