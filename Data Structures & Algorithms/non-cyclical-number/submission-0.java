class Solution {
    public boolean isHappy(int n) {
     Map<Integer, Integer> map = new HashMap<>();
     if(!map.containsKey(n)){
        map.put(n, map.getOrDefault(n, 0)+1);
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
