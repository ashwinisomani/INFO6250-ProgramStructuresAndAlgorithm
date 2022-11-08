package BinarySearchTree;

import java.util.Stack;

public class BSTIterator {
    public static Stack<TreeNode> stack =  null ;
    public static TreeNode current = null ;

    public static void main(String[] args) {
    TreeNode root = new TreeNode(7);
    root.leftChild = new TreeNode(3);
    root.rightChild= new TreeNode(15);
    root.rightChild.leftChild = new TreeNode(9);
    root.rightChild.rightChild = new TreeNode(20);

    }

    public BSTIterator(TreeNode root) {
        current = root;
        stack = new Stack<> ();
    }

    public static boolean hasNext() {
        return !stack.isEmpty() || current != null;
    }
    public static int next() {
        while (current != null) {
            stack.push(current);
            current = current.leftChild ;
        }
        TreeNode t = stack.pop() ;
        current = t.rightChild ;
        return t.value ;
    }
}

