import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Bj10989 {
	public static void main(String[] args)throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int max=Integer.parseInt(br.readLine());

		
		int[]dp = new int [10001];
		
		
		for(int i =0; i<max; i++) {
			dp[Integer.parseInt(br.readLine())]++;
			
			
			
		}
		
		br.close();
		
		
		for(int i =0;i<dp.length;i++) {
			while(dp[i]>0) {
				sb.append(i).append('\n');
				dp[i]--;
			}
		}
		System.out.println(sb);
		
		
		

	}

}
