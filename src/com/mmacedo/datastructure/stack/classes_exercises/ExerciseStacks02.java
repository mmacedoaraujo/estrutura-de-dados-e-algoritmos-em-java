package com.mmacedo.datastructure.stack.classes_exercises;

import com.mmacedo.datastructure.stack.Stack;

import java.util.Scanner;

public class ExerciseStacks02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> even = new Stack<>();
        Stack<Integer> odd = new Stack<>();
        int number = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("\nDigite o " + i + "º número: ");
            try {
                number = Integer.valueOf(scan.nextInt());

                if (number % 2 == 0 && number != 0) {
                    System.out.println("Empilhando o número " + number + " na pilha de números pares");
                    even.push(number);
                } else if (number % 2 != 0) {
                    System.out.println("Empilhando o número " + number + " na pilha de números ímpares");
                    odd.push(number);
                } else if (number == 0) {
                    if (even.isEmpty()) {
                        System.out.println("\nA pilha de números pares está vazia!");
                    } else {
                        System.out.println("\nDesempilhando o número " + even.peek() + " da pilha de números pares.");
                        even.pop();
                    }

                    if (odd.isEmpty()) {
                        System.out.println("\nA pilha de números ímpares está vazia!");
                    } else {
                        System.out.println("\nDesempilhando o número " + odd.peek() + " da pilha de números pares.");
                        odd.pop();
                    }

                }
            } catch (Exception ex) {
                System.out.println("\nEntrada inválida, tente novamente...");
                scan.next();
                i--;
            }
        }

        System.out.println();

        if (even.isEmpty()) {
            System.out.println("A pilha de números pares está vazia!");
        } else {
            System.out.println("Desempilhando números pares: ");
            while (!even.isEmpty()) {
                System.out.print(even.peek() + " ");
                even.pop();
            }
        }

        if (odd.isEmpty()) {
            System.out.println("\nA pilha de números ímpares está vazia!");
        } else {
            System.out.println("\nDesempilhando números ímpares: ");
            while (!odd.isEmpty()) {
                System.out.print(odd.peek() + " ");
                odd.pop();
            }
        }

    }
}
