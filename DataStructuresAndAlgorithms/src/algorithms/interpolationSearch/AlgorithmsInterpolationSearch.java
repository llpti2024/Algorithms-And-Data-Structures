package algorithms.interpolationSearch;

public class AlgorithmsInterpolationSearch {
	//Interpolation Search = improvement over binary search best used for "uniformly” distributed data.
	//                                  “Guesses” where a value might be based on calculated probe results
	//                                   if probe is incorrect, we narrow the search area and try again.
   //
	//                                    Average case: O(log (log (n)))
	//                                    worst case: O(n) [ values increase exponentially]

	public static void main ( String[] args ) {

		int[] array = {1,2,4,8,32767,32,64,128,256,512,32704,2048,4096,8192,16384,32768,65536};
		int  index = interpolationSearch(array, 32768);
		if(index != -1){
			System.out.println("Element found at an index: " + index);
		} else{
			System.out.println ("Element not found" );
		}

	}
	private static int interpolationSearch(int[] array, int value) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high && value >= array[low] && value <= array[high]) {
		       //Decorated this formula
			int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
			System.out.println ("probe: "+ probe );
			if (array[probe] == value) {
				return probe;
			} else if (array[probe] < value) {
				low = probe + 1;
			} else {
				high = probe - 1;
			}
		}
		return -1;
	}
}
