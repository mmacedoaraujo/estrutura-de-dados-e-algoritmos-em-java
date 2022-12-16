package com.mmacedo.datastructure.list;

public class LinkedList<T> {

    private Node<T> begin;
    private Node<T> end;
    private int size;

    public void addNewElement(T element) {
        Node<T> cell = new Node<T>(element);
        if (this.size == 0) {
            this.begin = cell;
        } else {
            this.end.setNext(cell);
        }
        this.end = cell;
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
