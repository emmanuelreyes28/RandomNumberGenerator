// this class tests the randomNumberGenerator class 
public class randomNumberGeneratorTester {
	public static void main(String args[]) {
		randomNumberGenerator testRange = new randomNumberGenerator();
		System.out.println("Default range is: (0,100) ");
		//System.out.println(testRange.getRange()); //prints 100
		System.out.print("Double random number in the specified range: ");
		System.out.println(testRange.nextValue());
		System.out.print("Int random number in specified range: ");
		System.out.println(testRange.nextValueInt());
		
		System.out.println(" ");

		randomNumberGenerator testRange2 = new randomNumberGenerator(10,15);
		System.out.println("Range is: (10,15)");
		//System.out.println(testRange2.getRange()); //prints 5 
		System.out.print("Double random number in the specified range: ");
		System.out.println(testRange2.nextValue());
		System.out.print("Int random number in specified range: ");
		System.out.println(testRange2.nextValueInt());
		
		//System.out.println(" ");
		
		System.out.println("Set new range: (1,4)");
		testRange2.setRange(1, 4); //set new range 
		//System.out.println(testRange2.getRange()); //prints 3
		System.out.print("Double random number in the specified range: ");
		System.out.println(testRange2.nextValue());
		System.out.print("Int random number in specified range: ");
		System.out.println(testRange2.nextValueInt());
		
		System.out.println("");
		
		randomNumberGenerator testRange3 = new randomNumberGenerator(60,70);
		System.out.println("Range is: (60,70)");
		//System.out.println(testRange3.getRange()); //prints 10
		System.out.print("Double random number in the specified range: ");
		System.out.println(testRange3.nextValue());
		System.out.print("Int random number in specified range: ");
		System.out.println(testRange3.nextValueInt());
		
		System.out.println("");
		
		randomNumberGenerator testRange4 = new randomNumberGenerator(1,2);
		System.out.println("Range is: (1,2)");
		//System.out.println(testRange4.getRange()); //prints 1
		System.out.print("Double random number in the specified range: ");
		System.out.println(testRange4.nextValue());
		System.out.print("Int random number in specified range: ");
		System.out.println(testRange4.nextValueInt());
		
	}


}
