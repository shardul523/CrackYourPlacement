package Heap.Easy;

import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;

class Element {
    int data;
    int count;

    Element() {
        data = 0;
        data = 0;
    }  

    Element(int d, int c) {
        data = d;
        count = c;
    }
}

class ElementComparator implements Comparator<Element> {
    @Override
    public int compare(Element e1, Element e2) {
        return e1.count - e2.count;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqCount = new HashMap<>();
        PriorityQueue<Element> mostFrequent = new PriorityQueue<>(new ElementComparator());
        int[] res = new int[k];

        for (int num: nums) {
            int currCount = freqCount.getOrDefault(num, 0);
            freqCount.put(num, currCount + 1);
        }

        for (Map.Entry<Integer, Integer> e: freqCount.entrySet()) {
            int data = e.getKey();
            int count = e.getValue();
            Element newElement = new Element(data, count);

            if (mostFrequent.size() < k)
                mostFrequent.add(newElement);
            else if (mostFrequent.peek().count < newElement.count) {
                mostFrequent.add(newElement);
                mostFrequent.poll();
            }
        }

        while (k > 0) 
            res[--k] = mostFrequent.poll().data;
         
        return res;
    }
}