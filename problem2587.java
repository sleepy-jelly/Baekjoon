package baekjoon;
import java.util.*;
public class problem2587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nMax=0;
		int[] arr = new int[5];
		for(int i =0; i <arr.length; i++) {
			arr[i]=sc.nextInt();
			nMax=nMax+arr[i];
		}
		Arrays.sort(arr);
		
	
		System.out.println(nMax/arr.length);
		System.out.println(arr[2]);
		
		
		sc.close();
	}

}
