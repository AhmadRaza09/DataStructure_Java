package org.queue.contract;

public interface Queue {
    public boolean isEmpty();

    public int size();

    public Object getFirst();

    //    transformers
    public void clear();

    public void addLast(Object elem);

    public Object removeFirst();
}
