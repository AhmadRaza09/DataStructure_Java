package org.stack.contract;

public interface Stack {
    /**
     * This method return the true if the stack is empty otherwise return the false
     *
     * @return boolean
     */
    public boolean isEmpty();

    /**
     * This method return the element at the top of the stack
     * if the stack is empty then it throw the NoSuchElementException
     *
     * @return Object
     */
    public Object getLast();

    /**
     * This method remove all the elements from the stack
     */
    public void clear();

    /**
     * This method add the element at the top of the stack
     *
     * @param elem
     */
    public void addLast(Object elem);

    /**
     * This method remove and return the top element of the stack
     * if the stack is empty then it returns the NoSucElementException
     *
     * @return Object
     */
    public Object removeLast();
}
