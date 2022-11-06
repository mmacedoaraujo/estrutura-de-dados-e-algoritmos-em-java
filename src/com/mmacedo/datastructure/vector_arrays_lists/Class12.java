package com.mmacedo.datastructure.vector_arrays_lists;

import java.util.ArrayList;

public class Class12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        boolean exists = arrayList.contains("A");
        if (exists) {
            System.out.println("Element does exists on the array");
        } else {
            System.out.println("Element does not exists on the array");
        }

        int pos = arrayList.indexOf("Z");

        if (pos > -1) {
            System.out.println("Element does exists on the array");
        } else {
            System.out.println("Element does not exists on the array");
        }

        //System.out.println(arrayList.get(4));

        arrayList.remove(1);
        arrayList.remove("A");

        System.out.println(arrayList);

        System.out.println(arrayList.size());
    }
}
