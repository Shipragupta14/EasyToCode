//https://www.codechef.com/problems/BTAR

import java.util.*;
 
 class BeautifulArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- !=0){
            int n = sc.nextInt();
            int one = 0;
            int two = 0;
            int three = 0;
 
            sc.nextLine();
            String input  = sc.nextLine();
            String [] a;
            int count = 0;
            a = input.split(" ");
            for(int i=0; i<n; i++){
            	// after taking modulo by 4, we have only 4 values i.e. zero, one,two, three
                int v = Integer.parseInt(a[i])%4;  
                if(v == 1){
                    one++;
                }else if(v ==2){
                    two++;
                }else if(v == 3) {
                    three++;
                }
            }
            //4 =2+2 or 1+3
            count = count + two/2 + Math.min(one, three);
            //check number of 2's
            two = two%2;
            //left stores the excess no. of 1's or 3's
            int left = Math.abs(one-three);
 
 			//if no 2 left and no. of remaining 1 and 3 are odd then beautiful array is not possible
            if(left%2 != 0 || left%4 != 0 && two == 0){
                System.out.println(-1);
                //return;
            }else{
                two  =  two + left/2;
 
                if(two%2 != 0){
                    System.out.println(-1);
                    //return;
                }else{
                	//overall addition of 2'+2 and 1+3 and left+2
                    count = count + left/2 + two/2;
                    System.out.println(count);
                }
 
                
            }