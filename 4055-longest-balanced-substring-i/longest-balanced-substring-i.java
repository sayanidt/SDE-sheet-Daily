class Solution {
    public int longestBalanced(String s) {
        int n= s.length();
        int ans= 0;
        for(int i=0; i<n; i++){
            int[] freq= new int[26];

            for(int j=i; j<n; j++){
                char ch= s.charAt(j);
                freq[ch-'a']++;

                if(isBalanced(freq)) {
                    ans=Math.max(ans, j-i + 1);
                }
            }
        }
        return ans;
        
    }
    private boolean isBalanced(int[] freq){
        int common=0;

        for(int f: freq){
            if(f>0){
                if(common==0){
                    common= f;
                }else if(f!= common){
                    return false;
                }
            }
        }
        return true;
    }
}