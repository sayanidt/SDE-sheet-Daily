class Solution {
    public int repeatedNTimes(int[] nums) {
        Random rand= new Random();
        int n= nums.length;

        while(true) {
            int i= rand.nextInt(n);
            int j= rand.nextInt(n);

            if(i!=j && nums[i]== nums[j]){
                return nums[i];
            }
        }

        
    }
}