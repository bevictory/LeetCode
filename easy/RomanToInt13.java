package code;

public class RomanToInt13 {
	public int romanToInt(String s) {
		if(s.length()<1) return 0;
        int sub= getRomanValue(s.charAt(0));
        int result =0;
        int last =sub;
		for(int i =1;i<s.length();i++)
        {
        	char c = s.charAt(i);
        	int cur = getRomanValue(c);
        	if(cur==last){
        		sub+=cur;
        	}
        	else if(cur > last){
        		sub = cur-sub;
        	}else{
        		result+=sub;
        		sub =cur;
        	}
        	last =cur;
        }
		result +=sub;
		return result;
    }
	public int getRomanValue(char c){
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
			

		default:
			return 0;
			
		}
	}
}
