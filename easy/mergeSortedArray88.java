package code;

public class mergeSortedArray88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =m-1,j=n-1;
        int k = m+n;
        while(k-->=0){
        	if(i>=0&&j>=0){
        	if(nums1[i]>nums2[j]){
        		nums1[k] = nums1[i];
        		i--;
        	}else{
        		nums1[k] = nums2[j];
        		j--;
        	}
        	continue;
        	}
        	if(i>=0){
        		nums1[k] = nums1[i];
        		i--;
        	}
        	if(j>=0){
        		nums1[k] = nums2[j];
        		j--;
        	}
        }
    }
}
