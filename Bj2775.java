import java.util.Scanner;
public class Bj2775 {

	public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);
		
		int[][] aptDb= new int[15][15];
		
		for(int i=0; i<15;i++) {
			aptDb[i][1]= 1;   // all of first room =1;
			aptDb[0][i]=i;    // <- ground floor
		}
		for(int i = 1; i <15; i++) { //starting floor is 2 (start with 1 in the index)
			for(int j =2; j<15; j++) {
				aptDb[i][j] =aptDb[i][j-1]+aptDb[i-1][j];
				
				
			}
		}
		
		
		
		int nTestCase = sc.nextInt();
		for(int i=0;i<nTestCase;i++) {
			int floor =sc.nextInt();
			int roomNum =sc.nextInt();
			System.out.println(aptDb[floor][roomNum]);
		}
		sc.close();
	}
}
