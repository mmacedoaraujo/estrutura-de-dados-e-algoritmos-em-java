package com.mmacedo.datastructure.list.classes_exercises;

import com.mmacedo.datastructure.list.LinkedList;

public class Class30 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();

        list.addNewElement(1);
        list.addNewElement(2);
        list.addNewElement(3);
        list.addNewElement(4);

        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
