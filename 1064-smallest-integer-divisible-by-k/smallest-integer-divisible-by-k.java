class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k% 5==0){
            return -1;
        }
        int remain=0;

        for(int len=1; len<=k ; len++){
            remain=(remain * 10 +1)%k;
            if(remain==0){
                return len;
            }
        }
        return -1;
        
    }
}