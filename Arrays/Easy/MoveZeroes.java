class MoveZeroes {

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        
        int nonZeroPointer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            swap(nums, i, nonZeroPointer);
            nonZeroPointer++;
        }
    }
}