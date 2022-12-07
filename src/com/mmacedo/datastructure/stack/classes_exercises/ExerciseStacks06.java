package com.mmacedo.datastructure.stack.classes_exercises;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ExerciseStacks06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Insira a expressão que deseja avaliar se está correta: ");
        String expression = scan.nextLine();

        System.out.println((checkIfSymbolsAreOkay(expression)) ? "Símbolos estão equilibrados" : "Símbolos não estão equilibrados");


    }

    public static boolean checkIfSymbolsAreOkay(String expression) {
        Stack<String> rightSymbols = new Stack<>();
        Stack<String> leftSymbols = new Stack<>();
        String onlySymbolsString = expression.replaceAll("[\\w+-/*\\s]", "");

        for (int i = 0; i <= expression.length() - 1; i++) {
            if (onlySymbolsString.length() % 2 != 0) {
                return false;
            } else if (onlySymbolsString.substring(0, 1).equals(")")) {
                return false;
            } else if (i < expression.length() / 2) {
                rightSymbols.push(onlySymbolsString.substring(i, i + 1));
            } else {
                leftSymbols.add(onlySymbolsString.substring(i, i + 1));
            }
        }

        Collections.reverse(rightSymbols);
        while (!rightSymbols.isEmpty()) {
            if (rightSymbols.peek().equals("(") && leftSymbols.peek().equals(")") ||
                    rightSymbols.peek().equals("[") && leftSymbols.peek().equals("]") ||
                    rightSymbols.peek().equals("{") && leftSymbols.peek().equals("}")) {
                rightSymbols.pop();
                leftSymbols.pop();
                if (rightSymbols.isEmpty() && leftSymbols.isEmpty()) {
                    return true;
                }
            }
        }

        return false;
    }
}

