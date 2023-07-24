package Heap.Easy;

import java.util.TreeMap;
import java.util.Collections;

class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        TreeMap<Integer, Integer> freqCount = new TreeMap<>(Collections.reverseOrder());

        for (int n : nums) {
            int currCount = freqCount.getOrDefault(n, 0);
            freqCount.put(n, currCount + 1);
        }

        for (int key : freqCount.keySet()) {
            k -= freqCount.get(key);
            if (k <= 0)
                return key;
        }

        return -1;
    }
}