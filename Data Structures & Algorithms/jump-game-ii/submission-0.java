class Solution {
    public int jump(int[] nums) {
      int curr =0;
      int far = 0;
      int jumps = 0;
      int n = nums.length;
      for(int i=0;i<n-1;i++){
        far = Math.max(far, i+nums[i]);

if(i == curr){
    jumps++;
    far = curr;
}
if(curr >= n-1){
    break;
}

      }  
      return jumps+1;
    }
}
