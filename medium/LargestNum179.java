package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class LargestNum179 {
	public String largestNumber(int[] nums) {
        int length = nums.length;
        String [] s = new String [length];
        for(int i=0;i<length;i++){
        	s [i]= String.valueOf(nums[i] );
        	
        }
        Arrays.sort(s,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String string1 = o1+o2;
				String string2 = o2+o1;
				int i=0;
				while(i<string1.length()){
					if(string1.charAt(i)!=string2.charAt(i)){
						return string1.charAt(i) - string2.charAt(i);
					}
					i++;
				}
				return 0;
			}

			
		});
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=length-1;i>=0;i--){
        	stringBuffer.append(s[i]);
        }
        String result = stringBuffer.toString();
        int loc=0;
        for(int i=0;i<result.length()-1;i++){
        	if(result.charAt(i)=='0'&&loc==i){
        		loc++;
        	}else break;
        }
        return result.substring(loc);
    }

}
