class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
if(i < n1){
    arr[i] = nums1[i];
}else{
    arr[i] = nums2[i-n1];
}
        }
        Arrays.sort(arr);
        if(arr.length%2 != 0){
            return arr[n/2];
        }else{
        
        double a = arr[(n/2)-1];
        double  b = arr[n/2];
       double ans = (a+b)/2;
        return ans;
        }
    
    }
}
