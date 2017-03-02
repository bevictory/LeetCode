package code;

public class ReverseBits190 {
	public int reverseBits(int n) {
		int value=0;
        for(int i =0 ;i< 32;i++){
        	value = (value<<1)|(n>>i&1);
        }
        return value;
    }
}
