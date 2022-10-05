import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class Bj2751 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int max =Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arrlist = new ArrayList<>();
		
		

		
		for(int i =0; i<max;i++) {
			arrlist.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arrlist);
			
		
		for(int data: arrlist) {
			sb.append(data).append('\n');
		}
		
		System.out.println(sb);

	}

}
