public class LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = linkedList.reverse(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

    }
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static Node reverse(Node n) {
        Node prev = null;
        Node curr = n;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        n = prev;
        return n;
    }
}
