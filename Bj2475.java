import java.util.Scanner;
public class Bj2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int nMax =0;
		for(int i =0;i<5;i++) {
			int n1=sc.nextInt();
			nMax=+nMax+(n1*n1);
		}
		
		System.out.println(nMax%10);
		
		
		sc.close();
	}

}
