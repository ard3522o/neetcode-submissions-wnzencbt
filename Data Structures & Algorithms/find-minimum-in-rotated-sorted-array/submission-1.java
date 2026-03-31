class Solution {
    public int findMin(int[] nums) {
    for(int i=1;i<nums.length;i++){
        if(nums[i-1] > nums[i] ){
            return nums[i];
        }
    }  
boolean flag = true;
    for(int i=0;i<nums.length-1;i++){
if(nums[i] > nums[i+1]){
    flag = false;
    break;
}
    }
    if(flag) return nums[0]; 
    return -1;  
    }
}
