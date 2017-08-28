package N134;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int sum = 0;
        int total = 0;
        for(int i=0;i<gas.length;i++){
            sum = gas[i]-cost[i]+sum;
            total = gas[i]-cost[i]+total;
            if(sum < 0){
                start = i+1;
                sum = 0;
            }
        }
        if(total < 0) return -1;
        else return start;
    }
}
