//package p;

import java.util.ArrayList;
public class Program {
	
	public static void badDays(ArrayList<String> input){
		double count = 0.0;
		double num_days = 0.0;
		ArrayList<Integer> attendance = new ArrayList<>();
		for (String attendees : input){
			int n = attendees.split(",").length;
			count += n; 
			attendance.add(n);
			num_days++;
		}
		double avg = count/num_days;
		
		for (int i=0; i<attendance.size(); i++){
			if (attendance.get(i)<avg) {System.out.println(i);}
		}
	}
}
