package com.mmacedo.datastructure.queue;

import com.mmacedo.datastructure.base.StaticStructure;

public class Queue<T> extends StaticStructure {

    public Queue(Integer length) {
        super(length);
    }

    @Override
    public boolean addNewElement(Object element) {
        return super.addNewElement(element);
    }

    @Override
    protected void addNewElement(Object element, int position) {
        super.addNewElement(element, position);
    }

    public void remove() {
        for (int i = 0; i < size; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        size--;
    }

    @Override
    protected void addMoreCapacity() {
        super.addMoreCapacity();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int size() {
        return super.size();
    }

    public Queue() {
        super();
    }


}
