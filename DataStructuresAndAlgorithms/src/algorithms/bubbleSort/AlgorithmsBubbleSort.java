package algorithms.bubbleSort;

public class AlgorithmsBubbleSort {


	//      Bubble Sort = pairs of adjacent elements are compared, and the elements are
	//                             swapped if they are in the wrong order.
	//
	//                             Quadratic Time - O(n^2)
	//                              Small data sets. = okay
	//                              Large data sets. = bad.
	//


	public static void main ( String[] args ) {

		int array[] = { 9 , 1 , 8 , 2 , 7 , 3 , 6 , 4 , 5 };

		bubbleSort ( array );
		for ( int i: array) {
			System.out.println ( array[ i ] );
		}
	}
	



	  public static void bubbleSort ( int array[] ) {
		  for ( int i = 0 ; i < array.length -1 ; i++ ) {
			  for ( int j = 0 ; j < array.length - 1 ; j++ ) {
				  if ( array[ j ] > array[ j + 1 ] ) {
					  int temp = array[ j + 1 ];
					  array[ j + 1 ] = array[ j ];
					  array[ j ] = temp;
				  }
			  }
		  }
	  }
}
