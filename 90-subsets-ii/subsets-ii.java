class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList= new ArrayList<>();
        findSubsets(0,nums,new ArrayList<>(),ansList);
        return ansList;
    }
    public static void findSubsets(int pos, int nums[], List<Integer> s, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(s));
        for(int i=pos; i<nums.length; i++){
            if(i!=pos && nums[i]==nums[i-1]) continue;
                s.add(nums[i]);
                findSubsets(i+1, nums, s, ansList);
                s.remove(s.size()-1);
            }
            
        }
    }
