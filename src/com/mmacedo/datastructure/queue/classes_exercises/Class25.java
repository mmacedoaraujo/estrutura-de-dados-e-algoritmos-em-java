package com.mmacedo.datastructure.queue.classes_exercises;

import com.mmacedo.datastructure.queue.Patient;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Class25 {

    public static void main(String[] args) {

        Queue<Patient> priorityQueue = new PriorityQueue<>(
                new Comparator<Patient>() {
                    @Override
                    public int compare(Patient o1, Patient o2) {
                        return Integer.valueOf(o1.getPriority()).compareTo(o2.getPriority());
                    }
                }
        );

        priorityQueue.add(new Patient("a", 400));
        priorityQueue.add(new Patient("b", 50));
        priorityQueue.add(new Patient("c", 30));
        priorityQueue.add(new Patient("a", 200));


        System.out.println(priorityQueue);
    }
}
