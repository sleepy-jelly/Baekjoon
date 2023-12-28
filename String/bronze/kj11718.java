import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * https://www.acmicpc.net/problem/11718
 * 
 */
public class kj11718 { 
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nTempString = "";
        nTempString = br.readLine();
        if(nTempString.length()==0){
            br.close();
            return;
        }


        do{
            System.out.println(nTempString);
            nTempString = br.readLine();
        }
        while(nTempString != null);


        // other way
        // int cnt = 0;                      

        // for(int i = 0; i < 100; i++){

        //     String nTempString = br.readLine();

        //     System.out.println(nTempString);

        //     if(nTempString == null){
        //         break;
        //     }else{
        //         cnt ++;
        //     }

        // }

        br.close();
        
    }
    
}
