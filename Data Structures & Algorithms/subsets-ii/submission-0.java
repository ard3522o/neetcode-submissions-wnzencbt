class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ans = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, 0);
        return ans;
    }
    void backtrack(List<Integer> li, int[] nums, int st) {
        ans.add(new ArrayList<>(li));
       for(int i=st;i<nums.length;i++){
       if (i > st && nums[i] == nums[i - 1]) {
                continue;
            }
        li.add(nums[i]);
        backtrack(li, nums, i+1);
        li.remove(li.size()-1);
       }
    }
}
