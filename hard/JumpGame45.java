package hard;

public class JumpGame45 {
    public int jump(int[] nums) {
    	 int length = nums.length;
         if(length == 1) return 0;
         int loc = nums[0],index =0,step =0,nextloc=0;
         while(loc<length-1){
         	
         	while(index <length&&index <=loc){
         		nextloc = Math.max(nextloc, nums[index]+index);
         		index ++;
         	}
         	loc = nextloc;
         	nextloc = 0;
         	step++;
         }
         return step+1;
        
    }
}
