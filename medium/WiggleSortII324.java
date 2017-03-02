package medium;

import java.util.Arrays;

public class WiggleSortII324 {
	public void wiggleSort(int[] nums) {
		 int n = nums.length;
			int []tmp =Arrays.copyOf(nums, n);
			Arrays.sort(tmp);
			int mid = n %2== 0?n/2-1:n/2;
			int last = n-1;
			int index=0;
			for(int i = 0 ;i <=mid ; i +=1){
				if(index+1<n){
					nums[index+1] = tmp[last --];
				}
				nums[index] = tmp[mid-i];
				index+=2;
			}
        
    }
}
