package com.mmacedo.datastructure.stack.classes_exercises;

import com.mmacedo.datastructure.stack.Stack;

import java.util.Scanner;

public class ExerciseStacks01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número " + i + ": ");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println("Empilhando o número " + number);
                stack.push(number);
            } else if (number % 2 != 0) {
                if (stack.isEmpty()) {
                    System.out.println("A pilha está vazia!");
                } else {
                    System.out.println("Desempilhando o número " + stack.peek() + ", pois o número " + number + " é ímpar!");
                    stack.pop();
                }
            }
        }

        System.out.println("Todos os números foram lidos: " + stack);
        System.out.println("Agora desempilhando: ");

        while(!stack.isEmpty()) {
            System.out.println("Número " + stack.peek() + " desempilhado!");
            stack.pop();
        }
    }
}
