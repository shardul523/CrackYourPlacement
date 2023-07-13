package LinkedList.Easy;

import LinkedList.ListNode;

public class LinkedListIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null;

        ListNode currA = headA;
        ListNode currB = headB;

        int countA = 0;
        int countB = 0;

        while (currA.next != null || currB.next != null) {
            if (currA.next != null) {
                countA++;
                currA = currA.next;
            }
            if (currB.next != null) {
                countB++;
                currB = currB.next;
            }
        }

        if (currA != currB) 
            return null;

        currA = headA;
        currB = headB;

        while (countA != countB) {
            if (countA < countB) {
                currB= currB.next;
                countB--;
            } else {
                currA = currA.next;
                countA--;
            }
        }

        while (currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }

        return currA;
    }
}
