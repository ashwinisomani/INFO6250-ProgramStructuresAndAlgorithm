package BinarySearchTree;

import com.sun.source.tree.Tree;

public class RangeSumOfBST {
    public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.leftChild = new TreeNode(5);
    root.rightChild = new TreeNode(15);
    root.leftChild.leftChild = new TreeNode(3);
    root.leftChild.rightChild = new TreeNode(7);
    root.rightChild.rightChild = new TreeNode(18);

    int low = 7;
    int high = 15;

    var res = RangeSumOfBST.rangeSumBST(root,low,high);
    System.out.println(res);

    }
    public static int sum = 0;
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;

        if(root.value >= low && root.value <= high)
            sum += root.value;
        rangeSumBST(root.leftChild , low, high) ;
        rangeSumBST(root.rightChild, low, high) ;

        return sum;
    }
}

