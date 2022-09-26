import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Bj2869 {

	public static void main(String[] args)throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine()," ");
		
		int speedOfSnail = Integer.parseInt(st.nextToken());
		int fallingValue = Integer.parseInt(st.nextToken());
		int totalHeight = Integer.parseInt(st.nextToken());
		
		int day =(totalHeight-fallingValue)/(speedOfSnail-fallingValue);
		
		if((totalHeight-fallingValue)%(speedOfSnail-fallingValue)==0) {
		}else {
			day++;
		}
			System.out.println(day);
		
	}

}
