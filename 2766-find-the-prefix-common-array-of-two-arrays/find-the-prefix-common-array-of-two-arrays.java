class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n= A.length;
        int[] ans= new int[n];

        boolean[] seenA= new boolean[n+1];
        boolean[] seenB= new boolean[n+1];

        for(int i=0; i<n; i++){
            seenA[A[i]]= true;
            seenB[B[i]]= true;

            int count=0;
            for(int num= 1; num<= n; num++){
                if(seenA[num] && seenB[num]) {
                    count++;
                }
            }
            ans[i]= count;
        }
        return ans;
        
    }
}