package algorithms.linearsearch;

public class AlgorithmsLinearSearch {
	public static void main ( String[] args ) {

		//      Linear Search = Iterate through a collection one element ar a time.
		//
		//                               runtime complexity: O(n)
		//
		//                               Disadvantages:
		//                               1. Slow for large data sets.
		//
		//                               Advantages:
		//                               1. Fast for searches of small to medium data sets.
		//                               2. Does not need to sorted
		//                               3. Useful for small data structures that do not have random access (Linked
		//                               Lists)
		//
		//
		int[] array = { 6 , 9 , 8 , 2 , 7 , 3 , 1, 4 , 5 };
		int index = linearSearch ( array ,
		                           1 );
		  if(index != -1){
		      System.out.println("Element found at an index: " + index);
		  } else{
			  System.out.println ("Element not found" );
			  
		  }

	}

	private static int linearSearch ( int[] array , int value ) {
		for ( int i = 0 ; i < array.length ; i++ ) {
			if ( array[ i ] == value ) {
				return i;
			}

		}
		return 0;
	}
}
