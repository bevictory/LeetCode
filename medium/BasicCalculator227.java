package medium;

import java.util.Stack;

public class BasicCalculator227 {
    public int calculate(String s) {
        int length = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        int res=0,i=0;
        char sign = '+';int cur=0;
        while(i<length){
        	char c = s.charAt(i);
         	if(c-'0'<=9&&c-'0'>=0){
         		
         		while(i<length&&s.charAt(i)-'0'<=9&&s.charAt(i)-'0'>=0){
         			cur = cur*10+s.charAt(i)-'0';
         			i++;
         		}
         		
         		if(i<length )continue;
         		else i --;
         		
         	}
         	if(!Character.isDigit(c)&&!Character.isSpaceChar(c)||i >= length-1){
         		switch (sign) {
				case '+':
					break;
				case '-':
					cur = -cur;
					break;
				case '*':
					cur = stack.pop()*cur;
					break;
				case '/':
					cur = stack.pop()/cur;
					break;
				default:
					break;
				}
         		stack.push(cur);
         		cur =0;
         		
         		sign =s.charAt(i);
         	}
			i++;
         	
        }
        while(!stack.isEmpty()){
        	res+= stack.pop();
        }
        return res;
    }
    public static void main(String []args){
    	BasicCalculator227 c =new  BasicCalculator227();
    	System.out.println(c.calculate("3/2"));
    	
    }
}
