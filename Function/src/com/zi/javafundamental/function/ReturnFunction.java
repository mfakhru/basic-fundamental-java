package com.zi.javafundamental.function;

public class ReturnFunction {

    public static void main(String[] args) {
        double p = 8;
        double l = 10;
        double area = calculateArea(p, l); // call function
        System.out.println("The final result = " + area);
    }

    // return function
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
