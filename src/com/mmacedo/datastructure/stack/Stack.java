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
}
