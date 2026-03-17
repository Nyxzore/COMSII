//-package p;

public class Point {
	private int x,y ;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int findDistance(Point b){
		return Math.abs(b.getX()-this.x)+Math.abs(b.getY()-this.y);
	}
	
}
