//package p;
public class Rating {
	String username; 
	int score; 
	
	public Rating(String u, int s) {
		username = u;
		score = s;
	}
	
	void set_Rating(int r){
		score = r;
		
	}
	int get_Rating(){
		return score;
	}
	void set_Username(String u){
		username = u;
	}
	String get_Username(){
		return username; 
	}
	
	public static void main(String args []){
		Rating myRating = new Rating("movieguy87", 7);
	}
}
