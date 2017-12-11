import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		int sum1=0;
		int sum2=0;
		for(int m=0;m<t;m++){
    		String s = sc.next();
    		if(isPalindrome(s)){
    		   System.out.println("0");
    		}
    		else{
    		   // System.out.println("No");
    		    for( int i = 0; i < s.length()/2; i++ )
                {
                    //'ch' is the position of the alphabet
                    char ch = s.charAt(i);
                   int  pos = ch - 'a'+1;
                   sum1=sum1+pos;
                    
                }
               // System.out.println( sum1);
                for( int j = s.length()-1; j > s.length()/2-1; j-- )
                {
                    //'ch' is the position of the alphabet
                    char ch = s.charAt(j);
                   int  pos = ch - 'a'+1;
                   sum2=sum2+pos;
                    
                }
               // System.out.println( sum2);
                if(sum1>=sum2){
                    System.out.println(sum2);
                }else{
                    System.out.println(sum1);
                }
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
           // int pos = ch - 'a'+1;
          //  System.out.println( pos);
            //count++ for the position of the alphabet
            
            count[ch-'a']++;
          // System.out.println(Arrays.toString(count));
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