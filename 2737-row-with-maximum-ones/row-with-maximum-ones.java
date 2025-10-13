class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCount=0;
        int maxRowIndex=0;

        for(int i=0; i<mat.length; i++){
            int currentCount=0;

            for(int j=0; j<mat[i].length; j++){
                 currentCount += mat[i][j];

            }
            if(currentCount>maxCount){
                maxCount = currentCount;
                maxRowIndex=i;
            }
        }
        return new int[]{maxRowIndex, maxCount};
        
    }
}