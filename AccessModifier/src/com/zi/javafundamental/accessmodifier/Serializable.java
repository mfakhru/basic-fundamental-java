package com.zi.javafundamental.accessmodifier;

public class Serializable {

    class Test implements Serializable {
        // variable ini tidak aka dijaga nilainya
        transient int nilaiA;

        // variable ini akan dijaga nilainya
        double nilaiB;
        String nilaiC;
    }
}
