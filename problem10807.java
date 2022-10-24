package baekjoon;
import java.util.Scanner;
public class problem10807 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		
		
		int nMax = sc.nextInt();
		
		int[] arr= new int[nMax];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int cnt= 0;
		int findThis =sc.nextInt();
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==findThis) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
