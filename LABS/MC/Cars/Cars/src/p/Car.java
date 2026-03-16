//package p;

public class Car {
	String number_plate, country; 
	int speed;
	
	public Car(){
		number_plate = "";
		country = "";
		speed = 0;
	}
	public Car(String np, String c, int s){
		number_plate = np;
		country = c;
		speed = s;
	}
	
	public boolean equals(Car other){
		return (number_plate.equals(other.number_plate) && country.equals(other.country));
	}
	
	public int getSpeed(){return speed;}
	
	public String getNumberPlate(){return number_plate;}
	
	public String getCountry(){return country; }
	
	public void setSpeed(int s){speed = s;}
	
	public void setNumberPlate(String np){number_plate = np;}
	
	public void setCountry(String c){country = c;}
}

