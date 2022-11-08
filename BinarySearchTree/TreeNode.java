package BinarySearchTree;

public class TreeNode {

        public int value;
        public TreeNode leftChild;
        public TreeNode rightChild;

        public TreeNode() {
        }

        public TreeNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value ;
        }
    }


