package org.example;

public class Queue<E> extends MyList<E> {
}

class Stack<E> extends MyList<E> {
    public void push(E item) {
        super.addBegin(item);
    }
}
