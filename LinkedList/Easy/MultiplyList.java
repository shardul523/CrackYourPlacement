package LinkedList.Easy;

import LinkedList.ListNode;

class MultiplyList {

    int MOD = 1000000007;

    long getNumber(ListNode l1) {
        ListNode curr = l1;
        long num = 0;

        while (curr != null) {
            num *= 10;
            num += curr.val;
            num %= MOD;
            curr = curr.next;
        }

        return num;
    }

    public long multiplyTwoLists(ListNode l1, ListNode l2) {
        long num1 = getNumber(l1);
        long num2 = getNumber(l2);

        return (num1 * num2) % MOD;
    }
}