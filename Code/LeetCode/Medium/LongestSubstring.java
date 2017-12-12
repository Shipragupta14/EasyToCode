/*https://leetcode.com/problems/longest-palindromic-substring/description/*/

import java.io.*;
import java.util.*;
class Solution {
    int max=0;
     int begin ;
    public String longestPalindrome(String s) {
       
        int l = s.length();
        
        if(l<2){
            System.out.println(s);
            return s;
        }
        for(int index=0; index<l-1;index++){
            print(s, index-1, index+1);   //odd length
            print(s, index, index+1);  //even length
        }
        
        System.out.println(s.substring(begin, begin+max));
        return s.substring(begin, begin+max);
    }
    
    private void print(String str, int start, int end){
        while(start>=0 && end<str.length() && str.charAt(start)==str.charAt(end)){
            start--;
            end++;
        }
        if(max< end-start){
            begin=start+1;
            max=end-start-1;
        }
       // System.out.println(max);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String st= sc.next();
        Solution sol = new Solution();
        sol.longestPalindrome(st);
    }
}