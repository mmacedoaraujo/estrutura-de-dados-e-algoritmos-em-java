package com.mmacedo.datastructure.vector.vector_arrays_lists;

import com.mmacedo.datastructure.vector.Vector;

public class Class04 {

    public static void main(String[] args) {

        Vector vector = new Vector(10);

        vector.addNewElement("element 1");
        vector.addNewElement("element 2");
        vector.addNewElement("element 3");

        System.out.println(vector.size());
        System.out.println(vector);
    }
}
