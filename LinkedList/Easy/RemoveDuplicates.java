package LinkedList.Easy;

import LinkedList.ListNode;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode temp = head;
        
        while (head != null) {
            ListNode curr = head.next;
            while (curr != null && curr.val == head.val) 
                curr = curr.next;
            head.next = curr;
            head = head.next;
        }

        head = temp;

        return head;
    }
}
