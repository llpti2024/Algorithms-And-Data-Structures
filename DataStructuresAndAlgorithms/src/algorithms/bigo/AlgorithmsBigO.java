package algorithms.bigo;



public class AlgorithmsBigO {
	public static void main ( String[] args ) {

		//  O(1) = constant time
		// - random access of elements in a array
		// – inserting at the beginning of linked list.

		//  O(log n) = logarithmic time
		// – binary search algorithm

		//  O(n) = linear time
		// - looping thought elements in an array
		// – searching through a linked list.

		//  O(n log n) = quasi-linear time
		// – quicksort algorithm
		// – merge sort algorithm
		// – heap sort algorithm.

		//  O(n^2) = quadratic time
		//  - insertion sort algorithm
		//  – selection sort algorithm
		// – bubble sort algorithm.

		//  O(n!) = factorial time
		//  - Traveling Salesman Problem
		

	}

	//  Linear Time - 1 Loop
	//Calculate O(n) time complexity
	//
	int addUp ( int n ) {
		int sum = 0;
		for ( int i = 1 ; i <= n ; i++ ) {
			sum += i;
		}
		return sum;
	}

	//Exemple n = 1000000 ~ 1000000 steps




	//
	// Calculate O(1) time complexity
	//
	int addUp1 ( int n ) {
		return n * ( n + 1 ) / 2;
	}
	//O(1) : Constant Time - No Loops
	public void choosePrint ( int[] lst ) {
		System.out.println(lst[0]);
	}


	//Exemple n = 1000000 ~ 3 steps

	//
	//Calculate O(n^2) time complexity
	//
	int addUp2 ( int n ) {
		int sum = 0;
		for ( int i = 1 ; i <= n ; i++ ) {
			for ( int j = 1 ; j <= n ; j++ ) {
				sum += i * j;
			}
		}
		return sum;
	}

	//
	// O(log n) : Logarithmic Time - Usually searching algorithms have log n if they are sorted (Binary Search)
	//
	public int binary_search ( int[] lst , int target ) {
		return 0;
	}

	//
	//   O(n log n) : Log Linear Time - Usually sorting operations
	//
	public int[] merge_sort(int[] lst) {
		if (lst.length < 2) {
			return lst;
		}
		int mid = lst.length / 2;
		int[] left = new int[mid];
		int[] right = new int[lst.length - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = lst[i];
		}
		for (int i = mid; i < lst.length; i++) {
			right[i - mid] = lst[i];
		}
		left = merge_sort(left);
		right = merge_sort(right);
		return merge(left, right);
	}

	public int[] merge(int[] left, int[] right) {
		int[] result = new int[ left.length + right.length ];
		int i = 0, j = 0, k = 0;
		while ( i < left.length && j < right.length ) {
			if ( left[ i ] <= right[ j ] ) {
				result[ k++ ] = left[ i++ ];
			}
			else {
				result[ k++ ] = right[ j++ ];
			}
		}
		while ( i < left.length ) {
			result[ k++ ] = left[ i++ ];
		}
		while ( j < right.length ) {
			result[ k++ ] = right[ j++ ];
		}
		return result;
	}


	//
//O(2^n) : Exponential Time - Usually recursive algorithms that solves a problem of size N
//
		public int fibonacci(int n) {
			if (n == 0) {
				return 0;
			} else if (n == 1) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		}

		//
//O(n!) : Factorial Time - Usually recursive algorithms that solves a problem of size N
//
		public int permutation(int[] lst, int k) {
			if (k == 1) {
				return 1;
			} else {
				return k * permutation(lst, k - 1);
			}
		}

}
