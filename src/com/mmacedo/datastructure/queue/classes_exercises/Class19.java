package com.mmacedo.datastructure.queue.classes_exercises;

import com.mmacedo.datastructure.queue.Queue;

public class Class19 {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>(5);

        queue.addNewElement(1);
        queue.addNewElement(2);
        queue.addNewElement(3);

        queue.remove();
    }
}
