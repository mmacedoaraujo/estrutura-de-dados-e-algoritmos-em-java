package com.mmacedo.datastructure.stack.classes_exercises;

import java.util.Scanner;
import java.util.Stack;

public class ExerciseStacks05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String checkingString = "s";
        while (checkingString.equals("s")) {
            System.out.println("Insira a expressão que deseja verificar se é um palíndromo: ");
            String palindromeString = scan.nextLine();

            Stack<String> stringStack = stackCreator(palindromeString, new Stack<>());

            Stack<String> reverseStringStack = new Stack<>();


            for (int i = stringStack.size() - 1; i >= 0; i--) {
                reverseStringStack.push(stringStack.elementAt(i));
            }

            System.out.println(isPalindrome(stringStack, reverseStringStack));

            System.out.println("Deseja verificar outra expressão? [s/n]");
            checkingString = scan.nextLine();


        }
    }

    static String isPalindrome(Stack<String> stack1, Stack<String> stack2) {
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.peek().equals(stack2.peek())) {
                stack1.pop();
                stack2.pop();
            } else {
                return "Não é um palíndromo...";
            }
        }
        return "É um palíndromo!";
    }

    static Stack<String> stackCreator(String palindrome, Stack<String> palindromeStack) {
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            palindromeStack.push(palindrome.substring(i, i + 1).toUpperCase());
        }
        return palindromeStack;
    }
}


