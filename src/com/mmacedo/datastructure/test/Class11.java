package com.mmacedo.datastructure.test;

import com.mmacedo.datastructure.vector.List;

public class Class11 {

    public static void main(String[] args) {

        List<Class10Contact> vector = new List(1);

        Class10Contact c1 = new Class10Contact("Contato1", "12345342", "contato1@gmail.com");

        vector.addNewElement(c1);
    }
}
