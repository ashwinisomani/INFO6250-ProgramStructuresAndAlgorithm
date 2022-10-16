package Quiz1;

import BinarySearch.Node;

public class SymmetricTree {
    public static void main(String[] args) {
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);

    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    q.right = new TreeNode(3);


    var same = new SymmetricTree();
    Boolean result = same.isSameTree(p,q);
    System.out.println(result);

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p==null|| q==null)return false;
        return (p.value == q.value) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}


