package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);
        root.leftChild.rightChild = new Node(5);
        root.rightChild.rightChild = new Node(4);

        var view = new BinaryTreeRightSideView();
        var result = view.rightSideView(root);
        System.out.println(result);
    }
    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(Node root) {
        if(root ==null)return res;
        helper(root,0);
        return res;
    }
    public void helper(Node root, int depth){
        if(res.size()<=depth){
            res.add(root.value);
        }
        if(root.rightChild!=null)helper(root.rightChild,depth+1);
        if(root.leftChild!=null)helper(root.leftChild,depth+1);
    }
}
