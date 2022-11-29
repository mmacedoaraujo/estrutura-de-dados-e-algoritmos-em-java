package com.mmacedo.datastructure.base;

public class StaticStructure<T> {

    protected T[] elements;
    protected int size;

    public StaticStructure() {
        this(10);
    }

    public StaticStructure(Integer length) {
        if (length == 0) {
            length = 10;
        }
        this.elements = (T[]) new Object[length]; //solution provided by book effective java
        this.size = 0;
    }

    protected boolean addNewElement(T element) {
        this.addMoreCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    protected void addNewElement(T element, int position) {
        positionValidator(position);

        this.addMoreCapacity();

        for (int i = this.size - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }

        this.elements[position] = element;
        this.size++;
    }

    private void positionValidator(int position) {
        if (!(position >= 0 && position < this.size)) {
            throw new IllegalArgumentException("Invalid position");
        }
    }

    protected void addMoreCapacity() {
        if (this.size == this.elements.length) {
            T[] newElementsVector = (T[]) new Object[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                newElementsVector[i] = this.elements[i];
            }
            this.elements = newElementsVector;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
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
