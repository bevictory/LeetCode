package medium;

import java.util.List;

public class Triangle120 {
	 public int minimumTotal(List<List<Integer>> triangle) {
	       int length = triangle.size();
	       int []path = new int[length];
	       if(length ==0) return -1;
	       path[0] =triangle.get(0).get(0);
	       for(int i=1;i<length;i++){
	    	   for(int j=i;j>=0;j--){
	    		   if(j==i){
	    			   path[j] = path[j-1]+triangle.get(i).get(j);
	    			   
	    		   }else if(j==0){
	    			   path[j] = path[j]+triangle.get(i).get(j);
	    		   }else {
	    			   path[j] = path[j-1]>path[j]? path[j]:path[j-1];
	    			   path[j]=path[j]+ triangle.get(i).get(j);
	    		   }
	    	   }
	       }
	       int min = path[0];
	       for(int i=1; i< length;i++){
	    	   min = Math.min(min, path[i]);
	       }
	       return min;
	 }

}
