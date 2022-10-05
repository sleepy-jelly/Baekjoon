	import java.util.Scanner;
	public class Bj2750 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			int nMax = sc.nextInt();
			int[] nArr = new int[nMax]; 
			for(int i=0; i<nMax;i++) {
				nArr[i]= sc.nextInt();
			}
			insertionSort(nArr);
			
			
			for(int i =0; i<nMax;i++) {
				System.out.println(nArr[i]);
			}
			
			
			
			sc.close();
		}
		static void insertionSort(int[]arr) {
			for(int i =1; i<arr.length;i++) {
				int temp= arr[i];
				
				int aux= i-1;
				while((aux>=0)&&(arr[aux]>temp)) {
					
					 arr[aux + 1] = arr[aux];
					 aux--;
					
				}
				arr[aux + 1] = temp;
			}
			
			
			
		}
	
	}
