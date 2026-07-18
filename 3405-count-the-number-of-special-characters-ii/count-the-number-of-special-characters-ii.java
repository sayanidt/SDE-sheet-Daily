class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lastl= new int[26];
        int[] firstu= new int[26];

        for(int i=0; i< 26; i++){
            lastl[i]= -1;
            firstu[i]= Integer.MAX_VALUE;

        }
        for(int i=0; i<word.length(); i++){
            char ch= word.charAt(i);

            if(Character.isLowerCase(ch)){
                lastl[ch-'a']=i;
            }else{
                firstu[ch-'A']=Math.min(firstu[ch-'A'], i);
            }
        }
        int count=0;

        for(int i=0; i<26; i++){
            if(lastl[i] != -1 && firstu[i] != Integer.MAX_VALUE && lastl[i] < firstu[i]){
                count++;
            }
        }
        return count;

        
    }
}