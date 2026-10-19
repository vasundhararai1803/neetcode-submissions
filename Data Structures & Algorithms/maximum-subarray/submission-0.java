class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int right=0; right<n; right++){
            sum += nums[right];
            max = Math.max(max, sum);

            if(sum < 0){
                sum = 0;
                left = right + 1;
            }
        }
        return max;
    }
}
