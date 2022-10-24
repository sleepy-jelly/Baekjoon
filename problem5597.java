package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
public class problem5597 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[30];
		
		for(int i =0; i<28;i++) {
			int j= sc.nextInt();
			
			arr1[j-1]=1;
			
			
			
		}
		int[] arr2 = new int[2];
		int nNum =0;
		for(int i =0;i<arr1.length;i++) {
			
			if(arr1[i]!=1) {
				arr2[nNum]=i+1;
				nNum++;
			}
		}
		
		Arrays.sort(arr2);
		for(int i =0; i<2; i++) {
		System.out.println(arr2[i]);
		}
		sc.close();
		
		

	}

}
