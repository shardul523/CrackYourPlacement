package LinkedList.Easy;

import LinkedList.ListNode;

class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null)
            return true;

        ListNode curr = null;
        ListNode prev = null;
        ListNode middle = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            if (curr != null)
                curr.next = prev;
            prev = curr;
            curr = middle;
            middle = middle.next;
            fast = fast.next.next;
        }

        curr.next = prev;

        if (fast != null)
            middle = middle.next;

        while (middle != null) {
            if (middle.val != curr.val)
                return false;
            middle = middle.next;
            curr = curr.next;
        }

        return true;
    }
}