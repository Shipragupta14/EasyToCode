/*Check whether a sentence is palagram or not. If not, then return the the sum pf positions of all those characters which are missing in the sentence*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	    try{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T--!=0) {
            int arr[] = new arr[26];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            String x = sc.nextLine();
            isPanagram(x);
        }   
	    }
	    catch (Exception e) {
        e.printStackTrace();
    }
        
  	}


    public static boolean isPanagram(String str){
        str = str.toLowerCase();

        // Get character array of string.
        char[] charArray = str.toCharArray();

        // Sort the character array.
        Arrays.sort(charArray);

        
        int sum =0;
        int count=0;
        for (int i = 0; i < charArray.length - 1; i++) {

            // Find the difference between current char and next char.
            int charDiff = charArray[i + 1] - charArray[i];
            count++;

            if (charDiff > 1) {

                for (int j = 1; j < charDiff; j++) {
                    char c = (char) (charArray[i] + j);
                   //Get the position of the alphabet which is not present 
                    int pos = c - 'a' + 1;
                    //Sum is the sum of all the position of all alphabets which are not present ina sentence
                    sum = sum+pos;
                   

                }
               
            }
            
        }
         System.out.println(sum);
      return true;
        
}
}


/*
    Input- abcdefghijklmopqrstuvwz
    Output - 63
    Explanation - As the n,x,y are not present in the string so their alphabetic sum is 63.
*/
