package com.mmacedo.datastructure.stack.classes_exercises;

import com.mmacedo.datastructure.stack.Stack;

public class Class16 {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println(stack.peek());

        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");

        System.out.println(stack.peek());

        System.out.println(stack);
    }
}
