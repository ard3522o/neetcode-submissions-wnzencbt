class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
     int l = 1;
     int r =  piles[n-1];
     while(l <= r){
        int mid = l+ (r-l)/2;
        int time = 0;
        for(int pile : piles){
            time += (int)Math.ceil((double)pile/mid);


        }
        if(time > h){
            l = mid+1;
        }else{
            r = mid-1;
        }
     } 
     return l; 
    }
}
