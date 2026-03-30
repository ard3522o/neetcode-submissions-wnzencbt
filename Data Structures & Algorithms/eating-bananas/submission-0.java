class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int rate = 0;
     
     Arrays.sort(piles);
     int num = piles[piles.length-1];
     
        int  r= 1;
        while(r <= num){
            int sum =0 ;
     for(int i=0;i<piles.length;i++){
        sum += (int)Math.ceil((double)piles[i]/r);
        
     }   
     if(sum <= h){
return r;
     }
        r++;
     
        }
     return -1;
     
    }
}
