package com.mmacedo.datastructure.vector.classes_exercises;

import com.mmacedo.datastructure.vector.List;

public class Class11 {

    public static void main(String[] args) {

        List<Contact> vector = new List(1);

        Contact c1 = new Contact("Contato1", 12345342, "contato1@gmail.com");

        vector.addNewElement(c1);
    }
}
