//package s2950668;
import java.util.Scanner; 
public class Program {
	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		int size = Integer.parseInt(in.nextLine());
		int[] arr = new int[size]; 
		
		for(int i=0; i<size; i++) {
			arr[i]= Integer.parseInt(in.nextLine());
		}
		
		in.close();
		
		for(int i=size-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		
	}
}
