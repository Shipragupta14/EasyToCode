import java.io.*;
import java.util.*;

class ValidParentheses{
	public boolean check(String s){
	    Stack<Character> stack  = new Stack<Character>();
		for (int i=0;i<s.length() ;i++ ) {
			char c= s.charAt(i);
			if (c=='(' || c== '{' || c== '[') {
				stack.push(c);
			}
			else if (c== ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					System.out.println("not valid");
					return false;
				}
			}
			else if (c== ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					System.out.println("not valid");
					return false;
				}
			}
			else if (c== '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					System.out.println("not valid");
					return false;
				}
			}
		}
		System.out.println(" valid");
		return stack.isEmpty();
	}

	 public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ValidParentheses v= new ValidParentheses();
		String str = sc.next();
		v.check(str);
		
	}
}