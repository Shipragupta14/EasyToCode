/*Given a string, Check if characters of the given string can be rearranged to form a palindrome.*/

/*Logic--for every character in the first half, there is a corresponding matching character in the second half. 
This indicates that all the characters in a string must occur even number of times except for one which appears
 in the middle of the string.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for(int m=0;m<t;m++){
    		String s = sc.next();
    		if(isPalindrome(s)){
    		    System.out.println("Yes");
    		}
    		else{
    		    System.out.println("No");
    		}
		}
		
	}
	
	public static boolean isPalindrome(String str)
    {
        //Array of size 26 for alpabhets a to z
        int [] count = new int[26];
        for( int i = 0; i < str.length(); i++ )
        {
            //'ch' is the position of the alphabet
            char ch = str.charAt(i);
            //count++ for the position of the alphabet
            count[ch-'a']++;
          //  System.out.println(Arrays.toString(count));
        }
        int odd = 0;
        //cnt is for each value of count array
        for( int cnt:count )
        {
            //except for middle, no alphabet should come odd times
            if( odd > 1) 
                return false;
            if( cnt%2 == 1 )
                odd++;
        }
        return true;
    }

}

/*
    Input - 
    2
    wow
    elloello
    geeksforgeeks

    Output-
    yes
    yes
    no
*/