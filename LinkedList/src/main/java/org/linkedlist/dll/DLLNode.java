package org.linkedlist.dll;

public class DLLNode {
    protected Object element;

    protected DLLNode pred, succ;

    public DLLNode(Object element, DLLNode pred, DLLNode succ) {
        this.element = element;
        this.pred = pred;
        this.succ = succ;
    }
}
