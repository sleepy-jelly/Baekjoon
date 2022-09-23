import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Bj12865 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int newTotalStuff =sc.nextInt();
		int maximumWeight =sc.nextInt();
		int currentValue = 0;
		int[] maximumValue = new int[newTotalStuff];
		int currentWeight = 0;
		int[][] arrData1 = new int[newTotalStuff][2];		
		for(int i=0;i<arrData1.length;i++) {  
			for(int j=0;j<1;j++) { // j == weight  j+1 == value of the thing 
				arrData1[i][j]= sc.nextInt();
				arrData1[i][j+1]=sc.nextInt();
				System.out.print(arrData1[i][j]+" ");
				System.out.println(arrData1[i][j+1]);
			}
		}
		// me personally if i do some sort array it will be easier 
		Arrays.sort(arrData1, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
			}
		});
		for(int i=0;i<arrData1.length;i++) {  
			for(int j=0;j<1;j++) { // j == weight  j+1 == value of the thing 
				if (maximumWeight<(arrData1[i][j]+currentValue)) {
					currentWeight = currentWeight +arrData1[i][j];
					currentValue = currentValue + arrData1[i][j+1];
				}
				
				System.out.print(arrData1[i][j]+" ");
				System.out.println(arrData1[i][j+1]);
			}
			
		}
		
		
		
		
		
		
		System.out.println(maximumValue);
		
		sc.close();

	}

}
