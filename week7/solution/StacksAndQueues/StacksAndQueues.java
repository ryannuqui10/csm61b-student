package StacksAndQueues;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class StacksAndQueues {
    static class Node {
        int item;
        Node left;
        Node right;

        Node(int item) {
            this.item = item;
        }

        Node(int item, Node left, Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }

    public static void bfsTraversal(Node root) {
        Queue<Node> fringe = new LinkedList<Node>();
        fringe.add(root);
        while (!fringe.isEmpty()) {
            Node node = fringe.remove();

            System.out.println(node.item);

            if (node.left != null) {
                fringe.add(node.left);
            }

            if (node.right != null) {
                fringe.add(node.right);
            }
        }
    }

    public static void dfsTraversal(Node root) {
        Stack<Node> fringe = new Stack<Node>();
        fringe.push(root);
        while (!fringe.isEmpty()) {
            Node node = fringe.pop();

            System.out.println(node.item);

            if (node.left != null) {
                fringe.push(node.left);
            }

            if (node.right != null) {
                fringe.push(node.right);
            }
        }
    }

    public static void main(String[] args) {
        Node worksheetTree = new Node(1,
                new Node (2, new Node(5), new Node(9)),
                new Node(7, null, new Node (3, new Node(4), null)));

        System.out.println("BFS Traversal");
        bfsTraversal(worksheetTree);

        System.out.println();

        System.out.println("DFS Traversal");
        dfsTraversal(worksheetTree);
    }

}