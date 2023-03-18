package Baekjoon;

import java.util.Scanner;


public class kj10813 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, m;

        n= sc.nextInt();
        m= sc.nextInt();

        int[] nArray =new int[n];
        

        for(int i=0; i<nArray.length;i++){
            nArray[i]=i+1;

        }


        int z,x=0;

        for(int i =0; i<m;i++){ 
            z=sc.nextInt();
            x=sc.nextInt();
            int nTemp= 0;

            nTemp=nArray[z-1];
            nArray[z-1]=nArray[x-1];
            nArray[x-1]=nTemp;

        }

        for(int i=0; i<n;i++){
            if(i!=n-1){
                System.out.print(nArray[i]);
                System.out.print(" ");
            }else{
                System.out.print(nArray[i]);
            }
            
            

        }



        sc.close();

    }
    
}
