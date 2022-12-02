package com.mmacedo.datastructure.stack.classes_exercises.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book {
    private String name;
    private Integer isbn;
    private LocalDate releaseYear;
    private String author;

    public Book() {

    }

    public Book(String name, Integer isbn, LocalDate releaseYear, String author) {
        this.name = name;
        this.isbn = isbn;
        this.releaseYear = releaseYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "ExerciseStacks03_BookEntity{" +
                "name='" + name + '\'' +
                ", isbn=" + isbn +
                ", releaseYear='" + releaseYear.format(dateFormatter) + '\'' +
                ", author='" + author + '\'' +
                '}' +
                "\n";
    }
}
