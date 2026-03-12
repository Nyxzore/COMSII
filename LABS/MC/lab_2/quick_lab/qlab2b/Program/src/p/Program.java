//package p;
import java.util.*;
public class Program {
	
	public static double euclid_sqaured(ArrayList<Integer> point_a, ArrayList<Integer> point_b) {
		double dx = point_a.get(0)-point_b.get(0);
		double dy = point_a.get(1)-point_b.get(1);
		return dx*dx+dy*dy;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> coord_plane = new ArrayList<>();
		
		while (in.hasNextLine()) {
			String s = in.nextLine();
			if (s.equals("-1")) {break;}
		
			String[] s_split = s.split(",");
			int x = Integer.parseInt(s_split[0].trim()); 
			int y = Integer.parseInt(s_split[1].trim());
			
			ArrayList<Integer> coord = new ArrayList<>();
			coord.add(x); coord.add(y);
			coord_plane.add(coord);
		}
		in.close();
		
		double min_euclid = Integer.MAX_VALUE; 
		int n = coord_plane.size();
		for(int i=0; i<n-1;i++) { //O(n^2)
			for (int j=i+1; j<n; j++) {
				double dist = euclid_sqaured(coord_plane.get(i), coord_plane.get(j));
				if (dist < min_euclid) {min_euclid = dist;}
			}
		}
		System.out.println(Math.sqrt(min_euclid));
	}
}
