//package p;

public class ProcessCars{
	  public void check(Car one, Car two){
	      Car c = new Car();
	      String license1 = one.getNumberPlate();
	      String license2 = two.getNumberPlate();
	      
	      int firstSpeed = one.getSpeed();
	      
	      String country1 = one.getCountry();
	      if (one.equals(two)){
	         System.out.println("The two cars have the same number plate from the same country");
	      }
	      
	      if (one.getSpeed()>two.getSpeed()){
	         System.out.println("Car one is faster");
	      } else {
	         System.out.println("Car two is faster");
	      }
	  }
	  
	  public void accelerate(Car p, int amount){
	     p.setSpeed(p.getSpeed()+amount);
	  }
	}
