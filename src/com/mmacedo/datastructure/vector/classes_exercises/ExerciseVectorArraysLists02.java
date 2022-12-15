package com.mmacedo.datastructure.vector.classes_exercises;

import com.mmacedo.datastructure.vector.List;

public class ExerciseVectorArraysLists02 {

    public static void main(String[] args) {

        List<String> objectList = new List<>(10);
        objectList.addNewElement("A");
        objectList.addNewElement("Z");
        objectList.addNewElement("B");
        objectList.addNewElement("C");
        System.out.println(objectList.lastIndexOf("A"));
        System.out.println(objectList.lastIndexOf("Z"));
    }
}
