import java.util.Scanner;
public class Bj1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nCase = sc.nextInt();
		int cnt=0;
		for(int i=0;i<nCase;i++) {
			if(isPrimeNumber(sc.nextInt())==true) {
				cnt++;
			}
		}
		System.out.print(cnt);
		sc.close();
	}
	static boolean isPrimeNumber(int nData) {
		boolean primeNumber= false;
		if(nData==1) {
			return primeNumber;
		}
		for(int i =2; i<nData;i++) {
			if(nData%i==0) {
				primeNumber= false;
				return primeNumber;
			}
		}
		primeNumber = true;
		return primeNumber;
	}
}

