class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);

        int n= nums.length;
        int []values= new int[n];
        int []freq= new int[n];
        boolean[] used= new boolean[n];

        int idx=0;
        values[0]= nums[0];
        freq[0]=1;

        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]){
                freq[idx]++;
            }else{
                idx++;
                values[idx]= nums[i];
                freq[idx]=1;
            }
        }
        int[] result= new int[k];
        for(int i=0; i<k; i++){
            int maxIndex=-1;
            
            for(int j=0; j<=idx; j++){
                if(!used[j]){
                    maxIndex=j;
                    break;
                }
                }
                for(int j=0; j<=idx; j++){
                if(!used[j] && freq[j] >freq[ maxIndex]){
                    
                    maxIndex=j;
                }
            }
            result[i]= values[maxIndex];
            used[maxIndex]= true;
        }
        return result;

        
    }
}