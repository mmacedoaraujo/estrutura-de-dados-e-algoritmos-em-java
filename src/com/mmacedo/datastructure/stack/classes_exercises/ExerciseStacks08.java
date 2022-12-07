package com.mmacedo.datastructure.stack.classes_exercises;

import com.mmacedo.datastructure.stack.Stack;

import java.util.Scanner;

public class ExerciseStacks08 {

    public static void main(String[] args) {
        Stack<Integer> towerOne = new Stack<>();
        Stack<Integer> towerTwo = new Stack<>();
        Stack<Integer> towerThree = new Stack<>();

        towerOne.push(3);
        towerOne.push(2);
        towerOne.push(1);
        hanoiTower(3, towerOne, towerTwo, towerThree);

    }

    public static void hanoiTower(int n, Stack<Integer> towerOne, Stack<Integer> towerTwo, Stack<Integer> towerThree) {
        if (n > 0 ){
            hanoiTower(n-1, towerOne, towerThree, towerTwo);
            towerTwo.push(towerOne.peek());
            towerOne.pop();
            System.out.println("--------");
            System.out.println("Tower one: " + towerOne);
            System.out.println("Tower two: " + towerTwo);
            System.out.println("Tower three: " + towerThree);
            hanoiTower(n-1, towerThree, towerTwo, towerOne);
        }
    }
}
