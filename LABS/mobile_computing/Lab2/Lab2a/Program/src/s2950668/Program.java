package s2950668;
import java.util.Scanner;  
public class Program {

	public static int multiply(int x, int y) {return x*y;}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int x = Integer.parseInt(in.nextLine());
		int y = Integer.parseInt(in.nextLine());
		System.out.println(multiply(x,y));
		in.close();
	}
}
