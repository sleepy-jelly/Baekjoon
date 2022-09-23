import java.util.Scanner;

public class Bj3003 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] aList = {0, 0,0,0,0,0};

		for(int i=0;i<6;i++) {
			aList[i]=sc.nextInt();
		}
		
		for(int i=0;i<6;i++) {
			
			switch(i){
				case 0:
				case 1:
					if(aList[i]>1) {
						aList[i] = (aList[i]-1)*-1;
					}else if(aList[i]==1) {
						aList[i] =0;
					}else {
						aList[i]=1;
					}
					break;
				case 2:
				case 3:
				case 4:
					if(aList[i]>2) {
						aList[i] =(aList[i]-2)*-1;
					}else if(aList[i]>0&&aList[i]<3) {
						aList[i]=2-aList[i];
					}else {
						aList[i]=2;
					}
					break;
				case 5:
					if(aList[i]>8) {
						aList[i]= (aList[i]-8)*-1;
					}else if(aList[i]==8) {
						aList[i]=0;
					}else {
						aList[i]= 8-aList[i];
					}
					break;
			}
			
		}
		
		
		for(int j=0;j<6;j++) {
			System.out.print(aList[j]+" ");
		}
		
		
		
		sc.close();
	}

}
