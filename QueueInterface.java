
/**
 * Interface for Queue
 *
 * @author Petya Stoeva - stoeva@bc.edu
 * @version 2021-03-28
 */

public interface QueueInterface<T> {
    
    void push(T value);
    
    T peek();
    
    T pop();
    
    boolean isEmpty();
}