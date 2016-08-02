package hard;

public class RegularExpressionMatch10 {
	public boolean isMatch(String s, String p) {
		int len1 = s.length();
        int len2 = p.length();
        if(len1 == 0 ){
        	if(len2%2!=0) return false;
        	for(int i =1;i<len2;i+=2){
        		if(p.charAt(i)!='*') return false;
        	}
        	return true;
        }
        if(len2 ==0) return false;
        char c ='0';
        if(len2>1) c= p.charAt(1);
        if(c =='*'){
        	if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.'){
        		return isMatch(s.substring(1),p )||isMatch(s, p.substring(2));
        	}else return isMatch(s, p.substring(2));
        }else {
        	if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.'){ 
        		return isMatch(s.substring(1), p.substring(1));
        	}else return false;
        		
        }
    }
}
