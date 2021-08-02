package com.zi.javafundamental.branching;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        char input = 'C';
        int output = 0;
        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                // find 'C' and run this code
                output++; // output = 1
                // without break, so run next code
            case 'D':
                // run this code
                output++; // output = 1 + 1 (increment)
            case 'E':
                // run this code
                output++; // output = 2 + 1 (increment)
            default:
                // run this code
                output++; // output = 3 + 1 (increment)
        }
        System.out.print("Last score is " + output);
    }
}
