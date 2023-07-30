package Greedy.Easy;

import java.util.PriorityQueue;

public class MinSumFormedByDigits {
    public static long minSum(int arr[], int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long num1 = 0, num2 = 0;
        boolean num1Turn = true;

        for (int d : arr)
            minHeap.add(d);

        while (!minHeap.isEmpty()) {
            int currDigit = minHeap.poll();

            if (num1Turn)
                num1 = num1 * 10 + currDigit;
            else
                num2 = num2 * 10 + currDigit;

            num1Turn = !num1Turn;
        }

        return num1 + num2;
    }
}
