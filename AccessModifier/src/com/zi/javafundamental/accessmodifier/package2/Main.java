package com.zi.javafundamental.accessmodifier.package2;

import com.zi.javafundamental.accessmodifier.package1.KelasA;

public class Main {

    public static void main(String[] args) {

        // this code will be error compiler

        KelasA kelasA = new KelasA();

        // System.out.println(KelasA.functionB());

        // System.out.println(KelasA.memberB);
        // System.out.println(KelasA.memberC);

        // because functionB, memberB, and memberC not in "public" access

        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
