class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int sortedLength = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) continue;
            nums[sortedLength++] = nums[i];
        }

        nums[sortedLength++] = nums[nums.length - 1];

        return sortedLength;
    }
}