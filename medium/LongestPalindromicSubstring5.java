package medium;

public class LongestPalindromicSubstring5 {
	public String longestPalindrome(String s) {
        int n = s.length();
        int maxBegin =0;
        int maxLen =0;
        boolean [][]len = new boolean[1000][1000];
        for(int i =0;i<n;i++){
        	len[i][i]=true; 
        }
        for(int i=0;i<n;i++){
        	if(s.charAt(i)==s.charAt(i+1)){
        		len[i][i+1]=true;
        		maxBegin=i;
        		maxLen=2;
        	}
        }
        for(int i =3;i<=n;i++){
        	for(int j=0;j<n-i+1;j++){
        		int k= j+i-1;
        		if(s.charAt(j)==s.charAt(k)&&len[j+1][k-1]==true){
        			len[j][k]=true;
        			if(i>maxLen){
        				maxLen=i;
        				maxBegin=j;
        			}
        		}
        	}
        }
        return s.substring(maxBegin,maxBegin+maxLen);
    }
}
