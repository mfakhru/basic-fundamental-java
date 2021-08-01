package com.zi.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {

    public static void main(String[] args) {
        // inisialisasi BufferedReader dibantu InputStreamReader
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program Penjumlahan Sederhana");
        int value = 0;
        int anotherValue = 0;
        try {
            System.out.print("Masukan Angka Pertama = ");
            // konversi ke int dengan Integer.parseInt
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan Angka Kedua = ");
            // konversi ke int dengan Integer.parseInt
            anotherValue = Integer.parseInt(bufferedReader.readLine());

        // ioException penanganan error input BufferedReader
        } catch (IOException e) {
            e.printStackTrace();
        }

        int result = value + anotherValue;
        System.out.println("Hasilnya adalah " + result);

    }
}
