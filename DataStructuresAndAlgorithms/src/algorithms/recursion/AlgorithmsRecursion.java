package algorithms.recursion;
//
//  Recursion = When a thing is defined in itself. - MediaWiki
//                     Apply the result of a procedure, to a procedure.
//                     A recursive method calls itself. Can be substituted for iteration.
//                     Divide a problem into sub-problems of the same type as the original.
//                      Commonly used with advanced sorting algorithms and navigating trees.
//
//                    Advantages:
//                    1. Easy to implement.
//                    2. Easy to understand.
//                    3. Easy to debug.
//
//                    Disadvantages:
//                    1. Can be slow.
//                    2. uses more memory.
//

// this is a Call Stack
public class AlgorithmsRecursion {

	public static void main ( String[] args ) {
		//EASY
		walk ( 5 );
		
		//MEDIUM
		System.out.println ( "Factorial of the number 7 is: " + numberToFactorial ( 7 ) );

		//Hard
		System.out.println ("The Powe of 2 to the power of 8 is: " +    power ( 2,8 ) );
	}

	//EASY
	private static void walk ( int steps ) {
		if ( steps < 1 ) {
			return;    //base case
		}
		System.out.println ( "You take a step!" );
		walk ( steps - 1 );  //recursive case
	}

	//medium
	private static int numberToFactorial ( int factorial ) {
		if ( factorial < 1 ) {
			return 1;    //base case
		}
		return factorial * numberToFactorial ( factorial - 1 ); //recursive case
	}

	//HARD
	private static int power ( int base , int exponent ) {
		if ( exponent < 1 ) return 1;       //base case
			return base * power ( base ,
			                      exponent - 1 );    //recursive case


	}
}
