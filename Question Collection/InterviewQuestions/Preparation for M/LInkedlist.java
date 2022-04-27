package Questions.Collection.Mthree;

public class LInkedlist {
        static Node head;
        static class Node {
            int val;
            Node next;
            Node(int node) {
                val = node;
                next = null;
            }
        }
        static Node reverse(Node node) {
            Node previous = null;
            Node curr = node;
            Node next = null;
            while (curr != null) {
                next = curr.next;
                curr.next = previous;
                previous = curr;
                curr = next;
            }
            node = previous;
            return node;
        }
        void printList(Node node) {
            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
        }
        public static Node reverse1(Node head) {
            Node pre = null;
            Node cur = head;
            while(cur!=null){
                Node next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;

            }
            head = pre;
            return head;
        }
        public static void main(String argvs[]){
            LInkedlist listObj = new LInkedlist();
            listObj.head = new Node(4);
            listObj.head.next = new Node(6);
            listObj.head.next.next = new Node(7);
            listObj.head.next.next.next = new Node(1);
            listObj.head.next.next.next.next = new Node(5);
            listObj.head.next.next.next.next.next = new Node(8);
            listObj.head.next.next.next.next.next.next = new Node(3);
            System.out.println("The Linked list before reversal is: ");
            listObj.printList(head);
            head = listObj.reverse1(head);
            System.out.println("\n");
            System.out.println("After reversal, the linked list is: ");
            listObj.printList(head);
        }
}
