import java.util.Scanner;
public class Bj10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int nMax = sc.nextInt();
		
		
		System.out.println(factorial(nMax));
		sc.close();
		

	}
	
	static int factorial(int nSize) {
		
		if(nSize<=1) {
			return 1;
		}
	 	return nSize*factorial(nSize-1);
	}

}
