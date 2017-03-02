package medium;

public class FindMinInRotated153 {
	public int findMin(int[] nums) {
		if(nums ==null  ) return -1;
        if(nums.length ==0) return nums[0];
        int left =0,right = nums.length-1;
        
        while(left+1<right){
        	int mid = (left +(right-left )/2);
        	
        	if(nums[left] < nums[mid]){
        		if(nums[left]>nums[right]) left = mid;
        		else right = mid;
        	}else{
        		right=mid;
        	}
        	
        }
        return Math.min(nums[left], nums[right]); 
       
    }
}
