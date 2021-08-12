package com.zi.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {

    public static void main(String[] args) {

        // Show current time
        Calendar calendar = Calendar.getInstance();
        System.out.println("The current time is " + calendar.getTime());

        // Show time 15 days ago
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago is " + calendar.getTime());

        // Show 4 months later
        calendar.add(Calendar.MONTH, 4);
        System.out.println("The next 4 months is " + calendar.getTime());

        // Show 2 years later
        calendar.add(Calendar.YEAR, 2);
        System.out.println("The next 2 years is " + calendar.getTime());
    }
}
