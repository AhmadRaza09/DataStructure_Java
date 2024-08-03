package org.linkedlist.sll;

public class SLL {
    private SLLNode first;

    public SLL() {
        first = null;
    }

    /**
     * This method add the node in the single linked liked after the pred
     * if pred is null then it will add the new node as the first element of the list
     *
     * @param elem
     * @param pred
     */
    public void insert(Object elem, SLLNode pred) {
        SLLNode ins = new SLLNode(elem, null);

        if (pred == null) {
            //make the new node succ point to the list first element
            ins.succ = first;
            first = ins;
        } else {
            ins.succ = pred.succ;
            pred.succ = ins;
        }
    }
}
