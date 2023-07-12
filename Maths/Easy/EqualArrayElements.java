package Maths.Easy;

class EqualArrayElements {
    public int minMoves(int[] nums) {
        int minElement = Integer.MAX_VALUE;
        int countMoves = 0;

        for (int n: nums)
            if (minElement > n) minElement = n;
        
        for (int n: nums)
            countMoves += n - minElement;
        
        return countMoves;
    }
}