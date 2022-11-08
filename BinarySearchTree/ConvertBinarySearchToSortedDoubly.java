package BinarySearchTree;

public class ConvertBinarySearchToSortedDoubly {
    private static TreeNode lastNode;
    private static TreeNode head;

    public static void main(String[] args) {
    TreeNode root = new TreeNode(2);
    root.leftChild = new TreeNode(1);
    root.rightChild = new TreeNode(3);

    var res = ConvertBinarySearchToSortedDoubly.treeToDoublyList(root);
    System.out.println(res);

    }

    public static TreeNode treeToDoublyList(TreeNode root) {
        inorder(root);
        if(lastNode != null){
            lastNode.rightChild = head;
            head.leftChild = lastNode;
        }
        return head;
    }

    public static void inorder(TreeNode root){
        if(root == null) return ;
        inorder(root.leftChild);
        if(lastNode == null){
            lastNode = root;
            head = lastNode ;
        }
        else{
            lastNode.rightChild = root;
            root.leftChild = lastNode;
            lastNode = lastNode.rightChild;
        }
        inorder(root.rightChild);
    }
}