//package p;
import java.util.*;
public class Program {
	
	ArrayList<Rating> allRatings = new ArrayList<>();
	public double get_Average(ArrayList<Rating> v) {
		int size = 0;
		double sum = 0.0;
		for (Rating r : v) {
			size++;
			sum += r.getScore();
		}
		if (size == 0) return 0;
		return sum/size;
	}
	
	public static void main(String args[]) {
		Program my_program = new Program();
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String s = in.nextLine();
			if (s.equals("-1")) {break;}
			
			String[] s_split = s.split(";");
			String username = s_split[0].trim(); 
			int rating = Integer.parseInt(s_split[1].trim());
			Rating r = new Rating(username,rating);
			my_program.allRatings.add(r);
		}
		in.close();
		
		System.out.println(my_program.get_Average(my_program.allRatings));
	}
}
