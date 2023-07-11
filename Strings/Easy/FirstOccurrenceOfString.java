public class FirstOccurrenceOfString {
    int[] longestPrefixSuffix(String s) {
        int length = s.length();
        int[] table = new int[length];
        int j = 0;

        for (int i = 1; i < length; i++) {
            while (j >= 0 && s.charAt(i) != s.charAt(j)) {
                if (j > 0)
                    j = table[j - 1];
                else
                    j = -1;
            }

            table[i] = ++j;
        }

        return table;
    }

    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int index = -1;
        int j = 0;

        if (m == 0)
            return 0;
        if (n < m)
            return index;

        int[] lps = longestPrefixSuffix(needle);

        for (int i : lps)
            System.out.print(i);

        System.out.println();

        for (int i = 0; i < n; i++) {
            while (j >= 0 && haystack.charAt(i) != needle.charAt(j)) {
                if (j >= 0)
                    j = lps[j - 1];
                else
                    j = -1;
            }

            j++;

            if (j == m) {
                index = i - m + 1;
                break;
            }

        }

        return index;
    }
}