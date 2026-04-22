class Solution {
    public int maxDistance(int[] colors) {
        int n= colors.length;

        int maxd=0;

        for(int i=n-1; i>=0; i--){
            if(colors[i] != colors[0]){
                maxd= Math.max(maxd, i-0);
            }
        }
        for(int i=0; i<n; i++){
            if(colors[i] != colors[n-1]){
                maxd=Math.max(maxd, (n-1)-i);
                break;
            }
        }
        return maxd;
        
    }
}