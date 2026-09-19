class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;

        int[] maxDP = new int[n];
        int[] minDP = new int[n];

        maxDP[0] = nums[0];
        minDP[0] = nums[0];

        int ans = nums[0];

        for (int i = 1; i < n; i++) {

            maxDP[i] = Math.max(
                nums[i],
                Math.max(
                    nums[i] * maxDP[i - 1],
                    nums[i] * minDP[i - 1]
                )
            );

            minDP[i] = Math.min(
                nums[i],
                Math.min(
                    nums[i] * maxDP[i - 1],
                    nums[i] * minDP[i - 1]
                )
            );

            ans = Math.max(ans, maxDP[i]);
        }

        return ans;
    }
}