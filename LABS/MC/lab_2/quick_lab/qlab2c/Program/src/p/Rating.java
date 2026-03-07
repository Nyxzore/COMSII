package p;
public class Rating {
	String username; 
	int score; 
	
	public Rating(String u, int s) {
		username = u;
		score = s;
	}
	
	void set_rating(int r){
		score = r;
		
	}
	int get_rating(){
		return score;
	}
	void set_username(String u){
		username = u;
	}
	String get_username(){
		return username; 
	}
	
	public static void main(String args []){
		Rating myRating = new Rating("movieguy87", 7);
	}
}
