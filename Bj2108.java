import java.util.Scanner;
import java.util.Arrays;
public class Bj2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int[] arr = new int[max];
		int sum = 0;

		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum= sum+arr[i];
		}
		
		Arrays.sort(arr);
		
		int mode= 9999;
		int modeMax=0;
		boolean flag =false;
		
		for(int i =0;i<max;i++) {
			int jump=0;
			int count= 1;
			int indexValue=arr[i];
			
			for(int j=i+1;j<max;j++) {
				if(indexValue!=arr[i]) {
					break;
				}
				
				count++;
				jump++;
				
			}
			if(count>modeMax) {
				
				modeMax=count;
				mode = indexValue;
				flag =true;
				
			}
			else if(count==modeMax&&flag==true) {
				
				mode=indexValue;
				flag=false;
				
			}
			
			i=i+jump;
		}
			
		
		System.out.println((int)Math.round((double)sum/max)); //arithmetic mean
		System.out.println(arr[(arr.length/2)]);//median
		System.out.println(mode);	//mode
		System.out.println(arr[max-1]-arr[0]);			//range
		
		
		
		
		
		
		sc.close();
	}
}
