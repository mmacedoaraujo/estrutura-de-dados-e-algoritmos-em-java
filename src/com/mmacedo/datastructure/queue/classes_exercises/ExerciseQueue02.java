package com.mmacedo.datastructure.queue.classes_exercises;

import com.mmacedo.datastructure.queue.Patient;

import java.util.LinkedList;
import java.util.Queue;

public class ExerciseQueue02 {

    public static void main(String[] args) throws Exception {

        Queue<Patient> queue = new LinkedList<>();

        queue.add(new Patient("Maria", 1));
        queue.add(new Patient("João", 1));
        queue.add(new Patient("Tertúlio", 2));
        queue.add(new Patient("Gerônimo", 2));
        queue.add(new Patient("Maciel", 1));
        queue.add(new Patient("Júlia", 2));
        queue.add(new Patient("Carolina", 2));
        queue.add(new Patient("Ana", 1));
        queue.add(new Patient("Bento", 2));
        queue.add(new Patient("Bento", 1));
        queue.add(new Patient("Bento", 1));
        queue.add(new Patient("Bento", 2));
        queue.add(new Patient("Bento", 1));
        queue.add(new Patient("Bento", 2));

        Queue<Patient> sortedQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                if (queue.stream().anyMatch(patient -> patient.getPriority() == 1)) {
                    Patient patientPriority1 = queue.stream().filter(patient -> patient.getPriority() == 1).findAny().get();
                    if (!(patientPriority1 == null)) {
                        System.out.println(patientPriority1);
                        queue.remove(patientPriority1);
                    }

                }
            }
            Patient patientPriority2 = queue.stream().filter(patient -> patient.getPriority() == 2).findFirst().get();
            System.out.println(patientPriority2);
            queue.remove(patientPriority2);

        }
    }
}
