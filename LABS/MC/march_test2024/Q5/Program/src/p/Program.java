//package p;

import java.util.Scanner;
public class Program {
	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		String final_word = "";
		for (int i=0; i<10; i++) {
			String word = in.nextLine().strip();
			final_word = (word.charAt(word.length()-1)) + final_word;
		}
		in.close();
		System.out.println(final_word.toUpperCase());
	}
}
