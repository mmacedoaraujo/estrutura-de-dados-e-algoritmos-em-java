package com.mmacedo.datastructure.queue;

public class PriorityQueue<T> extends Queue<T> {

    public void offer(T element) {

        Comparable<T> chave = (Comparable<T>) element;

        int i;
        for (i = 0; i < this.size; i++) {
            if (chave.compareTo((T) this.elements[i]) < 0) {
                break;
            }
        }
        this.addNewElement(element, i);
    }

}
