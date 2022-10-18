import java.util.Scanner;

public class Bj25501 {
static int callCnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int nMax= sc.nextInt();
		String[] arr = new String[nMax];
		sc.nextLine();
		for(int i =0; i<nMax;i++) {
			arr[i]=sc.nextLine();
			System.out.println(isPalindrome(arr[i])+" "+callCnt);
			callCnt=0;
		}
		
		
		
		
		sc.close();
		
		
		
	}
	
	public static int isPalindrome(String s) {
		return recursion(s,0,s.length()-1);
	}
	
	
	public static int recursion(String s, int l, int r) {
		callCnt++;
		if(l>=r) {
			return 1;
		}else if(s.charAt(l) != s.charAt(r)) {
			return 0;
		}else {
			return recursion(s,l+1,r-1);
		}
	}
	
	
	

}
