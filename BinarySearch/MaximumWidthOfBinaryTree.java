package BinarySearch;

//Solution --> 6

import java.util.ArrayList;
import java.util.List;

public class MaximumWidthOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.leftChild = new Node(3);
        root.rightChild = new Node(2);
        root.leftChild.leftChild = new Node(5);
        root.leftChild.rightChild = new Node(3);
        root.rightChild.rightChild = new Node(9);

        var width = new MaximumWidthOfBinaryTree();
        var result = width.widthOfBinaryTree(root);
        System.out.println(result);
    }

    public int widthOfBinaryTree(Node root) {
        return dfs(root, 0, 1, new ArrayList<Integer>(), new ArrayList<Integer>());
    }

    public int dfs(Node root, int level, int order, List<Integer> start, List<Integer> end){
        if(root == null)return 0;
        if(start.size() == level){
            start.add(order); end.add(order);
        }
        else end.set(level, order);
        int cur = end.get(level) - start.get(level) + 1;
        int left = dfs(root.leftChild, level + 1, 2*order, start, end);
        int right = dfs(root.rightChild, level + 1, 2*order + 1, start, end);
        return Math.max(cur, Math.max(left, right));
    }
}
