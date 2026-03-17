import java.util.*;
public class Program {
	public static void main(String args[]){
		ArrayList<String> word_list = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		for(int i=0; i<=n; i++){
			word_list.add(in.nextLine().strip());
		}
		String search_word = in.nextLine().strip();
		in.close();
		
		int i = word_list.indexOf(search_word)-1;
		if (i<0) System.out.println("");
		else System.out.println(word_list.get(i));
	}
}
