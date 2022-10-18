import java.util.Scanner;
public class Bj10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		int nMax= sc.nextInt();
		
		System.out.println(cal(nMax));
		
		
		
		
		sc.close();
		
		
		
	}
	
	public static int cal(int nData) {
		if(nData==0) {
			return 0;
		}
		else if(nData==1) {
			return 1;
		}
		else {
			return cal(nData-1)+cal(nData-2);
		}
	}

}
