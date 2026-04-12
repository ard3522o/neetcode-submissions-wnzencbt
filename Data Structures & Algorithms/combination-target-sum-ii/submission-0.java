class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, new ArrayList<>(), target, 0);
        return ans;
    }

    public void backtrack(int[] nums, List<Integer> li, int target, int i){
        if(target == 0) {
            ans.add(new ArrayList<>(li));
            return;
        }
        if(target < 0 || i >= nums.length) return;
        for(int j=i;j<nums.length;j++){
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }
            li.add(nums[j]);
            backtrack(nums, li, target-nums[j], j+1);
            li.remove(li.size()-1);
        }
    }
}
