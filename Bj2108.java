import java.util.Scanner;
import java.util.Arrays;
public class Bj2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int[] arr = new int[max];
		int sum = 0;
		
		
		for(int i =0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum= sum+arr[i];
		}
		
		Arrays.sort(arr);
		
		double avg =sum/max;
		
		System.out.printf("%.1f", avg);
		
		
		
		
		
		
		
		sc.close();
	}
}
