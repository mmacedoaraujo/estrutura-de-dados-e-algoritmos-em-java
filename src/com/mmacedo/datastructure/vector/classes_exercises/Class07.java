package com.mmacedo.datastructure.vector.classes_exercises;

import com.mmacedo.datastructure.vector.Vector;

public class Class07 {

    public static void main(String[] args) {

        Vector vector = new Vector(3);

        vector.addNewElement("B");
        vector.addNewElement("C");
        vector.addNewElement("E");
        vector.addNewElement("F");
        vector.addNewElement("G");
        System.out.println(vector.size());
        vector.addNewElement("D", 2);
        vector.addNewElement("A", 0);
        System.out.println(vector.size());

        System.out.println(vector.toString());
    }
}
