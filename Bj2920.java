import java.util.Scanner;
import java.util.Arrays;
public class Bj2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]n = new int[8];
		
		int[]arrayA= {1,2,3,4,5,6,7,8};
		int[]arrayD= {8,7,6,5,4,3,2,1};
		
		for(int i=0; i<n.length;i++) {
			n[i] =sc.nextInt();
		}
		
		
		if(Arrays.equals(n, arrayA)) {
			System.out.println("ascending");
		}else if(Arrays.equals(n, arrayD)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		
		sc.close();
		
	}
}
