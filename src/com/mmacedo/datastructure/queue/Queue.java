package com.mmacedo.datastructure.queue;

import com.mmacedo.datastructure.base.StaticStructure;

public class Queue<T> extends StaticStructure {

    public Queue(Integer length) {
        super(length);
    }

    public boolean offer(T element) throws Exception {
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public T peek() {
        if (this.isEmpty()) {
            return null;
        }
        return (T) this.elements[0];
    }

    public void poll() {
        for (int i = 0; i < size - 1; i++) {
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
