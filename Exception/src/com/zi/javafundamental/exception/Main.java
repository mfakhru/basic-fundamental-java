package com.zi.javafundamental.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            // try read namafile.txt
            File file = new File("D://namafile.txt");
            FileReader fr = new FileReader(file);
            // if success
            System.out.println("Read file success");
        } catch (Exception e) {
            // if error
            System.out.println(e.getMessage());
        }
    }
}
