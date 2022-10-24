package baekjoon;
import java.util.Scanner;
public class problem2738 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		
		int arrsize1 = sc.nextInt();
		int arrsize2 = sc.nextInt();
		
		int[][] arr = new int[arrsize1][arrsize2];
		
		for(int i=0;i<arrsize1;i++) {
			for(int j=0; j<arrsize2;j++) {
				arr[i][j]= sc.nextInt();
			}
			
		}
		for(int i=0;i<arrsize1;i++) {
			for(int j=0; j<arrsize2;j++) {
				arr[i][j]= arr[i][j]+sc.nextInt();
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print('\n');
		}
		
		
		
		sc.close();
	}

}
