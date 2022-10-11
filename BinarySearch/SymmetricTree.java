package BinarySearch;

public class SymmetricTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(2);
        root.leftChild.leftChild = new Node(3);
        root.leftChild.rightChild = new Node(4);
        root.rightChild.leftChild = new Node(4);
        root.rightChild.rightChild = new Node(3);

        var same = new SymmetricTree();
        var result = same.isSymmetric(root);
        System.out.println(result);
    }

    public boolean isSymmetric(Node root){
        if(root==null)return true;
        return helper(root.leftChild,root.rightChild);
    }
    public boolean helper(Node left,Node right){
        if(left==null && right==null)return true;
        if(left==null || right==null)return false;
        return left.value==right.value && helper(left.leftChild,right.rightChild) && helper(left.rightChild,right.leftChild);
    }
}
