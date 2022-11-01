package com.mmacedo.datastructure.vector;

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
        this.addMoreCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public void addNewElement(String element, int position) {
        if (!(position >= 0 && position < this.size)) {
            throw new IllegalArgumentException("Invalid position");
        }

        this.addMoreCapacity();

        for (int i = this.size - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];

        }
        this.elements[position] = element;
        this.size++;
    }

    private void addMoreCapacity() {
        if (this.size == this.elements.length) {
            String[] newElementsVector = new String[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                newElementsVector[i] = this.elements[i];
            }
            this.elements = newElementsVector;
        }
    }

    public String search(int position) {
        if (!(position >= 0 && position < this.size)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return this.elements[position];
    }

    public int searchIfExists(String element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size - 1; i++) {
            sb.append(this.elements[i]);
            sb.append(", ");

        }

        if (this.size > 0) {
            sb.append(this.elements[this.size - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
