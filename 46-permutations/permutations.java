class Solution {
    private void backtrack(int[] nums, boolean[] used,List<List<Integer>> result, List<Integer> ds){
        if(ds.size()==nums.length){
            result.add(new ArrayList<>(ds));
            return;
            }
            for(int i=0; i<nums.length; i++){
                if(used[i]) continue;

                used[i]= true;
                ds.add(nums[i]);

                backtrack(nums,used, result, ds);
                ds.remove(ds.size()-1);
                used[i]= false;
            }
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        boolean[] used= new boolean[nums.length];

        backtrack(nums, used, result, ds); 
        return result;
        
    }
}