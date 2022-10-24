package baekjoon;
import java.util.Scanner;
public class problem2566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int nMax = 0;
		int x=0;
		int y=0;
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
				if(arr[i][j]>nMax) {
					nMax=arr[i][j];
					x=i+1;
					y=j+1;
					
				}
				
			}
			
		}
		System.out.println(nMax);
		System.out.println(x+" "+y);
		
		
		
		sc.close();
		
		
	}

}
