package com.zi.javafundamental.function;

public class InputFunction {

    public static void main(String[] args) {
        // call function
        calculateWide(10, 7.5);
    }

    public static void calculateWide(double length, double width) {
        double wide;
        wide = length * width;
        System.out.println(wide);
    }
}
