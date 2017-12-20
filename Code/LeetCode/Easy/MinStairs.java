//https://leetcode.com/problems/min-cost-climbing-stairs/description/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prevn=0;   //prevn signifies cost of stair not adjacent
        int prevy=0;   //prevy signifies cost of stair adjacent to current one
        int n =cost.length;
        for(int i=2; i<=n;i++){
            int temp = Math.min(prevy+cost[i-1], prevn+cost[i-2]);
            prevn=prevy;
            prevy=temp;
        }
        return prevy;
    }
}