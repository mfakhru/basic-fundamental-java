package com.zi.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[] args) {
        // inisialisasi awal penggunaan scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukan angka Pertama = ");
        //untuk string scanner.next()
        int value = scanner.nextInt();
        System.out.print("Masukan angka Kedua = ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah " + result);
    }
}
