package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
public class problem1085 {

	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int x,y,w,h;
		x= Integer.parseInt(st.nextToken());
		y= Integer.parseInt(st.nextToken());
		w= Integer.parseInt(st.nextToken());
		h= Integer.parseInt(st.nextToken());
		
		
		int result =Math.max(x-w,y-h);
		System.out.println(Math.abs(result));
		
		
		
		
		
		
		

	}

}
