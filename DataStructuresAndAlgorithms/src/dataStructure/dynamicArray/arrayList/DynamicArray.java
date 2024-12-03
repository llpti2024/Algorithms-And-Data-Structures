package dataStructure.dynamicArray.arrayList;

public class DynamicArray {
	/*
	 * @variable size - size of the array.
	 * @variable capacity - capacity of the array.
	 * @variable array - array of objects.
	 *
	 * */

	int size;
	int capacity = 10;
	Object[] array;

	/*
	 * @constructor created a first new Object array with the capacity
	 * */
	public DynamicArray ( ) {
		this.array = new Object[ capacity ];
	}

	/*
	 * @constructor @overload created a new Object array with obligated estimated capacity.
	 * */
	public DynamicArray ( int capacity ) {
		this.capacity = capacity;
		this.array = new Object[ capacity ];
	}

	/*
	 * @add() — add a new object to the array.
	 * @if or else will return when size is less or equal to capacity grow the array otherwise add one more object to
	 * the array with the size equal a data
	 * */
	public void add ( Object data ) {
		if ( size >= capacity ) {
			grow ( );
		}
		else {
			array[ size ] = data;
			size++;
		}
	}

	/*
	 * @insert() — insert a new object to the array.
	 *  When size is less or equal to capacity grow the array otherwise add one more object to the array with the size
	 *  equal a data.
	 * */
	public void insert ( int index , Object data ) {
		if ( size >= capacity ) {
			grow ( );
		}
		for ( int i = size ; i > index ; i-- ) {
			array[ i ] = array[ i - 1 ];
		}
		array[ index ] = data;
		size++;
	}

	/*
	 * @remove() — remove a object from the array.
	 *
	 * */
	public void delete ( Object data ) {
		for ( int i = 0 ; i < size ; i++ ) {
			if ( array[ i ].equals ( data ) ) {
				for ( int j = 0 ; j < ( size - i - 1 ) ; j++ ) {
					array[ i + j ] = array[ i + j + 1 ];
				}
				array[ size - 1 ] = null;
				size--;
				if ( size <= ( int ) ( capacity / 3 ) ) {
					shrink ( );
				}

			}
		}
	}

	/*
	 * @search() — search a object in the array.
	 *
	 * */
	public int search ( Object data ) {
		for ( int i = 0 ; i < size ; i++ ) {
			if ( array[ i ].equals ( data ) ) {
				return i;
			}
		}
		return - 1;

	}

	/*
	 * @grow() — increase the capacity of the array
	 *
	 * */
	private void grow ( ) {
		int newCapacity = ( int ) ( capacity * 2 );
		Object[] newArray = new Object[ newCapacity ];
		for ( int i = 0 ; i < size ; i++ ) {
			newArray[ i ] = array[ i ];
		}
		array = newArray;
		capacity = newCapacity;
	}

	/*
	 * @shrink() — decrease the capacity of the array
	 *
	 * */
	private void shrink ( ) {
		int newCapacity = ( int ) ( capacity / 2 );
		Object[] newArray = new Object[ newCapacity ];
		for ( int i = 0 ; i < size ; i++ ) {
			newArray[ i ] = array[ i ];
		}
		array = newArray;
		capacity = newCapacity;

	}

	/*
	 * @empty() — check if the array is empty
	 *
	 * */
	public boolean isEmpty ( ) {
		return size == 0;
	}

	/*
	 * @ toString() — construct what you will see in the console whe you print the array
	 *  @for created a loop to add a space after each object.
	 * @if or else will return when size is less or equal to capacity grow the array otherwise add one more object to
	 * the array with the size equal a data.
	 * @for you can change inside and when is  size show only the objects with value
	 * and
	 * when is capacity and will return the array complete with positions with value and positions without value(null).
	 * */
	public String toString ( ) {

		String string = "";

		//  for(int i = 0; i < size; i++) { }

		for ( int i = 0 ; i < capacity ; i++ ) {
			string += array[ i ] + ", ";
		}
		if ( string != "" ) {
			string = "[" + string.substring ( 0 ,
			                                  string.length ( ) - 2 ) + "]";
		}
		else {
			string = "[]";
		}
		return string;
	}

}
