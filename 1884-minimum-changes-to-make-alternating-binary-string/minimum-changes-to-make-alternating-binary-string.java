class Solution {
    public int minOperations(String s) {
        int count0= 0;
        int count1 =0;

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);

            if(i%2==0){
                if(ch != '0') count0++;
                if (ch != '1') count1++;
            }else{
                if(ch != '1') count0++;
                if(ch != '0') count1++;
            }
        }
        return Math.min(count0, count1);
        
    }
}