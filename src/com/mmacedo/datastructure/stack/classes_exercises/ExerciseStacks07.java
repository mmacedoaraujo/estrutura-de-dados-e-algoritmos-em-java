package com.mmacedo.datastructure.stack.classes_exercises;

import com.mmacedo.datastructure.stack.Stack;

import java.util.Scanner;

public class ExerciseStacks07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println(decimalToAnyBase(25, 16));
        System.out.println(decimalToAnyBase(10035, 8));
        System.out.println(decimalToAnyBase(10035, 16));


    }

    public static String decimalToAnyBase(Integer number, Integer base) {
        if (base > 16) {
            StringBuilder sb = new StringBuilder();
            Stack<Integer> binaryStack = new Stack<>();
            int x = number;
            int y = base;
            String hexadecimal = "0123456789ABCDEF";
            if (number > 0) {
                while (x != 0) {
                    binaryStack.push(x % y);
                    x /= base;
                }
                while (!binaryStack.isEmpty()) {
                    sb.append(hexadecimal.charAt(binaryStack.peek()));
                    binaryStack.pop();
                }

                return sb.toString();
            }
        }
        return "-1";
    }
}
