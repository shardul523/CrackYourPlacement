package LinkedList.Easy;

import LinkedList.ListNode;

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = null;

        while (head != null) {
            curr = head;
            head = head.next;
            curr.next = prev;
            prev = curr;
        }

        return curr;
    }
}