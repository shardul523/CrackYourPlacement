package DP.Easy;

class OnesAndZeros {
    int[][][] dp;

    int[] getMN(String str) {
        int[] count = new int[2];

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '0')
                count[0]++;
            else
                count[1]++;
        }

        return count;
    }

    int findSubset(String[] s, int i, int currM, int currN) {
        if (s.length == i)
            return 0;
        if (dp[i][currM][currN] != -1)
            return dp[i][currM][currN];

        int[] count = getMN(s[i]);

        dp[i][currM][currN] = findSubset(s, i + 1, currM, currN);

        if (currM - count[0] >= 0 && currN - count[1] >= 0)
            dp[i][currM][currN] = Math.max(dp[i][currM][currN],
                    1 + findSubset(s, i + 1, currM - count[0], currN - count[1]));

        return dp[i][currM][currN];
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int length = strs.length;
        dp = new int[length][m + 1][n + 1];

        for (int i = 0; i < length; i++)
            for (int j = 0; j <= m; j++)
                for (int k = 0; k <= n; k++)
                    dp[i][j][k] = -1;

        return findSubset(strs, 0, m, n);
    }
}