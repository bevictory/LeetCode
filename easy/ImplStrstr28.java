package code;

public class ImplStrstr28 {

	public int strStr(String haystack, String needle) {
		if (needle.length() > haystack.length())
			return -1;
		if (needle.length() == 0 || haystack.length() == 0)
			return 0;

		int[] next = getNext(needle);
		int i=0,j=0;
		while(i<haystack.length()&&j<needle.length()){
			if(j == -1 || haystack.charAt(i) == needle.charAt(j))
            {
                j ++;
                i ++;           
                 
            }
            else
            {
                j = next[j];    
            }
		}
		if(j==needle.length()) return i-j;
		return -1;
	}

	public int[] getNext(String needle) {
		int[] next = new int[needle.length() + 1];
		
		int j = -1;     
        int i = 0;      
        next[i] = -1;    
        while(i < needle.length()-1)
        {
            if(j == -1 || needle.charAt(i) == needle.charAt(j))
            {
                j ++;
                i ++;           
                next[i] = j;    
            }
            else
            {
                j = next[j];    
            }
        }
        return next;
	}
}
