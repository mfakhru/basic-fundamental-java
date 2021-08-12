package com.zi.javafundamental.datetime;

import java.util.Calendar;

public class ExampleCalendar {

    public static void main(String[] args) {

        // Show current time
        Calendar calendar = Calendar.getInstance();
        System.out.println("The current time is " + calendar.getTime());
    }
}
