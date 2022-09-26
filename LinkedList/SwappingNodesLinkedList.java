package LinkedList;

public class SwappingNodesLinkedList {
    public static void main(String[] args) {

    Node head = new Node(7);
    head.next = new Node(9);
    head.next.next = new Node(6);
    head.next.next.next = new Node(6);
    head.next.next.next.next = new Node(7);
    head.next.next.next.next.next = new Node(8);
    head.next.next.next.next.next.next = new Node(3);
    head.next.next.next.next.next.next.next = new Node(0);
    head.next.next.next.next.next.next.next.next = new Node(9);
    head.next.next.next.next.next.next.next.next.next = new Node(5);

    int k = 5;

    var swap = new SwappingNodesLinkedList();
    var result = swap.swapNodes(head,k);
    System.out.println(result.toString());

    }
    public Node swapNodes(Node head, int k) {
        int len = 0;
        Node curr = head;
        while(curr!=null){
            curr = curr.next;
            len++;
        }

        Node first = head;
        for(int i=0;i<k-1;i++){
            first = first.next;
        }

        Node end = head;
        for(int i=0;i<len -k;i++)end = end.next;

        int temp = first.value;
        first.value = end.value;
        end.value = temp;
        return head;
    }
}

