package code;

public class CountAndSay38 {
	public static String countAndSay(int n) {
        //int count =1;
        String string= "1";
        StringBuffer stringBuilder=null;
        for(int i =1;i<n;i++){
        	 stringBuilder= new StringBuffer();
        	
        	for(int j=0;j<string.length();){
        		char c = string.charAt(j);
        		int count=1;
        		while (j+1<string.length()&&string.charAt(j+1)==c)
        		{
        			count++;
        			j++;
        		}
        		stringBuilder.append(count);
        		stringBuilder.append(c);
        		//System.out.println(stringBuilder.capacity());
        		j++;
        		count=1;
        	}
        	string = stringBuilder.toString();
        }
        return string;
    }
	public static void main(String []args){
		System.out.println(countAndSay(2));
	}
	

}
