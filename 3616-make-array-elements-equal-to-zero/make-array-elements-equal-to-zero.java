class Solution {
    public int countValidSelections(int[] nums) {
        int n= nums.length;
        int total=0;
        for(int x: nums) total += x;

        int prefix=0;
        int ans= 0;

        for(int i=0; i<n; i++){
            if(nums[i]==0){
                int l= prefix;
                int R= total - prefix;
                int diff= Math.abs(l-R);

                if(diff==0) ans+= 2;
                else if(diff==1) ans+= 1;

                
            }
            prefix += nums[i];
        }
        return ans;




        
    }
}