import java.util.Scanner;
public class Bj11653 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int nData=sc.nextInt();
	
		for(int i=2;i<nData+1;i++) {
			while(nData%i==0) {
				nData /=i;
				System.out.println(i);
					
				}
				
			}
		
			if(nData!=1) {
				System.out.println(nData);
			}
		sc.close();
	}
}
