package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalindromePairs336 {
	public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < words.length; i++){
        	map.put(words[i], i);
        }
        int length = words.length;
        for(int i =0 ;i < length; i++){
        	for(int j=0;j<=words[i].length();j++){
        		String leftString = words[i].substring(0, j);
        		String rightString = words[i].substring(j); 
        		String leftReverse = reverse(leftString);
        		String rightReverse = reverse(rightString);
        		//j!=words[i].length()·ÀÖ¹ÖØ¸´
        		if(j!=words[i].length()&&isPalindrome(leftString)&&map.containsKey(rightReverse)){
        			List<Integer> list = new ArrayList<Integer>();
        			list.add(map.get(rightReverse));
        			list.add(i);
        			if(i != map.get(rightReverse)){
            			result.add(list);
            			}
        		}
        		if(isPalindrome(rightString)&&map.containsKey(leftReverse)){
        			List<Integer> list = new ArrayList<Integer>();
        			
        			list.add(i);list.add(map.get(leftReverse));
        			if(i != map.get(leftReverse)){
        			result.add(list);
        			}
        		}
        	}
        }
        return result;
        
    }
	public boolean isPalindrome(String s){
		int length = s.length();
		for(int i=0,j=length-1;i<j;i++,j--){
			if(s.charAt(i)!=s.charAt(j)) return false;
		}
		return true;
	}
	public String reverse(String s){
		int length = s.length();
		char[] string = s.toCharArray();
		for(int i =0,j=length-1 ;i< j;i++,j--){
			char tmp = string[i];
			string[i] =string[j];
			string[j]= tmp;
		}
		return String.copyValueOf(string);
	}
}
