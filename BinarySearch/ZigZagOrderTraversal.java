package BinarySearch;

import java.util.*;

public class ZigZagOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.leftChild = new Node(9);
        root.rightChild = new Node(20);
        root.rightChild.leftChild = new Node(15);
        root.rightChild.rightChild = new Node(7);

        var order = new ZigZagOrderTraversal();
        var result = order.zigzagLevelOrder(root);
        System.out.println(result);
    }

    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>>result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null)return result;
        q.add(root);
        while(!q.isEmpty()){
            int size =q.size();
            List<Integer>res = new ArrayList<>();
            for(int i=0;i<size;i++){
                res.add(q.peek().value);
                Node p = q.remove();
                if(p.leftChild!=null)q.add(p.leftChild);
                if(p.rightChild!=null)q.add(p.rightChild);
            }
            if(result.size()%2!=0) Collections.reverse(res);
            result.add(res);
        }
        return result;
    }

}
