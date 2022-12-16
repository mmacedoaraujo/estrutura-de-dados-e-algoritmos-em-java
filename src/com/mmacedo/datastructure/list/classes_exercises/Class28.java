package com.mmacedo.datastructure.list.classes_exercises;

import com.mmacedo.datastructure.list.LinkedList;

public class Class28 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();

        list.addNewElement(1);

        System.out.println(list);
        System.out.println(list.getSize());

        list.addNewElement(2);
        System.out.println(list);

        list.addNewElement(3);
        System.out.println(list);
    }
}
