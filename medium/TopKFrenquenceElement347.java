package medium;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class TopKFrenquenceElement347 {
	public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<Integer,Integer>();
        int n = nums.length ;
        
        for(int i  = 0; i < n; i++){
        	if(map.containsKey(nums[i])){
        		map.put(nums[i],map.get(nums[i])+1);
        	}else map . put(nums[i], 1);
        }
        
        List<java.util.Map.Entry<Integer, Integer>> list = new ArrayList<java.util.Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list,new Comparator<java.util.Map.Entry<Integer, Integer>>() {


			@Override
			public int compare(java.util.Map.Entry<Integer, Integer> o1,
					java.util.Map.Entry<Integer, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}

			

		});
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < k; i++){
        	result.add(list.get(i).getKey());
        }
        return result;
    }

}
