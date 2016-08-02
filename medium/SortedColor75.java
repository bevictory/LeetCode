package medium;

public class SortedColor75 {
    public void sortColors(int[] nums) {
        int i=-1;
        int k = -1;
        int j =-1;
        if(nums.length ==0) return ;
        for(int m = 0;m< nums.length;m++){
        	if(nums[m]==0){
        		nums[++k] =2;
        		nums[++j] =1;
        		nums[++i] =0;
        	}else if(nums[m] == 1){
        		nums[++k] =2;
        		nums[++j] =1;
        	}else nums[++k] =2;
        }
    }
}
