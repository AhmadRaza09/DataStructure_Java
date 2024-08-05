package org.stack.implementation;

import org.stack.contract.Stack;

import java.util.NoSuchElementException;

public class ArrayStack implements Stack {
    private Object[] elems;

    private int depth;

    public ArrayStack(int maxDepth) {
        elems = new Object[maxDepth];
        depth = 0;
    }

    @Override
    public boolean isEmpty() {
        return (depth == 0);
    }

    @Override
    public Object getLast() {
        if (depth == 0) {
            throw new NoSuchElementException();
        }

        return elems[depth - 1];
    }

    @Override
    public void clear() {
        for (int i = 0; i < depth; i++) {
            elems[i] = null;
        }

        depth = 0;
    }

    @Override
    public void addLast(Object elem) {
        if (depth == elems.length) {
            expand();
        }
        elems[depth++] = elem;
    }

    @Override
    public Object removeLast() {
        if (depth == 0) {
            throw new NoSuchElementException();
        }
        Object removeFromTop = elems[--depth];
        elems[depth] = null;

        return removeFromTop;
    }

    //    auxiliary methods
    private void expand() {
        Object[] newElements = new Object[2 * elems.length];

        for (int i = 0; i < depth; i++) {
            newElements[i] = elems[i];
        }

        elems = newElements;
    }
}
