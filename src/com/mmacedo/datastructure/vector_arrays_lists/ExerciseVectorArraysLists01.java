package com.mmacedo.datastructure.vector_arrays_lists;

import com.mmacedo.datastructure.vector.List;

public class ExerciseVectorArraysLists01 {

    public static void main(String[] args) {

        List<String> objectList = new List<>(10);
        objectList.addNewElement("A");
        objectList.addNewElement("Z");
        objectList.addNewElement("B");
        objectList.addNewElement("C");
        System.out.println(objectList.contains("A"));
        System.out.println(objectList.contains("G"));
    }
}
