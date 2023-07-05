// WAP to find height of tree

import java.util.*;

class Node{
    int val;
    Node left = null;
    Node right = null;

    Node(int val){ // Constructor
        this.val = val; // (this)-> used for current value
    }
}
public class heightOfTree {

    public static int height(Node root) // function define
    {
        if(root==null)
        return 0;
        return 1 + Math.max(height(root.left), height(root.right));
        // Formula to find height of tree = [1 + max(height of left), (height of right)]
        
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of the tree is : "+ height(root));
    }
    
}
