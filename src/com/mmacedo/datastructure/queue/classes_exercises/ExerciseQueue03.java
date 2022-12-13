package com.mmacedo.datastructure.queue.classes_exercises;

import com.mmacedo.datastructure.queue.PatientPriorityColor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ExerciseQueue03 {

    public static void main(String[] args) throws Exception {

        Queue<PatientPriorityColor> queue = new LinkedList<>();

        queue.add(new PatientPriorityColor("Maria", "red"));
        queue.add(new PatientPriorityColor("Ana", "red"));
        queue.add(new PatientPriorityColor("João", "yellow"));
        queue.add(new PatientPriorityColor("Casimiro", "yellow"));
        queue.add(new PatientPriorityColor("Vitor", "green"));
        queue.add(new PatientPriorityColor("Júlia", "green"));

        while (!queue.isEmpty()) {
            priorityQueueSelector("red", queue);
            generatePatients(queue);
            priorityQueueSelector("yellow", queue);
            generatePatients(queue);
            priorityQueueSelector("green", queue);
            generatePatients(queue);



        }
    }


    public static void priorityQueueSelector(String color, Queue<PatientPriorityColor> queue) throws InterruptedException {
        while (queue.stream().anyMatch(object -> object.getColorPriority().equals(color))) {
            PatientPriorityColor patientPriority = queue.stream().filter(patient -> patient.getColorPriority().equals(color)).findAny().get();
            if (!(patientPriority == null)) {
                System.out.println(patientPriority);
                queue.remove(patientPriority);
                Thread.sleep(5000);

            }
        }
    }

    public static void generatePatients(Queue<PatientPriorityColor> queue) throws InterruptedException {
        Random randomizerColor = new Random();
        Random randomizeName = new Random();
        String colors[] = {"red", "yellow", "green"};
        String names[] = {"Maria", "Júlia", "João", "Fernando", "Henrique", "Julieta", "Caroline", "Márcio", "Ananda", "Fernanda"};
        for (int i = 0; i <= 1; i++) {
            queue.add(new PatientPriorityColor(names[randomizeName.nextInt(9)], colors[randomizerColor.nextInt(3)]));
        }
    }
}
