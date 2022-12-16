package com.mmacedo.datastructure.list;

public class LinkedList<T> {

    private Node<T> begin;
    private int size;

    public void addNewElement(T element) {
        Node<T> cell = new Node<T>(element);
        this.begin = cell;
        this.size++;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "begin=" + begin +
                '}';
    }
}
