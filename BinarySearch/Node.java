package BinarySearch;

import java.util.List;
public class Node {

        public int value;
        public Node leftChild;
        public Node rightChild;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value ;
        }
    }

