import java.util.Scanner;

public class Bj25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nTotal =sc.nextInt();
		int nResult =0;
		
		int i= sc.nextInt();
		for(int j=0;j<i;j++) {
			nResult+= sc.nextInt()*sc.nextInt();	
		}
		if(nTotal==nResult)
			System.out.println("Yes "+nResult);
		else {
			System.out.println("No "+nResult);

		}
		sc.close();
	}

}
