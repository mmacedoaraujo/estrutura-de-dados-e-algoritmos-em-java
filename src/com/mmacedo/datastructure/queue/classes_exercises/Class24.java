package com.mmacedo.datastructure.queue.classes_exercises;

import com.mmacedo.datastructure.queue.Patient;
import com.mmacedo.datastructure.queue.PriorityQueue;

public class Class24 {

    public static void main(String[] args) throws Exception {

        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(new Patient("Alou", 2));
        priorityQueue.offer(new Patient("Alou", 3));
        priorityQueue.offer(new Patient("Alou", 1));

        System.out.println(priorityQueue);

        priorityQueue.poll();

        System.out.println(priorityQueue);

    }
}
