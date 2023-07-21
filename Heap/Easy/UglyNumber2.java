package Heap.Easy;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

class UglyNumber2 {

    // Self solution - A better O(n) solution exists using dp
    public int nthUglyNumber(int n) {
        Queue<Long> visitQueue = new ArrayDeque<>();
        HashSet<Long> taken = new HashSet<>();
        PriorityQueue<Long> uglyNumber = new PriorityQueue<>(Collections.reverseOrder());
        visitQueue.add(1l);

        while (!visitQueue.isEmpty()) {
            long curr = visitQueue.poll();

            if (taken.contains(curr))
                continue;

            taken.add(curr);

            if (uglyNumber.size() == n) {
                if (uglyNumber.peek() > curr) {
                    uglyNumber.poll();
                } else continue;
            }

            uglyNumber.add(curr);
            if (curr * 2 > 0) visitQueue.add(curr * 2);
            if (curr * 3 > 0) visitQueue.add(curr * 3);
            if (curr * 5 > 0) visitQueue.add(curr * 5);
        }

        long res = uglyNumber.poll();

        return (int)res;

    }
}