package LinkedList;

public class RemoveLinkedListElement {
    public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(6);
    head.next.next.next = new Node(3);
    head.next.next.next.next = new Node(4);
    head.next.next.next.next.next = new Node(5);
    head.next.next.next.next.next.next = new Node(6);

    int val = 6;

    var remove = new RemoveLinkedListElement();
    var result = remove.removeElements(head, val);
        System.out.println(result.toString());
    }

    public Node removeElements(Node head, int val) {
        if (head == null) return null;
        Node curr = head;
        while(curr!= null && curr.next!=null ){
            if(curr.next.value == val){
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return head.value ==val?head.next:head;
    }

}

