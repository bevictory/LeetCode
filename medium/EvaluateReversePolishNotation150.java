package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import code.ComputeVersionNumber165;

public class EvaluateReversePolishNotation150 {
	public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        String[] list = {"+","-","*","/"};
        List<String> list2 =Arrays.asList(list);
        int length = tokens.length;
        for(int i=0;i < length;i++){
        	if(list2.contains(tokens[i])){
        		int a = stack.pop();
        		int b = stack.pop();
        		stack.push(com(b,a,tokens[i]));
        	}else {
        		stack.push(Integer.valueOf(tokens[i]));
        	}
        }
        return stack.peek();
    }
	public int com(int a, int b, String s){
		if(s.equals("-")){
			return a-b;
		}else if(s.equals("+")){
			return a+b;
		}else if (s.equals("*")){
			return a*b;
		}else return a/b;
	}

}
