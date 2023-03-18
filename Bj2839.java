package Baekjoon;

import java.util.Scanner;


public class Bj2839{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int totalSugar  =sc.nextInt();

        if(totalSugar==4||totalSugar==7){
            System.out.println(-1);
        }else if(totalSugar%5==0){
            System.out.println(totalSugar/5);
        }else if(totalSugar%5==1||totalSugar%5==3){
            System.out.println((totalSugar/5)+1);
        }else if(totalSugar%5==2||totalSugar%5==4){
            System.out.println((totalSugar/5)+2);
        }






        sc.close();
    }

}