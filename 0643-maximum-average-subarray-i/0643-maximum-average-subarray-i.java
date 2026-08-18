class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k;
        int total = 0;
        for(int i = 0; i < k; i++)
            total += nums[i];
        int max = total;
        while(right < nums.length){
            total = total - nums[left] + nums[right];
            if(total > max)
                max = total;
            left++;
            right++;
        }
    return ((double)max)/k;
}
}