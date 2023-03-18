package Baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;;
//import java.util.Arrays;
public class kj2108 {
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int nMax=Integer.parseInt(br.readLine());




        int[] arr = new int[8001]; 


        int max =Integer.MAX_VALUE;
        int min =Integer.MIN_VALUE;


        int sum =0;

        
        for(int i =0;i<nMax;i++){
            int value = Integer.parseInt(br.readLine());
            arr[value+4000] = value;
            sum = sum+value;

            if(value<min){
                min= value;
            }

            if(value>max){
                max= value; 
            }

        }

        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){


            }

        }






        System.out.println(sum/nMax);       //1.
        System.out.println(max);

        System.out.print(max-min);         //4.range


    }
    
}
