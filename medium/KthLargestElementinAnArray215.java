package medium;

public class KthLargestElementinAnArray215 {
	  public int findKthLargest(int[] nums, int k) {
	        int loc =0;
			int left = 0, right = nums.length-1;
			while(left <= right){
				loc = partion(nums, left, right, k);
				if(loc+1== k ) return nums[loc];
				else if(loc +1 > k) {
					right = loc -1;
					
				}else {
					left = loc +1;
					
				}
			}
			return 0;
	    }
		public int partion(int []nums,int begin, int end, int k){
			int tmp = nums[end];
			int left = begin,right = end;
			while(left < right){
				while(nums[left] >tmp&&left<right) left++;
				nums[right]=  nums[left];
				while(nums[right] <=tmp&&left<right) right --;
				nums[left] = nums[right];
			}
			nums[left] = tmp;
			return left;
		}
}
