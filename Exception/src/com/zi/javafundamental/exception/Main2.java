package com.zi.javafundamental.exception;

public class Main2 {

    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            System.out.println("Access element 5 : " + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        } finally {
            a[4] = 10;
            System.out.println("Value of last element : " + a[4]);
        }
    }
}
