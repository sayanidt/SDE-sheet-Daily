class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totala= 0;
        for(int a: apple){
            totala+= a;
        }
        Arrays.sort(capacity);
        int usedcap=0;
        int boxcnt=0;

        for(int i= capacity.length-1; i>=0; i--){
            usedcap+= capacity[i];
            boxcnt++;
            if(usedcap>= totala){
                return boxcnt;
            }
        }
        return boxcnt;

        
    }
}