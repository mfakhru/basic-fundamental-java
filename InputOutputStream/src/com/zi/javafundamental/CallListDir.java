package com.zi.javafundamental;

import java.io.File;

public class CallListDir {

    public static void main(String args[]) {
        String dirname = "/java/latihan1";
        File file = null;
        String[] paths;

        try {
            // Instansiasi object File
            file = new File(dirname);

            // Take a list files and pass it to string paths
            paths = file.list();

            // Show all path
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
