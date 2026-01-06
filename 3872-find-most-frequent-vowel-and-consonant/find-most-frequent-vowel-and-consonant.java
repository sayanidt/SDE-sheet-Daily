class Solution {
    public int maxFreqSum(String s) {
        int[] freq= new int[26];

        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        int fv=0;
        int fc=0;
        for(int i=0; i<26; i++){
            char ch= (char)('a'+ i);
               if(isVowel(ch)){
                fv=Math.max(fv, freq[i]);
               }else{
                fc= Math.max(fc, freq[i]);
               }
        }
       
        return fc+fv;
        
    }
    private boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u';
    }
}