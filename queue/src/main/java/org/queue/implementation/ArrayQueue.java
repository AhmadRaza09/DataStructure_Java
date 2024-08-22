package org.queue.implementation;

import org.queue.contract.Queue;

import java.util.NoSuchElementException;

public class ArrayQueue implements Queue {
    private Object[] elems;

    private int length;

    private int front;

    private int rear;

    public ArrayQueue(int maxlength) {
        elems = new Object[maxlength];

        length = 0;

        front = rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return (length == 0);
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public Object getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return elems[front];
    }

    @Override
    public void clear() {
        for (int i = 0; i < elems.length; i++) {
            elems[i] = null;
        }
        length = 0;
        front = rear = 0;
    }

    @Override
    public void addLast(Object elem) {
//        todo add later
    }

    @Override
    public Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Object frontElement = elems[front];

        elems[front] = null;

        front++;

        //in case if front point to the out of the array index
        if (front == elems.length) {
            front = 0;
        }
        length--;

        return frontElement;
    }
}
