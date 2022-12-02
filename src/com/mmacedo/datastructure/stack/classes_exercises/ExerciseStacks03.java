package com.mmacedo.datastructure.stack.classes_exercises;

import com.mmacedo.datastructure.stack.Stack;
import com.mmacedo.datastructure.stack.classes_exercises.entities.Book;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ExerciseStacks03 {

    public static void main(String[] args) {

        Random random = new Random();
        Book book1 = new Book("Senhor dos anéis", random.nextInt(999999999), LocalDate.of(1954, 07, 29), "J.R.R. Tolkien");
        Book book2 = new Book("As vantagens de ser invisível", random.nextInt(999999999), LocalDate.of(1954, 07, 29), "J.R.R. Tolkien");
        Book book3 = new Book("Os 7 maridos de Evelyn Hugo", random.nextInt(999999999), LocalDate.of(1954, 07, 29), "J.R.R. Tolkien");
        Book book4 = new Book("Crônicas de Nárnia", random.nextInt(999999999), LocalDate.of(1954, 07, 29), "J.R.R. Tolkien");
        Book book5 = new Book("Harry Potter", random.nextInt(999999999), LocalDate.of(1954, 07, 29), "J.R.R. Tolkien");
        Book book6 = new Book("Percy Jackson", random.nextInt(999999999), LocalDate.of(1954, 07, 29), "J.R.R. Tolkien");
        Book book7 = new Book("Torre Negra", random.nextInt(999999999), LocalDate.of(1954, 07, 29), "J.R.R. Tolkien");

        Stack<Book> bookStack = new Stack<>(20);

        System.out.println("Pilha está vazia? " + bookStack.isEmpty());

        bookStack.push(book1);
        bookStack.push(book2);
        bookStack.push(book3);
        bookStack.push(book4);
        bookStack.push(book5);
        bookStack.push(book6);
        System.out.println("6 livros adicionados!");

        System.out.println("Pilha está vazia? " + bookStack.isEmpty());

        System.out.println(bookStack);

        System.out.println("O último livro adicionado foi: " + bookStack.peek().getName());

        while (!bookStack.isEmpty()) {
            System.out.println("Desempilhando: " + bookStack.peek().getName());
            bookStack.pop();
        }




    }
}
