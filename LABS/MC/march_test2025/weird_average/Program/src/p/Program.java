import java.util.Scanner;
public class Program {
	public static void main(String args[]){
		double sum = 0;
		int c = 0;
		Scanner in = new Scanner(System.in);
		int previous = in.nextInt(); 
		int current = in.nextInt();
		sum += current+previous;
		c+=2;
		while (previous != current) {
			previous = in.nextInt(); c++;
			current = in.nextInt();  c++;
			sum += current+previous;
		}
		System.out.println(sum/c);
	}
}
