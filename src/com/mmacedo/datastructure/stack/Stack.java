package com.mmacedo.datastructure.stack;

import com.mmacedo.datastructure.base.StaticStructure;

public class Stack<T> extends StaticStructure<T> {

    public Stack() {
        super();
    }

    public Stack(Integer length) {
        super(length);
    }


    public void push(T element) {
        super.addNewElement(element);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public T peek() {
        if (this.isEmpty()) {
            return null;
        }

        return this.elements[this.size - 1];
    }

    public T pop() {

        if (this.isEmpty()) {
            return null;
        }
        return this.elements[size--];
    }
}
