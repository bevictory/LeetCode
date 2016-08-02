package hard;

public class SearchinRotatedSortedArray33 {
	public int search(int[] nums, int target) {
        if(nums ==null||nums.length ==0  ) return -1;
        int left =0,right = nums.length-1;
        if(left ==right) return nums[left]== target?0:-1;
        while(left+1<right){
        	int mid = (left +(right-left )/2);
        	if(nums[mid]  == target  ) return mid;
        	if(nums[left] < nums[mid]){
        		if(nums[mid] >=target && nums[left ] <=target){
        			right = mid -1;
        		}else {
        			left = mid+1;
        		}
        	}else{
        		if(nums[mid] <=target&&nums[right]>=target){
        			left = mid +1;
        		}else right = mid-1;
        	}
        	
        }
        if(nums[left] == target) return left;
    	if(nums[right ] == target ) return right;
        return -1;
    }
	//默认为以递增的顺序排序
}
