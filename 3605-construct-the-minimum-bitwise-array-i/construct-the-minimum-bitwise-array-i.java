class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n= nums.size();
        int[] ans= new int[n];

        for(int i=0; i<n; i++){
            int num= nums.get(i);

            if(num==2){
                ans[i]= -1;
                continue;

            }
            int x= num;
            int bit=0;

            while(((num >> bit) & 1)==1){
                bit++;
            }
            x= num ^ (1<<(bit -1));
            ans[i]= x;
        }
        return ans;


        
        
    }
}