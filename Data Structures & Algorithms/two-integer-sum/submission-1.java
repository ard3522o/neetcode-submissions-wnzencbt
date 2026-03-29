class Solution {
    public int[] twoSum(int[] nums, int target) {
     int i=0;
     int j=i+1;
     int n = nums.length;
     while(i<n-1 && j<n){
        if(nums[i] + nums[j] == target){
            return new int[]{i, j};
        }else if(j == n-1){
            i++;
            j = i+1;
        }else{
            j++;
        }
     }
     return new int[]{-1, -1};

    }
}
