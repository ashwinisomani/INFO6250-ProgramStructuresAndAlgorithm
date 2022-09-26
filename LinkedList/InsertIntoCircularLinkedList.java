package LinkedList;

public class InsertIntoCircularLinkedList {
    public static void main(String[] args) {
    Node head = new Node(3);
    Node temp = head;
    head.next = new Node(4);
    head.next.next = new Node(1);
    head.next.next.next = temp;

    int insertVal = 2;

    var insert = new InsertIntoCircularLinkedList();
    var result = insert.insertInLinkedList(head, insertVal);
    var tempHead = result;
        System.out.print("[");
    do{
        System.out.print(result.value);
        if(result.next!=tempHead) System.out.print(",");
        result= result.next;
    }while(result!=tempHead);
        System.out.print("]");
    }

    public Node insertInLinkedList(Node head, int insertVal) {
            if(head == null){
                head = new Node(insertVal);
                head.next = head;
                return head;
            }

            Node curr = head;

            while(curr.next != head){

                if(curr.value <=  curr.next.value){
                    if(insertVal >= curr.value && insertVal <= curr.next.value) break;
                }else{
                    if(insertVal  >= curr.value || insertVal <= curr.next.value) break;
                }
                curr = curr.next;
            }

            Node temp = curr.next;
            curr.next = new Node(insertVal, temp);

            return head;
        }
    }




