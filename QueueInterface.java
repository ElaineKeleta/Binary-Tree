
/**
 * Interface for Queue
 *
 * Elaine Keleta
 * @version 2021-03-28
 */

public interface QueueInterface<T> {
    
    void push(T value);
    
    T peek();
    
    T pop();
    
    boolean isEmpty();
}