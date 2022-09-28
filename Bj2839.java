import java.util.Scanner;
public class Bj2839 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nWeight= sc.nextInt();
	
		int n3kgBag =0;
		int n5kgBag =0;
		
		n5kgBag =(nWeight/15)*3;
		nWeight=nWeight%15;
		
		switch(nWeight) {
			case 0:
				break;
			case 1:
			case 2:
			case 4:
			case 7:
				n3kgBag=-1;
				n5kgBag=0;
				break;
			case 3:
				n3kgBag =1;
				break;
			case 5:
				n5kgBag =n5kgBag+1;
				break;
			case 6:
				n3kgBag =2;
				break;
			case 8:
				n3kgBag = 1;
				n5kgBag = n5kgBag +1;
				break;
			case 9:
				n3kgBag= 3;
				break;
			case 10: 
				n5kgBag = n5kgBag+2;
				break;
			case 11:
				n3kgBag = 2;
				n5kgBag = n5kgBag+1;
				break;
			case 12:
				n3kgBag = 4;
				break;
			case 13:
				n3kgBag =1;
				n5kgBag = n5kgBag+2;
				break;
			case 14:
				n3kgBag = 3;
				n5kgBag = n5kgBag +1;
				break;
		}
		
		System.out.println(n5kgBag+n3kgBag);
		
		
		
		
		
		
		sc.close();
	}

}
