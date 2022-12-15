package com.mmacedo.datastructure.list;

public class LinkedList<T> {

    private Node<T> begin;

    public void addNewElement(T element) {
        Node<T> cell = new Node<T>(element);
        this.begin = cell;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "begin=" + begin +
                '}';
    }
}
