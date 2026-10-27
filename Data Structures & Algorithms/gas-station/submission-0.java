class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;
        int start = 0; //which index should i start so that i have enough gas
        int tank = 0;
        int total = 0;

        for(int i=0; i<n; i++){

            tank += gas[i] - cost[i];
            total += gas[i] - cost[i];

            if(tank < 0){
                tank = 0;
                start = i+1;
            }
        }
        return total < 0 ? -1 : start;
    }
}
