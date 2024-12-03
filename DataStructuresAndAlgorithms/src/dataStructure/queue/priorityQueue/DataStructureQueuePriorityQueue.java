package dataStructure.queue.priorityQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DataStructureQueuePriorityQueue {
	public static void main ( String[] args ) {

		/*
		 * Priority Queue = FIFO (First In First Out); data structure that serves elements.
		 *                          With the highest priority first.
		 *                          Before elements with lower priority.
		 * */

		/*
		 * @Message : Create an empty priority queue
		 * */
		Queue < Double > queueLinkedList = new LinkedList <> ( );

		/*
		 * @offer() — add a new object to the queue
		 * */
		queueLinkedList.offer ( 3.0 );
		queueLinkedList.offer ( 1.0 );
		queueLinkedList.offer ( 2.0 );
		queueLinkedList.offer ( 4.0 );


		/*
		 * @print for separation and tell what Queue is.
		 * */
		System.out.println ( );
		System.out.println ( "             Organized with LinkedList" );
		System.out.println ( "////////////////////////////////////////////////////" );
		System.out.println ( );
		/*
		 * @While a loop with the condition that the queue is not empty will  be executed a poll().
		 * */
		while ( ! queueLinkedList.isEmpty ( ) ) {
			/*
			 * @println()  @poll()— print the queue and remove the first element
			 * */
			System.out.println ( queueLinkedList.poll ( ) );
		}







		/*
		 * @print for separation and tell what Queue is.
		 * */
		System.out.println ( );
		System.out.println ( "             Organized with PriorityQueue" );
		System.out.println ( "////////////////////////////////////////////////////" );
		System.out.println ( );
		/*
		 * @Message : Create an empty priority queue
		 * */
		Queue < Double > queuePriority = new PriorityQueue <> ( );

		/*
		 * @offer() — add a new object to the queue
		 * */
		queuePriority.offer ( 3.0 );
		queuePriority.offer ( 1.0 );
		queuePriority.offer ( 2.0 );
		queuePriority.offer ( 4.0 );


		/*
		 * @While a loop with the condition that the queue is not empty will  be executed a poll().
		 * */
		while ( ! queuePriority.isEmpty ( ) ) {
			/*
			 * @println()  @poll()— print the queue and remove the first element
			 * */
			System.out.println ( queuePriority.poll ( ) );
		}




		/*
		 * @print for separation and tell what Queue is.
		 * */
		System.out.println ( );
		System.out.println ( "Organized with PriorityQueue with Collections ReverseOrder" );
		System.out.println ( "//////////////////////////////////////////////////////////////////////////" );
		System.out.println ( );
		/*
		 * @Message : Create an empty priority queue with Collections ReverseOrder
		 * ReverseOrder() reverse the order of the elements.
		 * */
		Queue < Double > queuePriorityCollections = new PriorityQueue <> ( Collections.reverseOrder ( ) );

		/*
		 * @offer() — add a new object to the queue
		 * */
		queuePriorityCollections.offer ( 3.0 );
		queuePriorityCollections.offer ( 1.0 );
		queuePriorityCollections.offer ( 2.0 );
		queuePriorityCollections.offer ( 4.0 );


		/*
		 * @While a loop with the condition that the queue is not empty will  be executed a poll().
		 * */
		while ( ! queuePriorityCollections.isEmpty ( ) ) {
			/*
			 * @println()  @poll()— print the queue and remove the first element
			 * */
			System.out.println ( queuePriorityCollections.poll ( ) );
		}








	}
}
