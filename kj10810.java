package Baekjoon;

import java.util.Scanner;

public class kj10810 {

    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
        
        int n,m;

        

        n = sc.nextInt();
        m = sc.nextInt();

        int[] nArray = new int[n];

        
       

        for(int i=0; i<m; i++){
            int z,x,c=0;
            z= sc.nextInt();
            x=sc.nextInt();
            c= sc.nextInt();

            for(;z<=x;z++){

                nArray[z-1]=c;




            }
         



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
