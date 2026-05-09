class Solution {
    public int[] plusOne(int[] digits) {
    int num =0;
    for(int i=0;i<digits.length;i++){
        num = num*10 + digits[i];
    } 
    num = num+1;
    int ny = num;
    int n=0;
    while(ny > 0){
n += 1;
ny = ny/10;
    }  
    int[] ans = new int[n];
    for(int i=0;i<n;i++){
        ans[i] =  num%10;
        num = num/10;
    } 
    reverse(ans);
    return ans;
    }
     int[] reverse(int[] arr){
        int l = 0;
        int r = arr.length-1;
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }
}
