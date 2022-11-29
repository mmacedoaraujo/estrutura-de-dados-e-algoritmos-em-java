package com.mmacedo.datastructure.vector_arrays_lists.classes_exercises;

import com.mmacedo.datastructure.vector_arrays_lists.List;

public class ExerciseVectorArraysLists05 {

    public static void main(String[] args) {

        List<String> objectList = new List<>(10);
        objectList.addNewElement("A");
        objectList.addNewElement("Z");
        objectList.addNewElement("B");
        objectList.addNewElement("C");
        objectList.addNewElement("D");
        objectList.addNewElement("E");
        objectList.clear();
        System.out.println(objectList);
    }
}
