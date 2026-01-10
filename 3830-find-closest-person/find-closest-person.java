class Solution {
    public int findClosest(int x, int y, int z) {
        int first=0;
        int dist1= Math.abs(z-x);
        int dist2= Math.abs(z-y);

        if(dist1>dist2){
             first= 2;
        }else if(dist2>dist1){
             first=1;
        }else{
             first=0;
        }
        
        return first;

    }
}