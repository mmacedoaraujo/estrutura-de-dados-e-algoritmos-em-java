package com.mmacedo.datastructure.vector_arrays_lists.classes_exercises;

import com.mmacedo.datastructure.vector_arrays_lists.List;

public class ExerciseVectorArraysLists04 {

    public static void main(String[] args) {

        List<String> objectList = new List<>(10);
        objectList.addNewElement("A");
        objectList.addNewElement("Z");
        objectList.addNewElement("B");
        objectList.addNewElement("C");
        System.out.println(objectList.get(0));
        System.out.println(objectList.get(6));
    }
}