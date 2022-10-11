package BinarySearch;

//Solution --> 5

import java.util.*;

public class BinaryTreeVerticalOrderTraversal {
    public static void main(String[] args) {

        Node root = new Node(3);
        root.leftChild = new Node(9);
        root.rightChild = new Node(20);
        root.rightChild.leftChild = new Node(15);
        root.rightChild.rightChild = new Node(7);
        var vertical = new BinaryTreeVerticalOrderTraversal();
        var result = vertical.verticalOrder(root);
        System.out.println(result);
    }


    class NodeWithCol{
        Node node;
        int col;
        public NodeWithCol(Node node,int col){
            this.node = node;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalOrder(Node root) {
        List<List<Integer>> res = new ArrayList();
        if (root == null) return res;
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<NodeWithCol> q= new LinkedList<NodeWithCol >();
        q.offer(new NodeWithCol(root,0));
        while(!q.isEmpty()){
            int size= q.size();
            for(int i=0;i<size;i++){
                NodeWithCol node = q.poll();
                Node treenode = node.node;
                int col = node.col;

                List<Integer> list = map.getOrDefault(col,new ArrayList<Integer>());
                list.add(treenode.value);
                map.put(col,list);

                if(treenode.leftChild!=null){
                    q.offer(new NodeWithCol(treenode.leftChild,col-1));
                }
                if(treenode.rightChild!=null){
                    q.offer(new NodeWithCol(treenode.rightChild,col+1));
                }

            }
        }
        for(List<Integer> list: map.values()){
            res.add(list);
        }

        return res;
    }
}