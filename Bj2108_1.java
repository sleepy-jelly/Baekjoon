	import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Bj2108_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int range = Integer.parseInt(br.readLine());
		int[] arr= new int[8001];
		
		int sum=0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 10000;				//median
		int mode = 10000;
		
		
		
		for(int i =0; i<range;i++) {
			int value = Integer.parseInt(br.readLine());
			sum=sum+value;
			arr[value+4000]++;
			
			
			if(max<value) {
				max=value;
			}
			
			if(min>value) {
				min=value;
			}
			
			
			
		}
		
		
		int cnt =0;
		int modeMax =0;
		
		
		
		boolean flag = false;
		
		for(int i=min+4000;i<=max+4000;i++) {
			if(arr[i]>0) {
				
				
				if(cnt<(range+1)/2) {
					cnt = cnt+arr[i];
					median =i-4000;
				}
				
				
				if(modeMax<arr[i]) {
					
					modeMax=arr[i];
					mode = i-4000;
					
					flag=true;
					
				} else if(modeMax==arr[i]&&flag==true) {
					mode =i-4000;
					flag= false;
				}
				
				
				
				
			}
		}
		
		System.out.println((int)Math.round((double)sum/range));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max-min);
		
		
		
		
		
		
		
		
	}

}
