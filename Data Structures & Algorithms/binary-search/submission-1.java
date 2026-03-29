class Solution {
    public int search(int[] nums, int target) {
     int n = nums.length;
     int l =  0;
     int h = n-1;
     while(l<=h){
        int mid = h - (h-l)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] < target){
            l++;
        }else{
            h--;
        }
     }
     return -1;   
    }
}
