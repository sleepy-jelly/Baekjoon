import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Bj25305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max= sc.nextInt();
		int prize =sc.nextInt();
		Integer [] arr = new Integer [max];
		for(int i=0; i<max;i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());

		System.out.println(arr[prize-1]);
		
		
		sc.close();
		
	}

}
