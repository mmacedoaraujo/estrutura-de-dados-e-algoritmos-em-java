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

    public void clear() {
        for (Node<T> actual = this.begin; actual != null; ) {
            Node<T> next = actual.getNext();
            actual.setElement(null);
            actual.setNext(null);
            actual = next;
        }

        this.begin = null;
        this.end = null;
        this.size = 0;
    }

    @Override
    public String toString() {

        if (this.size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Node<T> actual = this.begin;
        builder.append(actual.getElement()).append(", ");
        while (actual.getNext() != null) {
            actual = actual.getNext();
            if (actual.getNext() == null) {
                builder.append(actual.getElement()).append("]");
            } else {
                builder.append(actual.getElement()).append(", ");
            }

        }

        return builder.toString();
    }
}
