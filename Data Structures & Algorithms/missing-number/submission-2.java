class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
     for(int i=1;i<nums.length;i++){
if(nums[i] != nums[i-1]+1){
    return nums[i-1]+1;
}
     }   
     if(nums[n-1] != n) return n;
     return 0;
    }
}
