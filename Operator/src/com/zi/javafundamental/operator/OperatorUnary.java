package com.zi.javafundamental.operator;

/*
Operasi unary = operasi yg melakukan berbagai operasi
aritmatika yg hanya melibatkan satu operand.
 */

public class OperatorUnary {

    public static void main(String[] args){
        System.out.println("Operasi Unary Plus");
        int nilaiAwal = 8;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +8 = " + hasil);
        System.out.println();

        System.out.println("Operasi Unary Minus");
        int nilaiAwal2 = 8;
        int hasil2 = -nilaiAwal2;
        System.out.println("Hasil -8 = " + hasil2);
        System.out.println();

        System.out.println("Operasi Peningkatan Nilai Sebesar 1 Point");
        int nilaiAwal3 = 8;
        nilaiAwal3++; //increment
        System.out.println("Hasil 8++ = " + nilaiAwal3);
        System.out.println();

        System.out.println("Operasi Pengurangan Nilai Sebesar 1 Point");
        int nilaiAwal4 = 8;
        nilaiAwal4--; //decrement
        System.out.println("Hasil 8-- = " + nilaiAwal4);
        System.out.println();

        System.out.println("Operasi Komplemen Logika");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}
