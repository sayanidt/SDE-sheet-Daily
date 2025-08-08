class Solution {
    public int maximumWealth(int[][] accounts) {
        
        
        int maxwealth=0;int m; int n;
        
       
         
        for(int i=0; i<accounts.length; i++){
            int curwealth=0;
            for(int j=0; j<accounts[i].length; j++){
                
                    curwealth+= accounts[i][j];
                }
                
                    maxwealth= Math.max(maxwealth,curwealth);
                }
                return maxwealth;
                    
                
            
        
    
  
}
}
