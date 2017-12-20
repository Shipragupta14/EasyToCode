//https://leetcode.com/problems/two-sum/description/

import java.util.*;

class Solution {
    public int[] twoSum(int[] num, int target) {
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       int[] result = new int[2];
       for(int i=0; i<num.length; i++){
          if( map.containsKey(target-num[i])){
              result[1]= i;
              result[0] = map.get(target-num[i]);
              return result;
          }
          map.put(num[i],i);
           
       }
       return result;
    }
}