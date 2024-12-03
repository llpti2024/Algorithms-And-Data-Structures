package algorithms.binarySearch;


public class AlgorithmsBinarySearch {

	// Binary Search = Search algorithm that finds the position
	//                        of a target value within a sorted array.
	//                        Half of the array is eliminated during each “step”.
	//                        The time complexity of Binary Search is O(log n)

	public static void main ( String[] args ) {

		int array[] = new int[ 1000000 ];
		int target = 789504;
		for ( int i = 0 ; i < array.length ; i++ ) {
			array[ i ] = i;
		}

		// int index Arrays.binarySearch(array, target);
		int index = binarySearch ( array ,
		                           target );
		if ( index != - 1 ) {
			System.out.println ( "Element found at an index: " + index );
		}
		else {
			System.out.println ( "Element not found" );
		}

	}

	private static int binarySearch ( int[] array , int target ) {
		int low = 0;
		int high = array.length - 1;
		while ( low <= high ) {
			int middle = low + ( high - low ) / 2;
			int value = array[ middle ];
			System.out.println ( "midle: " + value );
			if ( value < target ) {
				low = middle + 1;
			}
			else if ( value > target ) {
				high = middle - 1;
			}
			else {
				return middle; //target is found
			}
		}
		return 0;
	}

}