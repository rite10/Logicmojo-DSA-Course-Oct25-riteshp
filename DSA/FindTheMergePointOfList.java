import java.util.Scanner;

class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class FindTheMergePointOfList {

    public static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static Node findTheMergePoints(Node headA, Node headB) {

        if (headA == null || headB == null) {
            return null;
        }

        // get the length of the both node
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }

        while (lenB > lenA) {
            lenB--;
            headB = headB.next;
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        // while (headA != null && headB != null) {
        // if (headA == headB)
        // return headA;
        // headA = headA.next;
        // headB = headB.next;
        // }

        return headA;
    }

    static Node readList(Scanner sc, int count) {
        Node head = null, tail = null;

        for (int i = 0; i < count; i++) {

            if (!sc.hasNextInt()) {
                // input ended unexpectedly
                break;
            }

            int value = sc.nextInt();
            Node node = new Node(value);

            if (head == null)
                head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt())
            return;
        int index = sc.nextInt();

        // A list
        if (!sc.hasNextInt())
            return;
        int sizeA = sc.nextInt();
        Node headA = readList(sc, sizeA);

        // B list
        if (!sc.hasNextInt())
            return;
        int sizeB = sc.nextInt();
        Node headB = readList(sc, sizeB);

        // common list
        if (!sc.hasNextInt())
            return;
        int sizeCommon = sc.nextInt();
        Node common = readList(sc, sizeCommon);

        // ----- Attach common to A -----
        if (headA == null) {
            headA = common;
        } else {
            Node temp = headA;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                temp.next = common;
            }
        }

        // ----- Attach common to B -----
        if (headB == null) {
            headB = common;
        } else {
            Node temp = headB;
            while (temp.next != null)
                temp = temp.next;
            temp.next = common;
        }

        // ----- Find Merge Point -----
        Node merge0 = findTheMergePoints(headA, headB);

        if (merge0 == null) {
            System.out.println("No merge");
        } else {
            System.out.println(merge0.val);
        }

    }

}
