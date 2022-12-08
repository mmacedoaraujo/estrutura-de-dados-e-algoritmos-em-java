package com.mmacedo.datastructure.queue;

import com.mmacedo.datastructure.base.StaticStructure;

public class Queue<T> extends StaticStructure {

    private T[] elements;
    private Integer size;

    public Queue(Integer length) {
        super(length);
    }

    public Queue() {
        super();
    }


}
