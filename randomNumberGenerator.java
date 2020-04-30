import java.util.Random;

public class randomNumberGenerator {
	
	// class variables  
	private int min = 0;
	private int max = 100;
	private int range = max - min;
	//need a private instance variable 
	
	//constructor
	public randomNumberGenerator() {
		
	}
	
	//Explicitly sets range 
	public randomNumberGenerator(int min, int max) {
		setRange(min, max);
	}
	
	//Getter method
	public int getRange() { 
		return range;
	}
	
	//Setter method
	public void setRange(int min, int max) {
		this.min = min;
		this.max = max;
		this.range = max - min;
	}
	
	//Returns double random number in specified range 
	public double nextValue() {
		Random generator = new Random();
		double randomDouble = (generator.nextDouble()* range) + min;
		return randomDouble;
	}
	
	//Returns an int random number in specified range 
	public int nextValueInt() {
		Random generator = new Random();
		int randomInt = generator.nextInt(range) + min;
		return randomInt;
		 
	}

}


