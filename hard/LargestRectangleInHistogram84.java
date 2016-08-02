package hard;

import java.lang.Thread.State;
import java.util.Stack;

public class LargestRectangleInHistogram84 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<Integer>();
        int i=0,area=0;
        while(i<n){
        	if(stack.isEmpty()||heights[stack.peek()]<heights[i]){
        		stack.push(i++);
        	}else{
        		while(!stack.isEmpty()&&heights[stack.peek()]>heights[i]){
        			int tmp = stack.peek();
        			stack.pop();
        			area=Math.max(area, heights[tmp]*(stack.isEmpty()?i:i-(stack.peek()+1)));
        		}
        		stack.push(i++);
        	}
        }
        while(!stack.isEmpty()){
        	int tmp = stack.peek();
			stack.pop();
			area=Math.max(area, heights[tmp]*(stack.isEmpty()?i:i-(stack.peek()+1)));
        }
        return area;
    }
}
