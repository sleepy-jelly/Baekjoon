package Baekjoon;

import java.util.Scanner;

public class kj25314 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int nValue;
        String RESULT="";
        nValue=sc.nextInt();


        for(int i=0; i<nValue/4;i++){

            RESULT=RESULT+"long ";





        }



        RESULT=RESULT+"int";


        System.out.println(RESULT);



        sc.close();
    }
    
}
