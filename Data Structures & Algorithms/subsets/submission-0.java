class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans = new ArrayList<>();
     backtrack(ans, new ArrayList<>(), nums, 0);
     return ans;
         
    }
    public void backtrack(List<List<Integer>> ans, List<Integer> li, int[] nums, int start){
        ans.add(new ArrayList<>(li));
        for(int i=start;i<nums.length;i++){
            li.add(nums[i]);
            backtrack(ans, li, nums, i+1);
            li.remove(li.size()-1);
        }
    }
}
