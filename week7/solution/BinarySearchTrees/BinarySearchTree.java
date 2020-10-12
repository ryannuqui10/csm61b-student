package BinarySearchTrees;

public class BinarySearchTree<T extends Comparable<T>> {
    Node root;

    class Node<T> {
        T value;
        Node left;
        Node right;
    }

    public static BinarySearchTree<Integer> fromSortedArray(int[] values) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.root = bst.fromSortedArray(values, 0, values.length - 1); // setting a new root
        return bst;
    }

    private Node<Integer> fromSortedArray(int[] values, int lower, int upper) {
        if (lower > upper) {
            return null;
        }

        int middle = lower + ((upper - lower) / 2); // middle index of the array

        Node<Integer> mid = new Node();
        mid.value = values[middle];
        mid.left = fromSortedArray(values, lower, middle - 1); // recurse on the left half
        mid.right = fromSortedArray(values, middle + 1, upper); // recurse on the right half

        return mid;
    }
}
