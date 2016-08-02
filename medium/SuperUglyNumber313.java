package medium;

import java.util.Arrays;

public class SuperUglyNumber313 {
	public int nthSuperUglyNumber(int n, int[] primes) {
		int [] ugly = new int [n];
        ugly[0] =1;
        int []index = new int [primes.length];
        
        for(int i = 1; i < n; i++){
        	ugly[i] = Integer.MAX_VALUE; 
        	int minJ =0;
        	//Ҫ�����ظ������ݳ��֣�����ʹ��minJ��־��С���ݵ�����λ��
        	for(int j=0;j < primes.length; j ++){
        		if(ugly[i] > primes[j]*ugly[index[j]]){
        			
        			
        			ugly[i]=  primes[j]*ugly[index[j]];
        		}
        		
        	}
        	for(int j=0;j<primes.length;j++){
        		if(ugly[i]== primes[j]*ugly[index[j]] )
        			index[j]++;
        	}
        	
        }
        return ugly[n-1];  
    }
	public static void main(String []args){
		SuperUglyNumber313 s = new SuperUglyNumber313();
		int []primes={2,7,13,19};
		System.out.println(s.nthSuperUglyNumber(8, primes));
		
	}
}
