public class Car {

	String numberPlate, country;
	int speed;

	public String getNumberPlate(){
		return this.numberPlate;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public String getCountry(){
		return this.country;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}

	public void setNumberPlate(String np){
		this.numberPlate = np;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public boolean equals(Car b){
		return (this.numberPlate.equals(b.getNumberPlate())) && (this.country.equals(b.getCountry()));
	}
}
