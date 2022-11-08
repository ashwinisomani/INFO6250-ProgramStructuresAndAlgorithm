package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class RecoverBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.leftChild = new TreeNode(3);
        root.leftChild.rightChild = new TreeNode(2);

        RecoverBinarySearchTree.recoverTree(root);

    }

    public static void recoverTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraverse(root,res);
        int[] swapNums = findSwapNums(res);
        recover(root,2,swapNums[0],swapNums[1]);

    }
    public static void inorderTraverse(TreeNode root, List<Integer> res){
        if(root==null)return ;
        inorderTraverse(root.leftChild,res);
        res.add(root.value);
        inorderTraverse(root.rightChild,res);
    }
    public static int[] findSwapNums(List<Integer> res){
        int n = res.size();
        int x= -1;
        int y =-1;
        boolean swap_First = false;
        for(int i =0;i<n-1;i++){
            if(res.get(i+1)<res.get(i)){
                y = res.get(i+1);
                if(!swap_First){
                    x =res.get(i);
                    swap_First = true;
                }else{
                    break;
                }
            }
        }
        return new int[]{x,y};
    }
    public static void recover(TreeNode root, int count, int x, int y){
        if(root!=null){
            if(root.value==x || root.value==y){
                root.value = root.value ==x?y:x;
                if(count--==0)return;
            }
            recover(root.leftChild,count,x,y);
            recover(root.rightChild,count,x,y);
        }
    }
}

