//package p;


import java.util.ArrayList; 
public class Program {
//	public static void main(String args[]){
//		Program p = new Program();
//		ArrayList<String> people = new ArrayList<>();
//		ArrayList<String> opps = new ArrayList<>();
//		
//		people.add("Phumlani");
//		people.add("Mike");
//		people.add("Steve");
//		people.add("James");
//		
//		opps.add("Steve");
//		opps.add("Damian");
//		opps.add("Kariv");
//		
//		ArrayList<String> x = p.noFly(people, opps);
//		System.out.println(x);
//		
//	}
	public ArrayList<String> noFly(ArrayList<String> a, ArrayList<String> b){
		ArrayList<String> remove_these_people = new ArrayList<>();
		for (String person : a) {
			if (b.contains(person)){remove_these_people.add(person);}
		}
		return remove_these_people; 
	}
}
