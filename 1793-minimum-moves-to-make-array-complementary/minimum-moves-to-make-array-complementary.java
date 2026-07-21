class Solution {
    public int minMoves(int[] nums, int limit) {
        
        int n= nums.length;

        int pairs= n/2;
        int[] diff= new int[2* limit + 2];

        for(int i=0; i< pairs; i++){
            int a= nums[i];
            int b= nums[n-1-i];

            int x= Math.min(a, b);
            int y= Math.max(a, b);

            diff[x+1]--;
            diff[y+ limit + 1]++;

            diff[x+y]--;
            diff[x+y+1]++;

        }
        int ans= Integer.MAX_VALUE;
        int cur=0;

        for(int sum=2; sum<= 2*limit; sum++){
            cur+= diff[sum];
            ans= Math.min(ans, 2* pairs + cur);
        }
        return ans;

    }
}