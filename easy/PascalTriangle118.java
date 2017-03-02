package code;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(numRows >=1) {
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(1);
        	result.add(list);
        }
        if(numRows >= 2){
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(1);list.add(1);
        	result.add(list);
        }
        for(int i =2 ;i<numRows;i++){
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(1);
        	for(int j =1;j<i;j++){
        		list.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
        	}
        	list.add(1);
        	result.add(list);
        }
        return result;
    }

}
