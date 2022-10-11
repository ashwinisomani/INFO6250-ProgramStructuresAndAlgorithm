package BinarySearch;

//Solution --> 8

import java.util.ArrayList;
import java.util.List;

public class LeavesOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);
        root.leftChild.leftChild = new Node(4);
        root.leftChild.rightChild = new Node(5);

        var leaves = new LeavesOfBinaryTree();
        var result = leaves.findLeaves(root);
        System.out.println(result);
    }
    private List<List<Integer>> solution;
    private int getHeight(Node root) {

        // return -1 for null nodes
        if (root == null) {
            return -1;
        }

        // first calculate the height of the left and right children
        int leftHeight = getHeight(root.leftChild);
        int rightHeight = getHeight(root.rightChild);
        int currHeight = Math.max(leftHeight, rightHeight) + 1;

        if (this.solution.size() == currHeight) {
            this.solution.add(new ArrayList<>());
        }

        this.solution.get(currHeight).add(root.value);
        return currHeight;
    }

    public List<List<Integer>> findLeaves(Node root) {
        this.solution = new ArrayList<>();
        getHeight(root);
        return this.solution;
    }
}
