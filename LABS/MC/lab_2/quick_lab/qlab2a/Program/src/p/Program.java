//package p;
import java.util.Scanner;
import java.util.*; 
public class Program {
	
	public static void main(String args []) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(); 
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextLine()) {
			String s = in.nextLine();
			if (s.equals("-1")) {break;}
			
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			
			String[] s_split = s.split(" ");
			
			for (String num : s_split) {
				numbers.add(Integer.parseInt(num));
			}
			matrix.add(numbers);
		}
		in.close();
		
		int m = (matrix.get(0)).size();
		int n = matrix.size();
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				if (j<n-1) System.out.print(matrix.get(j).get(i) + " ");
				else System.out.print(matrix.get(j).get(i));
			}
			
			if (i<m-1) {System.out.print('\n');}
		}
	}
}
