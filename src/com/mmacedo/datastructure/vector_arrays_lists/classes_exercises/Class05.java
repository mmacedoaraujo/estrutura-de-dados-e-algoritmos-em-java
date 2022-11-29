package com.mmacedo.datastructure.vector_arrays_lists.classes_exercises;

import com.mmacedo.datastructure.vector_arrays_lists.Vector;

public class Class05 {

    public static void main(String[] args) {

        Vector vector = new Vector(10);

        vector.addNewElement("element 1");
        vector.addNewElement("element 2");
        vector.addNewElement("element 3");

        System.out.println(vector.search(2));


    }
}
