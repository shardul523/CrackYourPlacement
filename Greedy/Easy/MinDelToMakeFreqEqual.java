package Greedy.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class MinDelToMakeFreqEqual {
    public int minDeletions(String s) {
        int freq[] = new int[26];
        int deletions = 0;
        HashSet<Integer> taken = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            ++freq[curr - 'a'];
        }

        Arrays.sort(freq);

        for (int f : freq) {
            int curr = f;
            // System.out.println("Frequency " + f);

            while (taken.contains(curr) && curr > 0)
                curr--;

            // System.out.println("Inserted at " + curr);
            deletions += f - curr;

            taken.add(curr);
        }

        return deletions;
    }
}
