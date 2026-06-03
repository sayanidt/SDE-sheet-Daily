class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans= new int[nums.size()];

        for(int i=0; i< nums.size(); i++) {
            int p= nums.get(i);
            if(p==2) {
                ans[i]=-1;
                continue;
            }
            int t=0;
            while(((p >> t) & 1) ==1){
            t++;
        }

           ans[i]= p-(1<< (t-1));
        }
        return ans;
        
    }
}