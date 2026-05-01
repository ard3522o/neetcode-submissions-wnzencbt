class Solution {
    public int reverse(int x) {
      int num = Math.abs(x);
      long ans = rev(num);
      if(ans >= Integer.MAX_VALUE || ans <= Integer.MIN_VALUE) return 0;
      if(x   < 0 ){
        ans = -1*ans;
        return (int)ans;
      }
      return (int)ans;
    }

    public long rev(int n){
        long num = 0;
        while(n > 0){
            int rem = n%10;
num = num*10 + rem;
n = n/10;
        }
        return num;
    }
}
