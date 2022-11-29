package com.mmacedo.datastructure.stack.classes_exercises;

import com.mmacedo.datastructure.stack.Stack;

public class Class14 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 1; i <= 12; i++) {
            stack.push(i);
        }

        System.out.println(stack);
        System.out.println(stack.size());
    }
}
