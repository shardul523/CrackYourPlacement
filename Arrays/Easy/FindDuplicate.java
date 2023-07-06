public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int[] bitCount = new int[32];
        int duplicate = 0;

        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) == 0)
                    continue;
                bitCount[i]++;
            }
        }

        for (int j = 1; j < nums.length; j++) {
            for (int i = 0; i < 32; i++) {
                if ((j & (1 << i)) == 0)
                    continue;
                bitCount[i]--;
            }
        }

        for (int i = 0; i < 32; i++)
            if (bitCount[i] > 0)
                duplicate += 1 << i;

        return duplicate;
    }
}