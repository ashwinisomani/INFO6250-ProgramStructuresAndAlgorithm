package BinarySearchTree;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.leftChild = new TreeNode(1);
        root.rightChild = new TreeNode(3);

        var res = ValidateBinarySearchTree.isValidBST(root);
        System.out.println(res);

    }
    public  static boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static  boolean isValidBSTHelper(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.value <= min || root.value >= max) {
            return false;
        }
        boolean left = isValidBSTHelper(root.leftChild, min, root.value);
        boolean right = isValidBSTHelper(root.rightChild, root.value, max);
        return left && right;
    }
}

