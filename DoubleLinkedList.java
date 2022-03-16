 

import java.util.NoSuchElementException;

/**
 * Class DoubleLinkedList.
 * Implements a double-linked list.
 *
 * @author Petya Stoeva - stoeva@bc.edu
 * @version 2021-03-28
 */

public class DoubleLinkedList<T> implements LinkedListInterface<T> {

    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    /**
     * Inserts a datum (value) at the front of the linked list.
     * @param value Datum to be inserted.
     */
    public void addFirst(T value) {
        DoubleNode<T> newNode = new DoubleNode<>(value);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
    }

    /**
     * Inserts a datum (value) at the end of the linked list.
     * @param value Datum to be inserted.
     */
    public void addLast(T value) {
        DoubleNode<T> newNode = new DoubleNode<>(value);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
    }

    /**
     * Returns the datum (value) at the front of the linked list.
     * @return First item in the list.
     */
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return head.getValue();
    }

    /**
     * Returns the datum (value) at the end of the linked list.
     * @return Last item in the list.
     */
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return tail.getValue();
    }

    /**
     * Removes the datum (value) at the front of the linked list
     * and returns it.
     * @return First item in the list.
     */
    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        DoubleNode<T> saved = head;
        head = head.getNext();
        if (head != null) {
            head.setPrevious(null);
        } else {
            tail = null;
        }
        return saved.getValue();
    }

    /**
     * Removes the datum (value) at the end of the linked list
     * and returns it.
     * @return Last item in the list.
     */
    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        DoubleNode<T> saved = tail;
        tail = tail.getPrevious();
        if (tail != null) {
            tail.setNext(null);
        } else {
            head = null;
        }
        return saved.getValue();
    }

    /**
     * Prints the contents of the linked list for debugging.
     */
    public void print() {
        System.out.print("null <- ");
        DoubleNode<T> current = head;
        while  (current != null) {
            System.out.print(current.getValue());
            if (current != tail) {
                System.out.print(" <-> ");
            }
            current = current.getNext();
        }
        System.out.println(" -> null");
    }

    /**
     * Returns whether the list is empty.
     * @return True if there are no elements in the list; false otherwise.
     */
    public boolean isEmpty() {
        return (head == null);
    }
}

