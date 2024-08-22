package org.queue.contract;

public interface Queue {
    /**
     * This method check the queue is element contains in the queue or not
     *
     * @return boolean true if element contains otherwise return false
     */
    public boolean isEmpty();

    /**
     * This method give tell how many elements in the queue
     *
     * @return int return the number of element in the queue
     */
    public int size();

    /**
     * This method give the first element of the queue
     *
     * @return Object first element of the queue
     */
    public Object getFirst();

    //    transformers

    /**
     * This method delete all the elements fromm the queue
     */
    public void clear();

    /**
     * This method add the element in the queue. It adds the element always in the end
     *
     * @param elem the element that need to be added in the queue
     */
    public void addLast(Object elem);

    /**
     * This method remove the element from the queue. It always from the element from the start of the queue
     *
     * @return Object return the element that is removed recently
     */
    public Object removeFirst();
}
