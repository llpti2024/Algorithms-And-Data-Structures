package algorithms.mergeSort;

public class AlgorithmsMergeSort {

	//
	//   merge-sort = recursively divide array in 2, sort , re-combine
	//
	//  run-time complexity = O(n log n)
	//
	//   space complexity = O(n)
	//
	//

	public static void main ( String[] args ) {

		int[] array = { 9 , 1 , 8 , 2 , 7 , 3 , 6 , 4 , 5 };
		mergeSort ( array );

		for ( int i =0  ; i < array.length ; i++ ) {
			System.out.print ( array[ i ] + " " );


		}
	}

		private static void mergeSort ( int[] array ){
			        int length = array.length;
			if ( length <=1 )
				return;    //base case

			int mid = length / 2;
			int[] left = new int[mid];
			int[] right = new int[length - mid];

			int i=0;  //left
			int j=0;  //right

			for ( ; i < length ; i++ ) {
				if ( i < mid ) {
					left[ i ] = array[ i ];
				}
				else {
					right[ j ] = array[ i ];
					j++;
				}
			}
				mergeSort ( left );
				mergeSort ( right );
				merge ( left ,
				        right ,
				        array );

		}

		private static void merge ( int[] left, int[] right, int[] array ){
			 int leftSize = array.length / 2;
			 int rightSize = array.length - leftSize;
			  //indices
			 int i = 0;
			 int l= 0;
			 int r = 0;
			 //check the condition for merging
			  while( l < leftSize && r < rightSize ) {
				if ( left[ l ] < right[ r ] ) {
					array[ i ] = left[ l ];
					i++;
					l++;
				} else {
					array[ i ] = right[ r ];
					i++;
					r++;
				}

			  }
			  while(l<leftSize) {
				  array[ i ] = left[ l ];
				  i++;
				  l++;
			  }    while(r<rightSize) {
				  array[ i ] = right[ r ];
				  i++;
				  r++;
			  }
			}
		}
