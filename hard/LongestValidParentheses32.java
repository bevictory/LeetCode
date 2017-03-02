package hard;

import java.util.Stack;

public class LongestValidParentheses32 {
	  public int longestValidParentheses(String s) {
		  int length = s.length();
		  Stack<Integer> stack = new Stack<Integer>();
		  int lastIndex =0;
		  int max=0;
		  for(int i =0 ;i<length;i++){
			  if(s.charAt(i)=='('){
				  stack.push(i);
			  }else{
				  if(stack.isEmpty()){
					  lastIndex = i+1;
				  }else{
					  int index=stack.pop();
					  if(stack.isEmpty()){
						  max = Math.max(max, i-lastIndex+1);
					  }else {
						  max = Math.max(max, i-stack.peek());
					  }
				  }
			  }
		  }
		  return max;
	   }
}
