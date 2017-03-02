package code;

public class AddBinary67 {
	public String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int i=aLength-1,j=bLength-1;
        int carry =0;
        StringBuffer result = new StringBuffer();
        for(;i>=0&&j>=0;i--,j--){
        	int tmp = carry+(int)a.charAt(i)+(int)b.charAt(j)-'0'-'0';
        	carry = tmp/2;
        	result.append(tmp%2);
        }
        if(i>=0){
        	while(i>=0){
        		int tmp = carry+(int)a.charAt(i)-'0';
            	carry = tmp/2;
            	result.append(tmp%2);
            	i--;
        	}
        }
        if(j>=0){
        	while(j>=0){
        		int tmp = carry+(int)b.charAt(j)-'0';
            	carry = tmp/2;
            	result.append(tmp%2);
            	j--;
        	}
        }
        return result.reverse().toString();
    }
	public static void main(String []args){
		int tmp = (int)'1'+(int)'2';
		System.out.println((int)'1');
	}
}
