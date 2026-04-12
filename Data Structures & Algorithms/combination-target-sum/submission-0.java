class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
     ans = new  ArrayList<>();

    backtrack(nums, new ArrayList<>(), target, 0);
    return ans;

    }
    public void backtrack(int[] nums, List<Integer> li, int target, int i){
        if(target == 0){
            ans.add(new ArrayList<>(li));
            return;
        }
        if(target < 0 || i >= nums.length){
return;
        }
        li.add(nums[i]);
        backtrack(nums, li, target-nums[i], i);
        li.remove(li.size()-1);
        backtrack(nums, li, target, i+1);
    }
}
