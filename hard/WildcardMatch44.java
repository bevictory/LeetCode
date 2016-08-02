package hard;

public class WildcardMatch44 {
    public boolean isMatch(String s, String p) {
    	 int len1 = s.length();
         int len2 = p.length();
         boolean isStar = false;
         int s1=0, p1=0,i,j;
         for( i=0,j=0;i<len1&&(j<len2||isStar);){
         	if(i!=len1&&j==len2&&isStar){
         		j= p1;
 				i=++s1;
 				continue;
         	}
         	if(p.charAt(j)=='*'){
         		isStar = true;
         		if(j==len2-1) return true;
         		j=j+1;s1 = i;
         		p1 = j;
         		
         		
         	}else{
         		if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'){
         			i++;
         			j++;
         		}else {
         			if(!isStar ){
         				return false;
         			}j= p1;
         				i=++s1;
         		}
         	}
         }
         if(i ==len1 ){
         	while(j<len2&&p.charAt(j)=='*'){
         		j++;
         	}
         	if(j==len2) return true;
         }
         return false;
    }
}
