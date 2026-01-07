class Solution {
    public int[] plusOne(int[] digits) {
        int n= digits.length;
        int[] newa= new int[n];
        for(int i=0; i<n; i++){
            newa[i]= digits[i];
        }
            for(int i=n-1; i>=0; i--){
                newa[i]++;

                if(newa[i]<10){
                    return newa;
                }
                newa[i]=0;
            
            }
            int[] result= new int[n+1];
            result[0]=1;
            return result;

        
    }
}