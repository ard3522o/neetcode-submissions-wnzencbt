class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       Arrays.sort(piles);
        int r = piles[piles.length-1];
        int l =1;
while(l <= r){
int mid = l + (r-l)/2;
    int total = 0;
    for(int pile: piles){
        total += (int)Math.ceil((double)pile/mid);
    }
    if(total <= h){
        r = mid-1;
    }else{
        l = mid + 1;
    }

}
return l;
    }
}
