
/**
 * Class Queue
 * Defines queue
 *
 * @author Petya Stoeva - stoeva@bc.edu
 * @version 2021-03-28
 */

public class Queue<T> implements QueueInterface<T> {
    
    private DoubleLinkedList<T> list;
    
    public Queue() {
        list = new DoubleLinkedList<>();
    }
    
    public void push(T value) {
        list.addLast(value);
    }
    
    public T peek() {
        return list.getFirst();
    }
    
    public T pop() {
        return list.removeFirst();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
