class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for(int num : nums){
            int[] next= dp.clone();
            for(int r=0; r<3; r++) {
                if(dp[r] != Integer.MIN_VALUE) {
                    int newSum= dp[r] + num;
                    int newRem= newSum % 3;
                    next[newRem] = Math.max(next[newRem], newSum);
                }
            }
            dp= next;
        }
        return dp[0];



        
    }
}