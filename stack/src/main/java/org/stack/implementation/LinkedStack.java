package org.stack.implementation;

import org.stack.contract.Stack;

import java.util.NoSuchElementException;


public class LinkedStack implements Stack {
    private SLLNode top;

    public LinkedStack() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public Object getLast() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.element;
    }

    @Override
    public void clear() {
        top = null;
    }

    @Override
    public void addLast(Object elem) {
        top = new SLLNode(elem, top);
    }

    @Override
    public Object removeLast() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Object topElem = top.element;

        top = top.succ;

        return topElem;
    }
}
