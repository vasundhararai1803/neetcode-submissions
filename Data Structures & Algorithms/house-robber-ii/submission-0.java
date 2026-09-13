class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n==1) return nums[0];

        int prev2 = 0;
        int prev1 = 0;

        //case 1 dont take 1st house
        for(int i=1; i<n; i++){

            int skip = prev1;
            int take = prev2 + nums[i];
            int curr = Math.max(skip, take);

            prev2 = prev1;
            prev1 = curr;
        }
        int case1 = prev1;
        
        prev2 = 0;
        prev1 = 0;
        //case 2 take first house
        for(int i=0; i<n-1; i++){

            int skip = prev1;
            int take = prev2 + nums[i];
            int curr = Math.max(skip, take);

            prev2 = prev1;
            prev1 = curr;
        }
        int case2 = prev1;

        return Math.max(case1, case2);
    }
}
