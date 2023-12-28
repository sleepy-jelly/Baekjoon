import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10988
 * 
 */

public class kj10988{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);            // init Scanner

        String nStr = sc.nextLine();                   


        char[] nCharArray = new char[nStr.length()];
        nCharArray = nStr.toCharArray();

        int nCnt = nStr.length()-1;


        for(int i = 0; i < nStr.length()/2; i++){   
            
            if(nCharArray[i] != nCharArray[nCnt--]){     // check palindrome
                System.out.println("0");
                sc.close();                              // close Scanner
                return;
            }
        }

        System.out.println("1");
        sc.close();                                     // close Scanner

    }

}