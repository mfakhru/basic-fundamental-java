package com.zi.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List lo = new ArrayList(); // list without type-parameter
        lo.add("lo - String 1"); // lo accommodate object string
        lo.add(new Planet("Mercurry", 0.06)); // lo accommodate object Planet

        for (Object o : lo) {
            Planet p = (Planet) o; // need type-casting from object to Planet
            p.print();
        }

        List<Planet> lp = new ArrayList(); // list with type-parameter Planet
        lp.add(new Planet("Mercurry", 0.06)); // lp accommodate object Planet
        // lp.add("lo - String 1"); // this compile error line, lp not allowed accommodate object string
        lp.add(new Planet("Venus", 0.82));

        for (Planet p : lp) {
            p.print();
        }
    }
}
