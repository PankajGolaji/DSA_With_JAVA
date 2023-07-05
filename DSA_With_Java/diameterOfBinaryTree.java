
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
public class diameterOfBinaryTree {

    int max = 0;
    public int height(Node root)
    if(root==null)
    return 0;

    int left = height(root.left);
    int right = height(root.right);

    int diameter = left+right;
    max = Math.max(max, left+right);
    return 1+Math.max(left,right);
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

