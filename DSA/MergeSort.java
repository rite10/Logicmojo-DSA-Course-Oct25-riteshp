class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MergeSort {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // 1. Split list into two halves
        ListNode mid = getMiddle(head);
        ListNode right = mid.next;
        mid.next = null;

        // 2. Sort left and right halves
        ListNode left = sortList(head);
        right = sortList(right);

        // 3. Merge sorted halves
        return merge(left, right);
    }

    // Find middle using slow and fast pointers
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}