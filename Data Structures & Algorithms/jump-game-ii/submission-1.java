class Solution {
    public int jump(int[] nums) {
        int farthest = 0;
        int currEnd = 0;
        int count =0;
        int j=0;
        int n = nums.length;
        
        for(int i=0; i<n-1; i++){
            
            farthest = Math.max(farthest, i+nums[i]);
            if(i == currEnd){
                j++;
                currEnd = farthest;
            }
        }
        return j;
    }
}
