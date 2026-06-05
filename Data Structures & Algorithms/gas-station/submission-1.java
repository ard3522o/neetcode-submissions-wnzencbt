class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int st=0;
        int costm =0;
        int n = gas.length;
        for(int i=0;i<n;i++){
costm += gas[i] - cost[i];

if(costm < 0){
    st = i+1;
    costm = 0;
}
        }
        costm = 0;
        for(int i=0;i<n;i++){
            int idx = (i+st)%n;
            costm += gas[idx] - cost[idx];
            if(costm < 0){
return -1;
            }
        }
        return st;
    }
}
