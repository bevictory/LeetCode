package hard;

import java.util.Stack;

public class BasicCalculator224 {
    public int calculate(String s) {
    	 int length = s.length();
         int i=0;
         Stack<Integer> stack = new Stack<Integer>();
         int sign =1,res=0;
         
         while(i<length){
         	char c = s.charAt(i);
         	if(c-'0'<=9&&c-'0'>=0){
         		int cur=0;
         		while(i<length&&s.charAt(i)-'0'<=9&&s.charAt(i)-'0'>=0){
         			cur = cur*10+s.charAt(i)-'0';
         			i++;
         		}
         		res+= cur*sign;
         		continue;
         	}
         	else if(c =='+'){
         		sign =1;
         	}else if(c=='-'){
         		sign =-1;
         	}else if(c=='('){
         		stack.push(res);
         		res =0;
         		stack.push(sign);
         		sign =1;
         	}else if(c==')'){
         		res = stack.pop()*res +stack.pop();
         		sign =1;
         	}
         	i++;
         }
         return res;
    }
}
