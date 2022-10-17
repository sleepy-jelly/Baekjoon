import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Bj1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nMax=sc.nextInt();
		sc.nextLine();
		String[] arr= new String[nMax];
		for(int i =0; i <nMax;i++) {
			
			arr[i]=sc.nextLine();
			
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length()) {
					
					return s1.compareTo(s2);
				}
				else {
					return s1.length()-s2.length();
				}	
			}	
		});		
		System.out.println(arr[0]);
		
		for(int i =1; i<nMax;i++) {
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
			
			
		}
		
		
		sc.close();
	}

}
