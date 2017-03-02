package medium;

public class MultiplyString43 {
	public String multiply(String num1, String num2) {
		int len1 = num1.length();
		 int len2 = num2.length();
		 int []result = new int [len1+len2];
		 for(int i = len1-1;i>= 0; i--){
			 for(int j = len2 -1; j>=0 ; j--){
				 result[len1-i+len2-j-2] +=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
			 }
		 }
		 int c=0;
		 for(int i =0 ;i<len1+len2;i++){
			 int num = result[i]+c;
			 result[i] = num %10;
			 c = num/10;
		 }
		 int i = len1 +len2-1;
		 while(i>0){
			 if(result[i]==0) i--;
			 else break;
		 }
		 if(i==0) return "0";
		 else {
			 StringBuffer stringBuffer = new StringBuffer();
			 for(;i>=0;i--){
				 stringBuffer.append(result[i]);
			 }
			 return stringBuffer.toString();
			 
		 }
		 
    }
	public static void main(String []args){
		MultiplyString43 m  = new MultiplyString43();
		System.out.println(m.multiply("11", "99"));
	}

}
