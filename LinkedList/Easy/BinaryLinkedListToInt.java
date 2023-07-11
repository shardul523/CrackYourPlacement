package LinkedList.Easy;

import LinkedList.ListNode;

public class BinaryLinkedListToInt {
    public int getDecimalValue(ListNode head) {
        int decimalNum = 0;

        while (head != null) {
            decimalNum *= 2;
            decimalNum += head.val;
            head = head.next;
        }

        return decimalNum;
    }
}
