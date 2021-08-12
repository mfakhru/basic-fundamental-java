package com.zi.javafundamental;

import java.io.File;

public class Main2 {

    public static void main(String[] args) {
        String dirname = "/java/latihan1";
        File file = new File(dirname);

        // Creat directory
        file.mkdirs();
    }
}
