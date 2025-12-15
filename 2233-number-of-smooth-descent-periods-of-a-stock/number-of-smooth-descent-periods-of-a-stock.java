class Solution {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long count=1;
        long ans=1;
        for(int i=1; i<n; i++){
            

            if(prices[i]== prices[i-1]-1){
                count++;
                

             }else{
                count=1;
             }
             ans+= count;
             


        }
        return ans;
    }



        
    
}