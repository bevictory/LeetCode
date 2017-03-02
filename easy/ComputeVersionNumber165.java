package code;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ComputeVersionNumber165 {
	public int compareVersion(String version1, String version2) {
        List<String> list1= new ArrayList<String>();
        List<String> list2= new ArrayList<String>();
        StringTokenizer str1 = new StringTokenizer(version1,".");
        while(str1.hasMoreTokens()){
        	list1.add(str1.nextToken());
        }
        StringTokenizer str2 = new StringTokenizer(version2,".");
        while(str2.hasMoreTokens()){
        	list2.add(str2.nextToken());
        }
        int length = list1.size()-list2.size();
        for(int i =0 ;i<Math.abs(length);i++){
        	if(length>0){
        		list2.add("0");
        	}else list1.add("0");
        }
        for(int i =0 ;i<list1.size();i++){
        	if(compare(list1.get(i), list2.get(i))==0){
        		continue;
        	}else if(compare(list1.get(i), list2.get(i))==1){
        		return 1;
        	}else return -1;
        }
        return 0;
    }
	public  String predixZero(String str){
		int loc=0;
		for(int i =0 ;i<str.length();i++){
			if(str.charAt(i)=='0') loc++;
		}
		str = str.substring(loc);
		return str;
	}
	public int compare(String str1,String str2){
		
		int value1 = Integer.valueOf(str1);
		int value2 = Integer.valueOf(str2);
		if(value1==value2) return 0;
		else if(value1 >value2) return 1;
		else return -1;
//		int length1 = str1.length();
//		int length2 = str2.length();
//		int i,j;
//		for( i=0,j=0;i<length1&&j<length2;i++,j++){
//			if(str1.charAt(i)==str2.charAt(j)){
//				continue;
//			}else if(str1.charAt(i)<str2.charAt(j)){
//				return -1;
//			}else return 1;
//		}
//		if(i==length1&&j==length2){
//			return 0;
//		}
//		if(length1>length2){
//			return 1;
//		}else return -1;
	}
	public static void main(String []args){
		
	}
}
