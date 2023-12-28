import java.util.Scanner;

/*
 *  https://www.acmicpc.net/problem/10811
 * 
 * 
 */
public class kj10811{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int n = 0;                       // range of the total reversing count  
        int m = 0;                       // range of reversing the array 


        n = sc.nextInt();               //N (1 ≤ N ≤ 100)
        m = sc.nextInt();               //M (1 ≤ M ≤ 100)


        int[] nArray = new int[n];       //total size of array

        
    


        for(int i = 0; i < n; i++){    //put data in array
            nArray[i] = i+1;            
        }



        for(int i = 0; i < m; i ++){    // (1 ≤ z ≤ x ≤ N)

            int z = 0;
            int x = 0;

            z = sc.nextInt()-1;         // array index is start with 0    
            x = sc.nextInt()-1;         // array index is start with 0  


            for(int j = z; j <= x; j++){   
                int sortCnt = x--;
                int nTemp = 0;

                nTemp = nArray[j];
                nArray[j] = nArray[sortCnt];
                nArray[sortCnt] = nTemp;
            }
        }

        for(int i = 0; i<n; i++){
            if(i==n-1){
                System.out.print(nArray[i]);
            }else{
                System.out.print(nArray[i] + " ");
            }
        }
        sc.close();
    }
}

