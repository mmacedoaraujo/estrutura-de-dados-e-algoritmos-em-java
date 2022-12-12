package com.mmacedo.datastructure.queue.classes_exercises;

import java.util.LinkedList;
import java.util.Queue;

public class Class23 {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.remove());

        System.out.println(queue);

    }
}
