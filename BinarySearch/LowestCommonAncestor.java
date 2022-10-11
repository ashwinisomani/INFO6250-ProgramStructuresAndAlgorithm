package BinarySearch;

//Solution --> 7

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.leftChild = new Node(5);
        root.rightChild = new Node(1);
        root.leftChild.leftChild = new Node(6);
        root.leftChild.rightChild = new Node(2);
        root.rightChild.leftChild = new Node(0);
        root.rightChild.rightChild = new Node(8);
        root.leftChild.rightChild.leftChild = new Node(7);
        root.leftChild.rightChild.rightChild = new Node(4);
        Node p = root.leftChild;
        Node q = root.rightChild;

        var ancestor = new LowestCommonAncestor();
        var result = ancestor.lowestCommonAncestor(root,p,q);
        System.out.println(result);
    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(p==null||q==null|| root==null)return root;
        if(p.value==root.value || q.value==root.value)return root;
        Node left  = lowestCommonAncestor(root.leftChild,p,q);
        Node right = lowestCommonAncestor(root.rightChild,p,q);
        if(left!=null && right!=null)return root;
        if(left ==null)return right;
        return left;
    }

}
