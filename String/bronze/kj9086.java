import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/*
 * https://www.acmicpc.net/problem/9086
 * 
 */

public class kj9086{
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       // init BufferedReader

        int testCnt = Integer.parseInt(br.readLine());                                  // read Total Test Case cnt

        for(int i = 0; i < testCnt; i++){

            String nStr = br.readLine();                                                 // read line
            

            char[] nCharArray = new char[nStr.length()];                
            nCharArray = nStr.toCharArray();                                             // make String to char[]



            System.out.print(nCharArray[0]);                    
            System.out.println(nCharArray[nStr.length()-1]);                             // array index starts from 0
        }


        br.close();                                                                      // close BufferedReader


    }

}