package com.mmacedo.datastructure.test;

import com.mmacedo.datastructure.vector.Vector;

public class Class06 {

    public static void main(String[] args) {

        Vector vector = new Vector(10);

        vector.addNewElement("element 1");
        vector.addNewElement("element 2");
        vector.addNewElement("element 3");

        System.out.println(vector.searchIfExists("element 2"));
    }
}
