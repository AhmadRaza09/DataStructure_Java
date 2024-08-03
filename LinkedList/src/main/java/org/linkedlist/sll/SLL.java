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

    /**
     * This method delete the provided node from the linked list
     *
     * @param del
     */
    public void delete(SLLNode del) {
        SLLNode succ = del.succ;

        if (first == del) {
            first = succ;
        } else {
            SLLNode pred = first;

            while (pred.succ != del) {
                pred = pred.succ;
            }
            pred.succ = succ;
        }
    }

    /**
     * This method find the target element in the list if it contains
     * it will return that node otherwise it returns the null
     * it implements the linear search
     *
     * @param target
     * @return
     */
    public SLLNode search(Object target) {
        for (SLLNode cur = first; cur != null; cur = cur.succ) {
            if (target.equals(cur.element)) {
                return cur;
            }
        }
        return null;
    }
}
