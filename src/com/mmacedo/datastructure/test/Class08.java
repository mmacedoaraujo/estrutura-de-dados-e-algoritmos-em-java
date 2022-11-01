package com.mmacedo.datastructure.test;

import com.mmacedo.datastructure.vector.Vector;

public class Class08 {

    public static void main(String[] args) {

        Vector vector = new Vector(3);

        vector.addNewElement("B");
        vector.addNewElement("C");
        vector.addNewElement("E");
        vector.addNewElement("F");
        vector.addNewElement("G");

        System.out.println(vector);
    }
}
