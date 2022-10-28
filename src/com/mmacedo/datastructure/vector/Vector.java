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
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;

    }
}
