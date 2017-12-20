//MaxHouserob.java
//https://leetcode.com/problems/house-robber/description/

class Solution {
    public int rob(int[] nums) {
        int prevn =0;
        int prevy=0;
        for(int i: nums){
            int temp=prevn;
            prevn = Math.max(prevn, prevy);
            prevy = temp+i;
        }
        return Math.max(prevn, prevy);
    }
}