import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class BinaryTree 
 * Creates a tree and sorts it in different ways. It also can create it as a GraphViz.
 *
 * @stoeva- Petya Stoeva stoeva@bc.edu
 * @version 2021-03-28
 */

public class BinaryTree<T extends Comparable<T>> {

    private TreeNode<T> root;
    
    // Wrapper for add method
    public void add(T value) {
        if (root == null) {
            root = new TreeNode<T>(value, null);
        } else {
            add(root, value);
        }
    }
    
    private void add(TreeNode<T> node, T value) {
        if (value.compareTo(node.value) < 0) {
            if (node.left == null) {
                node.left = new TreeNode<T>(value, node);
            } else {
                add(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new TreeNode<T>(value, node);
            } else {
                add(node.right, value);
            }
        }
    }
    
    // Wrapper for printInOrder
    public void printInOrder() {
        printInOrder(root);
    }
    
    // Method that is responsible for Inorder traversal
    private void printInOrder(TreeNode<T> node) {
        if (node.left != null) {
            printInOrder(node.left);
        }
        System.out.print(node.value + " ");
        if (node.right != null) {
            printInOrder(node.right);
        }
    }
    
    // Wrapper for printPreOrder
    public void printPreOrder() {
        printPreOrder(root);
    }
    
    // Method that is responsible for Preorder traversal
    private void printPreOrder(TreeNode<T> root) {
        if (root != null) {
            System.out.print(root.value + " ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    } 
    
    // Wrapper for printPostOrder
    public void printPostOrder() {
        printPostOrder(root);
    }
    
    // Method that is responsible for PostOrder traversal
    private void printPostOrder(TreeNode<T> root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.value + " ");
        }
    } 
    
    // Uses the printRankOrder logic to set up a dot file called tree.gv
    public void printTreeGraph() {
        try {
            System.out.println("Dot file written as tree.gv");
            FileWriter filewriter = new FileWriter("tree.gv");
            filewriter.write("digraph Tree {");
            filewriter.write("\n");
            Queue<TreeNode<T>> queue = new Queue<>();
            queue.push(root);
            while (! queue.isEmpty()) {
                TreeNode<T> node = queue.pop();
                if (node.parent != null) {
                    filewriter.write("\t" + node.parent.value + " -> ");
                    filewriter.write(node.value + ";" +"\n");
                }
                if (node.left != null) {
                    queue.push(node.left);
                }
                if (node.right != null) {
                    queue.push(node.right);
                }
            }
            filewriter.write("}");
            filewriter.close();
        // Catches any error and prints error
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        BinaryTree<String> tree = new BinaryTree<>();
        System.out.printf("Please enter names. Enter 'quit' when finished. %n> ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // First loop asks for names
        while ( !input.equals("quit") ) {
            tree.add(input);
            System.out.print("> ");
            scanner = new Scanner(System.in);
            input = scanner.nextLine();
        }
        // Prints Menu
        System.out.printf("Please choose how to print the tree: %n\t" + 
        "1: Inorder traversal %n\t2: Preorder traversal %n\t" + 
        "3: Postorder traversal %n\t4: As a GraphViz Dot file %n\tq: quit%n");
        scanner= new Scanner(System.in);
        input = scanner.nextLine();
        // Second loop takes options for menu
        while ( !input.equals("q") ) {
            if (input.equals("1")) {
                tree.printInOrder();
                System.out.println();
            } else if (input.equals("2")) {
                tree.printPreOrder();
                System.out.println();
            } else if (input.equals("3")) {
                tree.printPostOrder();
                System.out.println();
            } else if (input.equals("4")) {
                tree.printTreeGraph();
            } else {
                System.out.println("error");  
            }
            System.out.print("> ");
            scanner = new Scanner(System.in);
            input = scanner.nextLine();
        }
    }
}
