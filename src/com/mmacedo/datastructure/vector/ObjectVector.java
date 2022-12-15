package com.mmacedo.datastructure.vector;

public class ObjectVector {

    private Object[] elements;
    private int size;

    public ObjectVector(int length) {
        this.elements = new Object[length];
        this.size = 0;
    }

    public boolean addNewElement(Object element) {
        this.addMoreCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public void addNewElement(Object element, int position) {
        positionValidator(position);

        this.addMoreCapacity();

        for (int i = this.size - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }

        this.elements[position] = element;
        this.size++;
    }

    private void addMoreCapacity() {
        if (this.size == this.elements.length) {
            Object[] newElementsVector = new Object[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                newElementsVector[i] = this.elements[i];
            }
            this.elements = newElementsVector;
        }
    }

    public Object search(int position) {
        positionValidator(position);
        return this.elements[position];
    }

    public void removeElement(int position) {
        positionValidator(position);
        for (int i = position; i <= this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    public int search(Object element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void positionValidator(int position) {
        if (!(position >= 0 && position < this.size)) {
            throw new IllegalArgumentException("Invalid position");
        }
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
