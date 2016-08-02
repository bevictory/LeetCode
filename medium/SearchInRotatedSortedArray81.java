package medium;

public class SearchInRotatedSortedArray81 {
	public boolean search(int[] nums, int target) {
		if(nums ==null||nums.length ==0  ) return false;
        int left =0,right = nums.length-1;
        
        while(left+1<right){
        	int mid = (left +(right-left )/2);
        	if(nums[mid]  == target  ) return true;
        	if(nums[left] == nums[mid]) {
        	    left +=1;
        	    continue;
        	}
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
        if(nums[left] == target) return true;
    	if(nums[right ] == target ) return true;
        return false;
    }
}
