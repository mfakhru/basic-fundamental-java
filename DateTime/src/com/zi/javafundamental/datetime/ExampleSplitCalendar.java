package com.zi.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSplitCalendar {

    public static void main(String[] args) {

        // Show current time
        Calendar calendar = Calendar.getInstance();
        System.out.println("The current time is " + calendar.getTime());

        // show specific time
        System.out.println("Date : " + calendar.get(Calendar.DATE));
        System.out.println("Month : " + calendar.get(Calendar.MONTH));
        System.out.println("Year : " + calendar.get(Calendar.YEAR));
    }
}
