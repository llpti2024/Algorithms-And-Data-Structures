package dataStructure.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class DataStructureQueue {
	public static void main ( String[] args ) {

		/*
		* Queue: FIFO (First In First Out); Store objects into a sort of “Horizontal tower”.
		* A collection designed for holding elements before being processed.
		*   Insert   --    add()     =  enqueue(), offer()
		* Remove --  remove()  =  dequeue(), poll()
		* Examine --  element() =  peek()
		* add(), remove(), element() will be happen an Exception if the queue is empty.
		* offer(), poll(), peek() only will be happen an Exception if the queue is full.
		* Queue is an interface, and we cannot instantiate an object from it, because this use 'LinkedList' or 'PriorityQueue' as an implementation.
		* */

		/*
		* Queue class extends Collections and its possible implements a lot of functions from Collections.
		* isEmpty()  its possible to check if the queue is empty.
		* size()     its possible to get the size of the queue.
		* contains() its possible to check if the queue contains an element.
		* */

	    //   Where are queues useful?
		//
		//   1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
		//   2. Printer Queue (Print jobs should be completed in order)
		//   3. Used in LinkedLists, PriorityQueues and Breadth First Search algorithms.

		/*
		 * @Message : Create an empty queue using LinkedList
		 *  */
		Queue<String> queue = new LinkedList <String> ( );

		/*
		* @isEmpty() — check if the queue is empty
		* */
		System.out.println ("The queue is empty:  " + queue.isEmpty ( ) );

		/*
		 * @offer() — add a new object to the queue
		 * @Message will use a name of people to simulate a straight line of people entering the queue for a payment.
		 * */
		queue.offer ( "Antonieta" );
		queue.offer ( "Lucas" );
		queue.offer ( "Gabriel" );
		queue.offer ( "Paulo" );
		queue.offer ( "Suzana" );
		queue.offer ( "Caneo" );
		queue.offer ( "Alica" );
		queue.offer ( "Andrea" );

		/*
		 * @isEmpty() — check if the queue is empty
		 * */
		System.out.println ("The queue is empty:  " + queue.isEmpty ( ) );

		/*
		* @size() — get the size of the queue
		* */
		System.out.println ("The size of the queue is:  " + queue.size ());

		/*
		* @contains() — check if the queue contains an element
		* */

		System.out.println ("The queue contains the name 'Lucas':  " + queue.contains ( "Lucas" ) );

		/*
		 *@println() — print the queue.peek()
		 *@peek() — return the FIRST people from the queue to do the payment but does remove it.
		 */
		System.out.println ( "The first name from the line is: " + queue.peek ( ) );


		/*
		 * @println() — print the straight line of people or our queue.
		 * */
		System.out.println (queue );

		/*
		* @poll() — remove the FIRST object (String) from the queue.
		* */
		queue.poll ( );

		/*
		* @println() — print the straight line after a remove the FIRST people or our queue.
		* */
		System.out.println (queue );

		/*
		 * @poll() — remove the FIRST object (String) from the queue.
		 * */
		queue.poll ( );

		/*
		 * @println() — print the straight line after a remove the FIRST people or our queue.
		 * */
		System.out.println (queue );

		/*
		 * @poll() — remove the FIRST object (String) from the queue.
		 * */
		queue.poll ( );

		/*
		 * @println() — print the straight line after a remove the FIRST people or our queue.
		 * */
		System.out.println (queue );

		/*
		 * @poll() — remove the FIRST object (String) from the queue.
		 * */
		queue.poll ( );

		/*
		 * @println() — print the straight line after a remove the FIRST people or our queue.
		 * */
		System.out.println (queue );

		/*
		 * @poll() — remove the FIRST object (String) from the queue.
		 * */
		queue.poll ( );

		/*
		 * @println() — print the straight line after a remove the FIRST people or our queue.
		 * */
		System.out.println (queue );

		/*
		 * @poll() — remove the FIRST object (String) from the queue.
		 * */
		queue.poll ( );

		/*
		 * @println() — print the straight line after a remove the FIRST people or our queue.
		 * */
		System.out.println (queue );

		/*
		 * @poll() — remove the FIRST object (String) from the queue.
		 * */
		queue.poll ( );

		/*
		 * @println() — print the straight line after a remove the FIRST people or our queue.
		 * */
		System.out.println (queue );

		/*
		 * @poll() — remove the FIRST object (String) from the queue.
		 * */
		queue.poll ( );

		/*
		 * @println() — print the straight line after a remove the FIRST people or our queue.
		 * */
		System.out.println (queue );

		////////////////////////////////////////////////////////////////////////////////////////////////////////
		//@Message using poll() after queue is empty will continue print and don't happen an Exception.
		///////////////////////////////////////////////////////////////////////////////////////////////////////

		/*
		* @return only the empty queue.
		* */
		queue.poll ( );
		System.out.println (queue );

		///////////////////////////////////////////////////////////////////////////////////
		//@Message  using element() after queue is empty will happen an Exception.
		//@Return @Exception java.util.NoSuchElementException
		//@try-catch to handle an Exception.
		//////////////////////////////////////////////////////////////////////////////////

		try{
			queue.element ();
		} catch ( NoSuchElementException e ){
			System.out.println ("The queue is empty and happen an Exception:  " + e );
		}


		//Working with loops

		/*
		 * @Message : Create an empty priority queue
		 * */
		Queue<Double> queueDouble = new LinkedList <> ( );

		/*
		 * @offer() — add a new object to the queue
		 * */
		queueDouble.offer ( 3.0 ) ;
		queueDouble.offer ( 1.0 ) ;
		queueDouble.offer ( 2.0 ) ;
		queueDouble.offer ( 4.0 ) ;


		/*
		 * @While a loop with the condition that the queue is not empty will  be executed a poll().
		 * */
		while(!queueDouble.isEmpty ()) {
			/*
			 * @println()  @poll()— print the queue and remove the first element
			 * */
			System.out.println (queueDouble.poll () );
		}
		



		
		
	}
}
