class Solution {
    public boolean isHappy(int n) {
     Set<Integer> map = new HashSet<>();
     while(!map.contains(n)){
        map.add(n);
        n = sq(n);
        if(n == 1) return true;
     }   
     return false;
    }
    int sq(int n){
        int sum = 0;
        while(n >0){
            int rem = n%10;
sum += rem*rem;
n = n/10;
        }
        return sum;
    }
}
