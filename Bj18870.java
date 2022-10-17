import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
public class Bj18870 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nMax = Integer.parseInt(br.readLine());
		int[] arrOrigin = new int[nMax];
		int[] arrSorted = new int[nMax];
		HashMap<Integer,Integer> rankingMap = new HashMap<Integer, Integer>();
		
		StringTokenizer st= new StringTokenizer(br.readLine()," ");

		for(int i=0;i<nMax;i++) {
			
			arrOrigin[i]=Integer.parseInt(st.nextToken());
			arrSorted[i]=arrOrigin[i];
			
		}
		
		
		
		
		
		Arrays.sort(arrSorted);
		
		int rank = 0;
		for(int value:arrSorted) {
			if(!rankingMap.containsKey(value)) {
				rankingMap.put(value, rank);
				rank++;
			}
			
		}
		
		
		StringBuilder sb= new StringBuilder();
		for(int key:arrOrigin) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
		
		
		
		

	}

}
