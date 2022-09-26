package LinkedList;

public class SplitLinkedListInParts {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        int k = 5;

        var splitLinkedListInParts = new SplitLinkedListInParts();
        Node[] result = splitLinkedListInParts.splitListToParts(head,k);
        splitLinkedListInParts.printResult(result);
    }

        public Node[] splitListToParts(Node root, int k) {
            Node cur = root;
            int N = 0;
            while (cur != null) {
                cur = cur.next;
                N++;
            }

            int width = N / k, rem = N % k;

           Node[] ans = new Node[k];
            cur = root;
            for (int i = 0; i < k; ++i) {
              Node head = cur;
                for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; ++j) {
                    if (cur != null) cur = cur.next;
                }
                if (cur != null) {
                    Node prev = cur;
                    cur = cur.next;
                    prev.next = null;
                }
                ans[i] = head;
            }
            return ans;
        }
        public void printResult(Node [] result){
        for(int i =0;i < result.length;i++){
            if(result[i]!=null){
                System.out.print("["+ result[i].value+"]");
            }else{
                System.out.print("[]");
            }
            if(i!=result.length-1) System.out.print(",");
        }

        }
    }

