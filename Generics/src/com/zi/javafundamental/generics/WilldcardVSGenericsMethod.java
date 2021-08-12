package com.zi.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;

public class WilldcardVSGenericsMethod {

    // Wildcards
    static void print(Collection<?> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }

    // Generics Method
    static <T> Collection arrayToCollection(T[] a) {
        Collection<T> c = new ArrayList();
        for (T o : a) {
            c.add(o);
        }
        return c;
    }

    public static void main(String[] args) {
        String[] sa = { "Happy", "Coding" };
        Collection r = arrayToCollection(sa);
        print(r); // using wildcard
    }
}
