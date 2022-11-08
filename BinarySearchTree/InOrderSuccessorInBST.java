package BinarySearchTree;

public class InOrderSuccessorInBST {
    public static void main(String[] args) {

    TreeNode root = new TreeNode(2);
    root.leftChild = new TreeNode(1);
    root.rightChild = new TreeNode(3);

    TreeNode p = new TreeNode(1);


    var res = InOrderSuccessorInBST.inorderSuccessor(root, p);
   System.out.println(res);

    }
    public  static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor = null;

        while (root != null) {

            if (p.value >= root.value) {
                root = root.rightChild;
            } else {
                successor = root;
                root = root.leftChild;
            }
        }

        return successor;
    }
}

