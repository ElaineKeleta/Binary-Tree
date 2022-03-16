
/**
 * Class TreeNode
 *
 * Elaine Keleta
 * @version 2021-03-28
 */

public class TreeNode<T extends Comparable<T>> {
    
    public T value;
    public TreeNode<T> left;
    public TreeNode<T> right;
    public TreeNode<T> parent;
    
    public TreeNode(T value, TreeNode<T> parent) {
        this.value = value;
        left = null;
        right = null;
        this.parent = parent;
    }
    
}
