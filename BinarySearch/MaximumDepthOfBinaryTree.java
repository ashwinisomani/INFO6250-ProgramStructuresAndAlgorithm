package BinarySearch;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.leftChild = new Node(9);
        root.rightChild = new Node(20);
        root.rightChild.leftChild = new Node(15);
        root.rightChild.rightChild = new Node(7);

        var depth = new MaximumDepthOfBinaryTree();
        var result = depth.maxDepth(root);
        System.out.println(result);

    }

    public int maxDepth(Node root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(
                maxDepth(root.leftChild),
                maxDepth(root.rightChild));
    }
}
