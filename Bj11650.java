import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;
public class Bj11650 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int nMax =Integer.parseInt(br.readLine());
		int[][] arr= new int[nMax][2];
		for(int i =0;i<nMax;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken()); //x 
				arr[i][1] = Integer.parseInt(st.nextToken());  //y
			
			
		}
		
		
		Arrays.sort(arr, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]!=o2[1] ?o1[1]-o2[1] : o1[0]-o2[0];
			}
		});
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0; i<nMax;i++) {
			 sb.append(arr[i][0]+" "+arr[i][1]).append('\n') ;
		}
		
		System.out.println(sb);
		

	}

}
