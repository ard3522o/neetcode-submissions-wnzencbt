class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       if(nums.length == 0) return 0;
int n = nums.length;
       int len = 1;
       int maxLen = 1;
       for(int i=0;i<n;i++){
        if( i < n-1 && nums[i] == nums[i+1]){
            continue;
        }else if(i < n-1 && nums[i+1] == nums[i] + 1){
            len += 1;
        }else{
            maxLen = Math.max(maxLen, len);
            len = 1;
        }
       } 
       return Math.max(maxLen, len);
    }
}
