package Greedy.Easy;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

class CharFreq {
    char ch;
    int count;

    CharFreq(char c, int f) {
        ch = c;
        count = f;
    }
}

class CharFreqComp implements Comparator<CharFreq> {
    @Override
    public int compare(CharFreq a, CharFreq b) {
        return b.count - a.count;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        PriorityQueue<CharFreq> mostFrequent = new PriorityQueue<>(new CharFreqComp());
        int interval = 0;
        int slots = n + 1;
        int maxCount = 1, maxCountFreq = 0;

        for (int i = 0; i < tasks.length; i++) {
            int currCount = charCount.getOrDefault(tasks[i], 0);
            charCount.put(tasks[i], currCount + 1);
        }

        for (char key : charCount.keySet())
            mostFrequent.add(new CharFreq(key, charCount.get(key)));

        while (mostFrequent.size() >= slots) {
            ArrayList<CharFreq> done = new ArrayList<>();
            for (int i = 0; i < slots; i++) {
                CharFreq curr = mostFrequent.poll();
                // System.out.println(curr.ch + " with count " + curr.count);
                curr.count--;
                if (curr.count > 0)
                    done.add(curr);
            }
            mostFrequent.addAll(done);
            interval += slots;
        }

        while (!mostFrequent.isEmpty()) {
            CharFreq curr = mostFrequent.poll();
            if (curr.count > maxCount) {
                maxCount = curr.count;
                maxCountFreq = 1;
            } else if (curr.count == maxCount) {
                maxCountFreq++;
            }
        }

        interval += (maxCount - 1) * (slots) + maxCountFreq;

        return interval;
    }
}