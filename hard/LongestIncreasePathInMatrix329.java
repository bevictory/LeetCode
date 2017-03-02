package hard;

public class LongestIncreasePathInMatrix329 {
	public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length <= 0|| matrix[0].length<=0) return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int max =0;
        int [][] dp = new int [row][col];
        for(int i =0 ;i<row; i++){
        	for(int j=0;j<col;j++){
        		max = Math.max(max, getLen(matrix,Integer.MIN_VALUE, i, j, dp));
        	}
        }
        return max;
        
    }
	public int getLen(int [][]matrix,int min, int row, int col, int [][]dp){
		if(row<0||col<0|| row >= matrix.length||col >= matrix[0].length){
			return 0;
		}
		if(matrix[row][col]<= min ) return 0;
		if(dp[row][col] !=0) return dp[row][col];
		 min = matrix[row][col];
		int left = getLen(matrix, min, row, col-1, dp)+1;
		int right = getLen(matrix, min, row, col+1, dp)+1;
		int up = getLen(matrix, min, row-1, col, dp)+1;
		int down = getLen(matrix, min, row+1, col, dp)+1;
		dp[row][col] = Math.max(left, Math.max(right, Math.max(up, down)));
		return dp[row][col];
		
	}

}
