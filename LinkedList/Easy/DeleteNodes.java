package LinkedList.Easy;

import java.util.ArrayDeque;
import java.util.Deque;

import LinkedList.ListNode;

public class DeleteNodes {
    ListNode compute(ListNode head)
    {
        Deque<ListNode> stack = new ArrayDeque<>();
        
        while (head != null) {
            while (!stack.isEmpty() && stack.getLast().val < head.val)
                stack.removeLast();
            stack.addLast(head);
            head = head.next;
        }
        
        ListNode prev = stack.pollFirst();
        head = prev;
        
        while (!stack.isEmpty()) {
            ListNode curr = stack.pollFirst();
            prev.next = curr;
            prev = curr;
        }
        
        prev.next = null;
        
        return head;
    }
}
