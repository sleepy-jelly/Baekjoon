
import java.util.Scanner;
public class Bj12865 {
	
	static Integer[][] dp;
	static int[] w;
	static int[] v;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int totalStuff =sc.nextInt();
		int maximumWeight =sc.nextInt();
		
		w=new int [totalStuff];
		v=new int [maximumWeight];
		
		dp = new Integer[totalStuff][maximumWeight+1];
		
		
		for(int i =0; i<totalStuff;i++) {
			w[i]= sc.nextInt();
			v[i]= sc.nextInt();
		}
		
		
		System.out.println(dp(totalStuff-1,maximumWeight));

		
		sc.close();
	}
	
	static int dp(int i, int j) {
		if(i<0) {             // if  i is lower than 0 (if i is out of data list)
			return 0;
		}
		
		if(dp[i][j]==null) {  // if there is no data 
			
			if(w[i]>j) {
				dp[i][j]=dp(i-1, j);
			}else {
				dp[i][j]= Math.max(dp(i-1,j), dp(i-1,j-w[i])+v[i]);

			}
		}	
		return dp[i][j];
	}
}
