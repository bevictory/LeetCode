package hard;

import java.util.Stack;

public class MaxRectangle85 {
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
	public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        if(row ==0) return 0;
        int col = matrix[0].length;
        if(col ==0) return 0;
        int [][] dp = new int [row][col];
        for(int i= 0; i< col; i++){
        	dp[0][i] = matrix[0][i] == '1'? 1:0; 
        }
        for(int  i= 1; i< row; i++){
        	for(int  j=0;j<col; j++){
        		if(matrix[i][j]== '1' ){
        			dp[i][j] = dp[i-1][j]+1;
        			
        		}else dp[i][j ] = 0;
        	}
        }
        int area=0;
        for(int i=0; i< row; i++){
        	area = Math.max(area, largestRectangleArea(dp[i]));
        	
        }
        return area;
    }
}
