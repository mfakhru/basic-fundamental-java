package com.zi.javafundamental.datetime;

public class ExampleSystemCurrentMilis {
    
    public static void main(String[] args) {
        long timeNow = System.currentTimeMillis();

        // timeNow bertipe data long
        System.out.println("Time now is " + timeNow + " milisecond");
    }
}
