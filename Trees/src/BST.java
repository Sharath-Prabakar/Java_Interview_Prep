import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int value)
    {
        this.data=value;
        this.left=null;
        this.right=null;
    }
}

public class BST {
    Node root;

    BST()
    {
        this.root=null;
    }

    public Node addNode(Node current, int value)
    {
        if(current==null)
        {
            return new Node(value);
        }
        else if(value<current.data)
        {
            current.left=addNode(current.left,value);
        }
        else if(value>current.data)
        {
            current.right=addNode(current.right,value);
        }
        else return current;
        return current;
    }

    public void add(int value) {
        root = addNode(root, value);
    }

    public void printInOrder(Node node)
    {
        if(node!=null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }

    public void printPreOrder(Node node)
    {
        if(node!=null) {
            System.out.print(node.data + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    public void printPostOrder(Node node)
    {
        if(node!=null) {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void breadthFirstSearch() {
        if (root == null) {
            return;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            Node node = nodes.remove();
            System.out.print(" " + node.data);

            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BST tree= new BST();
        tree.add(4);
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(6);
        tree.add(5);
        tree.add(7);
        System.out.print("Traversing InOrder - ");
        tree.printInOrder(tree.root);
        System.out.print("\nTraversing PreOrder - ");
        tree.printPreOrder(tree.root);
        System.out.print("\nTraversing PostOrder - ");
        tree.printPostOrder(tree.root);
        System.out.print("\nBreadth First Search - ");
        tree.breadthFirstSearch();
    }
}



