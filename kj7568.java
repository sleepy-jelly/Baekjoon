package Baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class kj7568{
    public static void main(String[] args)throws IOException{


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

      

        int nMax = Integer.parseInt(br.readLine());

        int[][] nArray = new int[nMax][2];


        for(int i =0; i<nArray.length;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            nArray[i][0]=Integer.parseInt(st.nextToken());
            nArray[i][1]=Integer.parseInt(st.nextToken());
        }




        for(int i =0;i<nMax;i++){
            int rank=1;
            for(int j=0;j<nMax;j++){
                if(i==j){
                    continue;
                }
                if (nArray[i][0]<nArray[j][0]
                            &&
                nArray[i][1]<nArray[j][1])
                {
                rank++;
                }
            }
            


            System.out.print(rank+" ");


        }










    }
}