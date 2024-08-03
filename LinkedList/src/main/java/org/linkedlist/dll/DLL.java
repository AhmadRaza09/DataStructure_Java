package org.linkedlist.dll;

import org.linkedlist.sll.SLLNode;

public class DLL {
    private DLLNode first, last;

    public DLL() {
        first = last = null;
    }

    /**
     * This will add the new node in the doubly linked list
     * if the pred is null it will add the new add as the first element
     * of the doubly linked list
     *
     * @param elem
     * @param pred
     */
    public void insert(Object elem, DLLNode pred) {
        DLLNode ins = new DLLNode(elem, null, null);

        insertForward(ins, pred);
        DLLNode succ = ins.succ;
        insertBackward(ins, succ);
    }

    /**
     * This method delete the provide node from the doubly linked list
     *
     * @param del
     */
    public void delete(DLLNode del) {
//        after removing the forward and backward links of the provided node
//        it will delete by the garbage collection
        deleteBackwards(del, del.pred);
        deleteBackwards(del, del.succ);
    }

    /**
     * This method find the target element in the list if it contains
     * it will return that node otherwise it returns the null
     * it implements the linear search
     *
     * @param target
     * @return
     */
    public DLLNode search(Object target) {
        for (DLLNode cur = first; cur != null; cur = cur.succ) {
            if (target.equals(cur.element)) {
                return cur;
            }
        }
        return null;
    }

//    auxiliary methods

    /**
     * This will rearrange the links of the doubly linked list
     * in the forward direction and add the new node
     *
     * @param ins
     * @param pred
     */
    private void insertForward(DLLNode ins, DLLNode pred) {
        if (pred == null) {
            ins.succ = first;
            first = ins;
        } else {
            ins.succ = pred.succ;
            pred.succ = ins;
        }
    }

    /**
     * This will rearrange the link of the new node in the
     * backward direction
     *
     * @param ins
     * @param succ
     */
    private void insertBackward(DLLNode ins, DLLNode succ) {
        if (succ == null) {
            ins.pred = last;
            last = ins;
        } else {
            ins.pred = succ.pred;
            succ.pred = ins;
        }
    }

    /**
     * This method remove the forwards links of the provided node from the list
     *
     * @param del
     * @param pred
     */
    private void deleteForwards(DLLNode del, DLLNode pred) {
        DLLNode succ = del.succ;

        if (first == del) {
            first = succ;
        } else {
            pred.succ = succ;
        }
    }

    /**
     * This method delete the backwards links of the provided node from the list
     *
     * @param del
     * @param succ
     */
    private void deleteBackwards(DLLNode del, DLLNode succ) {
        DLLNode pred = del.pred;

        if (last == del) {
            last = pred;
        } else {
            succ.pred = pred;
        }
    }
}
