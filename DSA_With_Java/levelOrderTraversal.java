
// WAP to find level of tree using recursion
import java.util.*;

class Node {
    int val;
    Node left = null;
    Node right = null;

    Node(int val) { // Constructor
        this.val = val; // (this)-> used for current value
    }
}

public class levelOrderTraversal {

    public static boolean printLevel(Node root, int level) {
        if (root == null)
            return false;
        if (level == 1) {
            System.out.println(root.val + " ");
            return true;
        }
        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);

        return (left || right);
    }

    public static void LevelOrderTraversal(Node root) {
        int level = 1;
        while (printLevel(root, level) == true) {
            level++;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        LevelOrderTraversal(root);
    }
}
