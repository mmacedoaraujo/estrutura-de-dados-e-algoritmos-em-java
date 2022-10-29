package com.mmacedo.datastructure.vector;

import java.util.Arrays;

public class Vector {

    private String[] elements;
    private int size;

    public Vector(int length) {
        this.elements = new String[length];
        this.size = 0;
    }

   /* public void addNewElement(String element) {
        for (int i = 0; i < elements.length; i++) {
            if (this.elements[i] == null) {
                this.elements[i] = element;
                break;
            }
        }
    }
    */

    public boolean addNewElement(String element) {
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public String search(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return this.elements[position];
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i]);
            sb.append(", ");

        }

        if (this.size > 0) {
            sb.append(this.elements[this.size - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
