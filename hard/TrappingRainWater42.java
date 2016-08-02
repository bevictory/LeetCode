package hard;

public class TrappingRainWater42 {
    public int trap(int[] height) {
        int len = height.length;
        int maxHeight = 0;
        int []leftHeight = new int[len];
        for(int i =0 ;i<len;i++){
        	leftHeight[i]= maxHeight;
        	maxHeight  = Math.max(maxHeight, height[i]);
        }
         maxHeight = 0;
        int sum =0;
        for(int i =len-1 ;i>=0;i++){
        	sum += Math.min(maxHeight, leftHeight[i])-height[i]>0?Math.min(maxHeight, leftHeight[i])-height[i]:0;
        	maxHeight  = Math.max(maxHeight, height[i]);
        }
        return sum;
    }
}
