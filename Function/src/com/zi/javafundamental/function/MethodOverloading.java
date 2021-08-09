package com.zi.javafundamental.function;

public class MethodOverloading {

    public static void main(String[] args) {
        double p = 10;
        double l = 7.5;
        double area = calculateArea(p, l);
        System.out.println("The result = " + area);
        int pn = 10;
        int lb = 7;
        int areas = calculateArea(pn, lb);
        System.out.println("The result = " + areas);
    }

    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }
}
