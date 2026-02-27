//package s2950668;

public class Program {
	public static int[] scale(int[] arr, int s) {
		for(int i=0; i<arr.length; i++) {
			arr[i]*=s; 
		}
		return arr; 
	} 
	
	public static void main(String args []) {
		int[] toSend = {4 , 9 , 2 , 7 };
		int[] result = scale (toSend , 4) ;
		
		for (int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}	
	}
}
