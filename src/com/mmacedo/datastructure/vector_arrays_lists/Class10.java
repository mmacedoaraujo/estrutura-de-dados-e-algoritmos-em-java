package com.mmacedo.datastructure.vector_arrays_lists;

import com.mmacedo.datastructure.vector.ObjectVector;

public class Class10 {

    public static void main(String[] args) {

        ObjectVector vector = new ObjectVector(3);

        Contact c1 = new Contact("Contato1", 12345342, "contato1@gmail.com");
        Contact c2 = new Contact("Contato2", 12345342, "contato2@gmail.com");
        Contact c3 = new Contact("Contato3", 12345342, "contato3@gmail.com");
        Contact c4 = new Contact("Contato1", 12345342, "contato1@gmail.com");

        vector.addNewElement(c1);
        vector.addNewElement(c2);
        vector.addNewElement(c3);

        System.out.println("Tamanho = " + vector.size());

        int position = vector.search(c4);
        if(position > -1) {
            System.out.println("Element does exist on vector");
        } else {
            System.out.println("Element does not exist on vector");
        }
    }
}
