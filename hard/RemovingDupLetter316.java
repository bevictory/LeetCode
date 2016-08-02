package hard;

public class RemovingDupLetter316 {
	public String removeDuplicateLetters(String s) {
        int length = s.length();
        int []map = new int[26];
        for(int i=0;i<length;i++){
        	map[s.charAt(i)-'a']++;
        }
        int min = 0;
        for(int i=0; i< length; i++){
        	if(s.charAt(i)<s.charAt(min))
        		min = i;
        	if(--map[s.charAt(i)-'a']==0) break;
        }
        return s.length()==0?"":s.charAt(min)+removeDuplicateLetters(s.substring(min+1).replaceAll(""+s.charAt(min), ""));
    }
}
