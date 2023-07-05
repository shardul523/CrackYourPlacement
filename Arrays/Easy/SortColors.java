public class SortColors {
    public void sortColors(int[] nums) {
        
        int redRegion = 0;
        int whiteRegion = 0;
        int blueRegion = nums.length - 1;

        while (whiteRegion <= blueRegion) {
            if (nums[whiteRegion] == 0) {
                nums[whiteRegion++] = nums[redRegion];
                nums[redRegion++] = 0;
            } else if (nums[whiteRegion] == 2) {
                nums[whiteRegion] = nums[blueRegion];
                nums[blueRegion--] = 2;
            } else 
                whiteRegion++;
        }
    }    
}
