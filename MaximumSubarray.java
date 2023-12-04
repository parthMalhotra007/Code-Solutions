public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int maxSoFar= Integer.MIN_VALUE;
        int currMax=0;

        for (int num : nums) {
            currMax = currMax + num;
            if (currMax > maxSoFar)
                maxSoFar = currMax;
            if (currMax < 0)
                currMax = 0;
        }

        return maxSoFar;
    }

}
