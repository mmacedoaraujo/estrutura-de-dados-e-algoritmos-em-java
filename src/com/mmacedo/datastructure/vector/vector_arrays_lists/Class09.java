package com.mmacedo.datastructure.vector.vector_arrays_lists;

import com.mmacedo.datastructure.vector.Vector;

public class Class09 {

    public static void main(String[] args) {

        Vector vector = new Vector(3);

        vector.addNewElement("B");
        vector.addNewElement("G");
        vector.addNewElement("D");
        vector.addNewElement("E");
        vector.addNewElement("F");

        vector.removeElement(2);

        System.out.println(vector);
    }
}
