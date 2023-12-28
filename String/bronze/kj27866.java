import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/27866
 * 
 */

public class kj27866{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);            // init Scanner


        String nStr = sc.nextLine();                   
        int index = sc.nextInt();                       


        char[] nCharArray = new char[nStr.length()];
        nCharArray = nStr.toCharArray();


        System.out.println(nCharArray[index-1]);        // array index starts from 0

        sc.close();                                     // close Scanner

    }

}