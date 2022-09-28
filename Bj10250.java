import java.util.Scanner;
public class Bj10250 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int totalCase=sc.nextInt();		
		for(int i=0;i<totalCase;i++) {
			int height= sc.nextInt();
			@SuppressWarnings("unused")
			int maxRoom = sc.nextInt();
			int numCustomer =sc.nextInt();
			int nRoomFinal=0;

			if(numCustomer %height ==0) {
				nRoomFinal = (height*100)+(numCustomer/height);
				System.out.println(nRoomFinal);
				}else {
				nRoomFinal = ((numCustomer%height)*100)+((numCustomer/height)+1);
				System.out.println(nRoomFinal);
				}		
		}
		sc.close();

	}
}
	



