//package s2950668;

public class Program {
	public static int getX(String s){
		return s.charAt(0) - '0'; 
	}
	
	public static int getY(String s){
		return s.charAt(2) - '0'; 
	}
	
	public static int getXDistance(String s1, String s2) {
		return Math.abs(getX(s1)-getX(s2));
	}
}
