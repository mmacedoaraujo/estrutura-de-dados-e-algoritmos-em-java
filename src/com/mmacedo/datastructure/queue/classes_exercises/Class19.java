package com.mmacedo.datastructure.queue.classes_exercises;

import com.mmacedo.datastructure.queue.Queue;

public class Class19 {

    public static void main(String[] args) throws Exception {

        Queue<Integer> queue = new Queue<>(5);
        System.out.println(queue.isEmpty());

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(5);
        queue.offer(5);
        queue.offer(5);
        queue.offer(5);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
    }
}
