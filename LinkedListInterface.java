 

/**
 * Interface LinkedListInterface.
 * Defines the public interface for any linked list implementation.
 *
 * Elaine Keleta
 * @version 2021-03-28
 */

public interface LinkedListInterface<T> {

    /**
     * Inserts a datum (value) at the front of the linked list.
     * @param value Datum to be inserted.
     */
    void addFirst(T value);

    /**
     * Inserts a datum (value) at the end of the linked list.
     * @param value Datum to be inserted.
     */
    void addLast(T element);

    /**
     * Returns the datum (value) at the front of the linked list.
     * @return First item in the list.
     */
    T getFirst();

    /**
     * Returns the datum (value) at the end of the linked list.
     * @return Last item in the list.
     */
    T getLast();

    /**
     * Removes the datum (value) at the front of the linked list
     * and returns it.
     * @return First item in the list.
     */
    T removeFirst();

    /**
     * Removes the datum (value) at the end of the linked list
     * and returns it.
     * @return Last item in the list.
     */
    T removeLast();

    /**
     * Returns whether the list is empty.
     * @return True if there are no elements in the list; false otherwise.
     */
    boolean isEmpty();
}
