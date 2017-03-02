package code;

public class RoatedArray189 {
	public void rotate(int[] nums, int k) {
        int length = nums.length;
        k= k%length;
        reverse(nums, 0, length-1-k);
        reverse(nums,length-k,length-1);
        reverse(nums, 0, length-1);
    }
	public void reverse(int[] nums,int i,int j){
		for(;i<j;i++){
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] =tmp;
		}
	}
}
