package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class problem2563 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nCount= sc.nextInt();
		
		int[][] arr = new int[nCount][2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
				}
		});
		
		
		
		
		
		sc.close();
		
		
	}

}
