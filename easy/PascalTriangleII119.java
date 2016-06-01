package code;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII119 {
	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(rowIndex >=1) {
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(1);
        	result.add(list);
        }
        if(rowIndex >= 2){
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(1);list.add(1);
        	result.add(list);
        }
        if(rowIndex==0) return result.get(0);
        if(rowIndex==1) return result.get(1);
        for(int i =2 ;i<rowIndex;i++){
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(1);
        	for(int j =1;j<i;j++){
        		list.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
        	}
        	list.add(1);
        	result.add(list);
        }
        return result.get(rowIndex-1);
		
//        List<Integer> result = new ArrayList<Integer>();
//        int cur=0;
//        if(rowIndex==0) {
//        	result.add(1);
//        	return result;
//        }
//        if(rowIndex ==1){
//        	result.add(1);
//        	result.add(1);
//        	return result;
//        }
//        if((rowIndex+1)%2 ==0) cur = (rowIndex+1)/2;
//        else cur = (rowIndex+2)/2;
//        for(int i=0;i<cur;i++){
//        	if(i==0) result.add(1);
//        	else result.add(getValue(i, rowIndex));
//        }
//        if((rowIndex+1)%2!=0) cur = cur-1;
//       
//        for(int i = cur-1;i>=0;i--){
//        	result.add(result.get(i));
//        }
//        return result;
//        
//    }
//	public static int getValue(int cur,int rowIndex){
//		int sum =1;
//		for(int i=1;i<=cur;i++){
//			sum*=rowIndex-i+1;
//			sum/=cur-i+1;
//		}
//		return sum;
//		
//		
//	}
//	public static void main(String[] args){
//		System.out.println(getValue(14,30));
	}

}
