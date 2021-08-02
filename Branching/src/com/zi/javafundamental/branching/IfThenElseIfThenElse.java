package com.zi.javafundamental.branching;

public class IfThenElseIfThenElse {
    public static void main(String[] args) {
        int scoreExam = 85;
        char indexScore;

        if (scoreExam >= 90) {
            indexScore = 'A';
        } else if (scoreExam >= 80) {
            indexScore = 'B';
        } else if (scoreExam >= 70) {
            indexScore = 'C';
        } else if (scoreExam >= 60 ) {
            indexScore = 'D';
        } else {
            indexScore = 'F';
        }
        System.out.println("Your score exam is " + indexScore);
    }
}
