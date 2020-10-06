package BinarySearchTrees;

public class BinarySearchTree<T extends Comparable<T>> {
    protected Node root;

    protected class Node {
        public T item;
        public Node left;
        public Node right;

        Node (T item) {
            this.item = item;
        }

        Node (T item, Node left, Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }

    public static BinarySearchTree<Integer> fromSortedArray(int[] values) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.root = bst.fromSortedArray(values, 0, values.length - 1); // setting a new root
        return bst;
    }

    private Node fromSortedArray(int[] values, int lower, int upper) {
        // TODO: Replace the following code with your solution
        return null;
    }



}
