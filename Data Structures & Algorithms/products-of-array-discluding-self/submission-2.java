class Solution {
    public int[] productExceptSelf(int[] nums) {
       int mul = 1;
       int mul2 = 1;
       int[] ans = new int[nums.length];
       if(isZero(nums)) return ans;
       for(int i=0;i<nums.length;i++){
        mul *= nums[i];

       } 
       
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==  0){
        continue;
            }else{
                mul2 *= nums[i];
            }

       }
        if(twoZero(nums)){
        mul = 0;
        mul2 = 0;
       } 
      
        for(int i=0;i<nums.length;i++){
        if(nums[i] == 0){
            ans[i] = mul2;
        }else{
            ans[i] = mul/nums[i];
        }
       } 
       return ans;
    }
    boolean isZero(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
    boolean twoZero(int[] arr){
        int count = 0;
        for(int  i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count += 1;
            }
        }
        if(count >= 2) return true;
        return false;
    } 
}  
