class Solution {
    static final long MOD= 1_000_000_007L;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] q: queries) {
            int l= q[0], r=q[1], k=q[2];
            long v= q[3];
            for(int i=l; i<= r; i+=k){
                nums[i]= (int)((nums[i] * v)% MOD);
            }
        }
        int ans=0;
        for(int x: nums) ans^= x;
        return ans;
    }
}