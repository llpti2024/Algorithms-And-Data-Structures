package dataStructure.dynamicArray.arrayList;

import java.util.ArrayList;

public class DataStructureArrayList {
	public static void main ( String[] args ) {

		//
		//
		//
		//
		//

		/*
		 * @Message : Create an empty DynamicArray with stipulated capacity.
		 * */
		DynamicArray dinamicArray = new DynamicArray ( 5 );
		/*
		 * @capacity — capacity of the ArrayList
		 * */
		System.out.println ( dinamicArray.capacity );

		/*
		 * @Message : Create an empty DynamicArray without stipulated capacity.
		 * @add some strings using the add() method and print the ArrayList with our toString() method.
		 * @size() method return the size of the ArrayList.
		 * @insert some strings using index and value with the insert() method and print the ArrayList with our
		 * toString() method.
		 * @capacity() method return the capacity of the ArrayList.
		 * @remove some strings using the delete() method and print the ArrayList with our toString() method.
		 * @isEmpty() method check if the ArrayList is empty.
		 * */
		DynamicArray dinamicArray2 = new DynamicArray ( );

		dinamicArray2.add ( "A" );
		dinamicArray2.add ( "B" );
		dinamicArray2.add ( "C" );
		System.out.println ( dinamicArray2 );
		System.out.println ( );


		dinamicArray2.insert ( 0 ,
		                       "X" );
		System.out.println ( dinamicArray2 );
		System.out.println ( );


		System.out.println ( "size: " + dinamicArray2.size );
		System.out.println ( "Capacity: " + dinamicArray2.capacity );
		System.out.println ( );


		//Showing the grow method work
		////////////////////////////////////////
		dinamicArray2.add ( "D" );
		dinamicArray2.add ( "E" );
		dinamicArray2.add ( "F" );
		dinamicArray2.add ( "G" );
		dinamicArray2.add ( "H" );
		dinamicArray2.add ( "I" );
		dinamicArray2.add ( "J" );
		dinamicArray2.add ( "K" );
		dinamicArray2.add ( "L" );
		System.out.println ( dinamicArray2 );
		System.out.println ( "size: " + dinamicArray2.size );
		System.out.println ( "Capacity: " + dinamicArray2.capacity );
		System.out.println ( );


		//Showing the shrink method work
		dinamicArray2.delete ( "A" );
		dinamicArray2.delete ( "B" );
		dinamicArray2.delete ( "C" );
		dinamicArray2.delete ( "D" );
		dinamicArray2.delete ( "E" );
		dinamicArray2.delete ( "F" );
		dinamicArray2.delete ( "G" );
		dinamicArray2.delete ( "H" );
		dinamicArray2.delete ( "I" );
		dinamicArray2.delete ( "J" );
		dinamicArray2.delete ( "K" );
		dinamicArray2.delete ( "L" );
		System.out.println ( dinamicArray2 );
		System.out.println ( "size: " + dinamicArray2.size );
		System.out.println ( "Capacity: " + dinamicArray2.capacity );
		System.out.println ( );


		System.out.println ( "empty array: " + dinamicArray2.isEmpty ( ) );
		System.out.println ( );


		System.out.println ( "Search' A ':  " + dinamicArray2.search ( "A" ) );  //Return -1 because the array doesn't
		// found the element


		System.out.println ( "Search ' X ':  " + dinamicArray2.search ( "X" ) );
		System.out.println ( );//Return 0 because the index 0 is found the element


		dinamicArray2.insert ( 1 ,
		                       "B" );
		System.out.println ( "Search ' B ':  " + dinamicArray2.search ( "B" ) );  //Return 1 because the index 1 is
		// found the element
		System.out.println ( );


		//I will force an exception to show whats happened when you put a value out of range. And will use try-catch
		// to show the error.
		//You will create an Exception because the index 3 is out of range. You can put the element in the index 3,
		// but you can't find it when you search.
		dinamicArray2.insert ( 3 ,
		                       "C" );
		try {
			System.out.println ( "Search ' C ':  " + dinamicArray2.search ( "C" ) );  //Return Nullpointer because the
			// index 2 is null, and you can't find index 3 it when you search.
		} catch ( NullPointerException e ) {
			System.out.println ( "Nullpointer because the index 2 is null, and you can't find index 3 it when you " +
					                     "search." + e.getMessage ( ) );
		}


		/*
		 * @Message : Create an empty ArrayList
		 * */
		ArrayList < String > list = new ArrayList < String > ( );


	}
}
