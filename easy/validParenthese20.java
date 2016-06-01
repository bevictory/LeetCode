package code;

import java.util.Stack;

public class validParenthese20 {
public boolean isValid(String s) {
        int length = s.length();
        Stack<Character> stack = new Stack<Character>();
        char [] left ={'(','[','{'};
        char [] right ={')',']','}'};
        for(int i =0 ;i< length ; i++){
        	char c = s.charAt(i);
        	if(c=='('||c=='['||c=='{'){
        		stack.push(c);
        	}
        	else{
        		if(!stack.isEmpty()){
        		switch (c) {
				case ')':
					if(stack.pop()!='(') return false;
					break;
				case ']':
					if(stack.pop()!='[') return false;
					break;
				case '}':
					if(stack.pop()!='{') return false;
					break;
				default:
					break;
				}
        		}
        		else return false;
        	}
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
