import java.util.Scanner;
public class Bj4948 {

	public static boolean[] dp;
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int nMax = sc.nextInt();
		
		
		
		dp = new boolean[10001];
		isPrimeQuick(dp);
		
		for(int i =0; i<nMax;i++) {
			int nNum=sc.nextInt();
			int primeFirst = nNum/2;
			int primeSecond= nNum/2;
			while(true) {
				if(dp[primeFirst]==false&&dp[primeSecond]==false) {
					System.out.println(primeFirst+" "+primeSecond);
					
						
					break;
				}
				primeFirst--;
				primeSecond++;
				
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		sc.close();
		
	}
	static void isPrimeQuick(boolean[] dp) {
		
		dp[0] =true;
		if(dp.length>1) {
		dp[1] = true;
		}
			for(int i =2; i<Math.sqrt(dp.length);i++){
				if(dp[i]) {
					continue;
				}
					for(int j=i*i; j<dp.length;j=j+i) {
					dp[j]=true;
					}
				
				
			}
	}

}