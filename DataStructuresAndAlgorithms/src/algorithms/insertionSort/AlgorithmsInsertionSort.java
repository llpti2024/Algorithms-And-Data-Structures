package algorithms.insertionSort;

public class AlgorithmsInsertionSort {

	//  Insertion Sort = after comparing elements to the left
	//                          shift elements to the right to make room to insert a value
	//
	//                          Quadratic time O(n^2)
	//                          small data set = okay
	//                           large data set = bad
	//
	//                           Less step than Bubble Sort
	//                           Best cas is O(n) compared to Selection Sort of O(n^2)

	public static void main ( String[] args ) {

	int[]   array = { 9 , 1 , 8 , 2 , 7 , 3 , 6 , 4 , 5 };
	insertionSort ( array );
	for(int i : array) {
		System.out.println ( i );
	}

	}


private static void insertionSort ( int[] array ) {

	for ( int i = 1 ; i < array.length ; i++ ) {
		int temp = array[ i ];
		int j = i - 1;
		while ( j >= 0 && array[ j ] > temp ) {
			array[ j + 1 ] = array[ j ];
			j--;
		}
		array[ j + 1 ] = temp;
	}
}



}
