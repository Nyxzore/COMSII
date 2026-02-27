//package s2950668;
import java.util.Scanner;
public class Program {
	public static void main(String args []){
	int[] arr = new int[10]; 
	Scanner in = new Scanner(System.in);
	for(int i=0; i<arr.length; i++) {
		arr[i] = Integer.parseInt(in.nextLine());
	}
	int indx = Integer.parseInt(in.nextLine());
	System.out.print(arr[indx]);
	
	in.close();
	}
}