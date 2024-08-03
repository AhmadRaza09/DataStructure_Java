package org.linkedlist.sll;

public class SLLNode {
    protected Object element;

    protected SLLNode succ;

    public SLLNode(Object element, SLLNode succ) {
        this.element = element;
        this.succ = succ;
    }
}
