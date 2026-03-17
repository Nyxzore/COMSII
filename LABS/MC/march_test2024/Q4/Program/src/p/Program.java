//package p;

import java.util.Scanner; 
public class Program {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine().strip());
		in.close();
		for(int i = 0; i<n; i++){
			String line = "";
			for(int j = n-1; j>i; j--){
				line += " ";
			}
			for(int j = 0; j<=i; j++){
				{line += "*";}
			}
			System.out.println(line);
		}
	}
}
