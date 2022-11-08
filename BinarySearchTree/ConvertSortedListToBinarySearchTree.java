package BinarySearchTree;

public class ConvertSortedListToBinarySearchTree {
    public static void main(String[] args) {
    ListNode node = new ListNode(-10);
    node.next = new ListNode(-3);
    node.next.next = new ListNode(0);
    node.next.next.next = new ListNode(5);
    node.next.next.next.next = new ListNode(9);

    TreeNode res = ConvertSortedListToBinarySearchTree.sortedListToBST(node);
    System.out.println(res);


    }

    public static TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return toBST(head,null);
    }
    public static TreeNode toBST(ListNode head, ListNode tail){
        ListNode slow = head;
        ListNode fast = head;
        if(head==tail) return null;
        // we are finding the middle value from this
        while(fast!=tail&&fast.next!=tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        //creating the TreeNode
        TreeNode thead = new TreeNode(slow.value);
        thead.leftChild = toBST(head,slow);
        thead.rightChild = toBST(slow.next,tail);
        return thead;
    }
}
