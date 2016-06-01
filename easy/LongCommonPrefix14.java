package code;

public class LongCommonPrefix14 {
	public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if(length == 0) return "";
        String s  = strs[0];
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s.length() ; i++){
        	char c = s.charAt(i);
        	for(int j =1;j<strs.length;j++){
        		if(i>strs[j].length()-1||strs[j].charAt(i)!=c){
        			return result.toString();
        		}
        	}
        	result.append(c);
        }
        return result.toString();
    }
}
