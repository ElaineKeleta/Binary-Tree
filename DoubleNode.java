 

/**
 * Class DoubleNode.
 * Defines a node to be used in a double-linked list.
 *
 * Elaine Keleta
 * @version 2021-03-28
 */

public class DoubleNode<T> {

    private final T value;
    private DoubleNode<T> next;
    private DoubleNode<T> previous;

    /**
     * Constructor: initializes the value field to the
     * input (read-only) and the two DoubleNode reference fields to null.
     * These two references are typically set to point to other nodes
     * in the list once the node is inserted.
     * @param value The read-only value "payload" for this node.
     */
    public DoubleNode(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    /**
     * Returns the value stored in this node.
     * @return The read-only value.
     */
    public T getValue() {
        return value;
    }

    /**
     * Returns a reference to the previous node in the list, or null if 
     * this does not exist.
     * @return Previous node or null.
     */
    public DoubleNode<T> getPrevious() {
        return previous;
    }

    /**
     * Sets the previous node reference to point to the supplied node.
     * @param The previous node.
     */
    public void setPrevious(DoubleNode<T> previous) {
        this.previous = previous;
    }

    /**
     * Returns a reference to the next node in the list, or null if 
     * this does not exist.
     * @return Next node or null.
     */
    public DoubleNode<T> getNext() {
        return next;
    }

    /**
     * Sets the next node reference to point to the supplied node.
     * @param The next node.
     */
    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }
}

