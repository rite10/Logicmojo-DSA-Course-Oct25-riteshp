class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

}

public class ReversedLinkList {
    Node head;

    public static void main(String[] args) {
        ReversedLinkList rl = new ReversedLinkList();

        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        Node reverseNode = rl.reverseLinkList(a);
        rl.display(reverseNode);
    }

    public Node reverseLinkList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public void display(Node head) {
        while (head != null) {
            System.out.println(head.val + " ");
            head = head.next;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

}
