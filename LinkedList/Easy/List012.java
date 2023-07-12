package LinkedList.Easy;

import LinkedList.ListNode;

public class List012 {
    public ListNode sort012(ListNode head) {
        ListNode[] lists = new ListNode[3];
        ListNode[] heads = new ListNode[3];

        for (int i = 0; i < 3; i++) {
            lists[i] = new ListNode();
            heads[i] = lists[i];
        }

        while (head != null) {
            lists[head.val].next = head;
            lists[head.val] = head;
            head = head.next;
        }

        for (int i = 2; i > 0; i--) 
            lists[i - 1].next = heads[i].next;
        
        lists[2].next = null;
        
        return heads[0].next;
    }
}
