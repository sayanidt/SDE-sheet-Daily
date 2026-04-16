class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result= new ArrayList<>();
        int r=0;
        for(int num: nums){
            r= (r*2 + num)% 5;
            result.add(r==0);
         }

         return result;

        
    }
}