package LinkedList;

public class RotateList {
    public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    int k = 2;
    var rotate = new RotateList();
    var result = rotate.rotateRightSolution(head , k );
    System.out.println(result.toString());
    }

    public Node rotateRightSolution(Node head, int k) {
        if (head==null||head.next==null) return head;
        Node dummy = new Node(0);
        dummy.next=head;
        Node fast = dummy, slow=dummy;

        int i;
        for (i=0;fast.next!=null;i++)           //Get the total length
            fast=fast.next;

        for (int j=i-k%i;j>0;j--)               //Get the i-n%i th node
            slow=slow.next;

        fast.next=dummy.next;                   //Do the rotation
        dummy.next=slow.next;
        slow.next=null;

        return dummy.next;
    }
}

