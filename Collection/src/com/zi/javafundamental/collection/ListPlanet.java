package com.zi.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {

    public static void main(String[] args) {
        // Deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "Zee";
        heroes[1] = "Roes";
        // heroes = "Dans" // error ArrayIndexOutOfBoundsException

        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("Mercury"); // method add() for add object to List
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars"); // another object can still be added

        System.out.println("List First Planets: ");
        for (int i = 0; i < planets.size(); i++) { // method size() to get size list
            // method get() to see the list in index i
            System.out.println("\t indext-"+ i +" = " + planets.get(i));
        }

        planets.remove("Venus"); // method remove() to remove object from list

        System.out.println("List Last Planets: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t indext-"+ i +" = " + planets.get(i));
        }
     }
}
