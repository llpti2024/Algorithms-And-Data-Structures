package dataStructure.linkedList;

import java.util.LinkedList;

public class DataStructureLinkedList {
	public static void main ( String[] args ) {

		/*
		*LinkedList = stores Nodes in 2 parts (data + address)
		*                   Nodes are in non-consecutive memory locations
		*                   Elements are linked using pointers.
		*
		*                                                Single Linked List
		*                                Node                 Node                Node
		*                         [data|address] -> [data|address] ->[data|address]
		*
		*                                                Double Linked List
		*                                           Node                    Node
		*                                     [data|address] <--> [data|address]
		*
		*                   Advantages?
		*                   1. Dynamic data structure. (Allocates needed memory while running)
		*                   2. Insertion and Deletion of Nodes is easy. 0(1)
		*                   3. No/Low Memory waste.
		* *
		*                    Disadvantages?
		 *                   1. Greater memory usage (additional pointers)
		 *                   2. No random access of elements( no  index [i] )
		 *                   3. Accessing/Searching elements is slow.
		 *
		 *                  Uses?
		 *                  1. implementation of stacks and queues
		*                   2. GPS navigation
		*                   3. music playlist.
	    *
		* LinkedList is a linear data structure. Can be organized in different ways. And Add and Remove elements in different ways.
		* LinkedList its possible add between the elements using an index or using a value.
		* When used Push Organized the first element at the last position, and the last element at the first position.
		* When used offer Organized the first element at the first position, and the last element at the last position.
		* Linked Lists allocated in memory as a chain of nodes. One first node and one last node.
		* LinkedList implements List, Deque, Cloneable, Serializable.
		* Deque is another whole data structure, it is a double ended queue and have twelve methods. Add the Head and Tail, and remove head and tail. Some have Exceptions, some don't.
		*  LinkedList have some methods:
		* addFirst() and addLast()             =====    offerFirst() and offerLast()
		* removeFirst() and removeLast()   =====    pollFirst() and pollLast()
		* getFirst() and getLast()                =====    peekFirst() and peekLast()
		*
		* push() — add a new object
		* pop() — remove the last object
		* peek() — return the last object
		* */


		/*
		 * @print for separation and tell what Queue is.
		 * */
		System.out.println ( );
		System.out.println ( " Organized with LinkedList and Push" );
		System.out.println ( "////////////////////////////////////////////////////" );
		System.out.println ( );

  /*
  * @Message : Create an empty linked list
  * @Generics < String > define the type of the linked list.
  * */
		LinkedList < String > linkedListPush= new LinkedList <> (  );


		/*
		* @push() — add a new object The first element is at the last position, and the last element is at the first position.
		 */
		linkedListPush.push ( "A" );
		linkedListPush.push ( "B" );
		linkedListPush.push ( "C" );
		linkedListPush.push ( "D" );
		linkedListPush.push ( "E" );
		linkedListPush.push ( "F" );

		/*
		* @print the organization of LinkedList is.
		* */
		System.out.println (linkedListPush );



		/*
		* @pop() — remove the last object first.
		 * */
		linkedListPush.pop ();

		/*
		 * @print the organization of LinkedList after a remove the last object.
		 * */
		System.out.println (linkedListPush );




		/*
		 * @print for separation and tell what Queue is.
		 * */
		System.out.println ( );
		System.out.println ( " Organized with LinkedList and Offer" );
		System.out.println ( "////////////////////////////////////////////////////" );
		System.out.println ( );




		/*
		 * @Message : Create an empty linked list
		 * @Generics < String > define the type of the linked list.
		 * */
		LinkedList < String > linkedListOffer = new LinkedList <> (  );


		/*
		 * @offer() — add a new object The first element continues at the first, and the last go to the last position.
		 */
		linkedListOffer.offer ( "A" );
		linkedListOffer.offer ( "B" );
		linkedListOffer.offer ( "C" );
		linkedListOffer.offer ( "D" );
		linkedListOffer.offer ( "F" );
		linkedListOffer.offer ( "G" );

		/*
		 * @print the organization of LinkedList is.
		 * */
		System.out.println (linkedListOffer );

		/*
		 *@indexOf() — return the index of the object in the LinkedList.
		 *
		 * */
		System.out.println("Where is the position of the object 'D': " + linkedListOffer.indexOf("D"));  //When found the object return the index.
		System.out.println ("Where is the position of the object 'E': " + linkedListOffer.indexOf("E") + "  (if the object is not found return '-1')"); //When not found the object return -1.
		System.out.println (linkedListOffer );

		/*
		* @peekFirst() — return the first object
		* */
		System.out.println ("The first object is: " + linkedListOffer.peekFirst() + "  (if the LinkedList is empty return null)" );  //Return null when is empty.

		/*
		* @peekLast() — return the last object
		* */
		System.out.println ("The last object is: " + linkedListOffer.peekLast() + "  (if the LinkedList is empty return null)" );    //Return null when is empty.
		System.out.println (linkedListOffer );

		/*
		 * @add() — add a new object. Between the elements using an index and using a value.
		 * */
		linkedListOffer.add(4,"E");
		

		/*
		 * @print the organization of LinkedList after add the object is.
		 * */
		System.out.println (linkedListOffer );

		/*
		* addFirst() — add a new object at the first position.
		* addLast() — add a new object at the last position.
		* */
		linkedListOffer.addFirst("0");
		linkedListOffer.addLast("H");
		System.out.println (linkedListOffer );

		/*
		*@variable removeFirst and removeLast to remove the first and last object.
		* @removeFirst() — remove the first object first.
		* @removeLast() — remove the last object first.
		 */

		String removeFirst = linkedListOffer.removeFirst();
		String removeLast = linkedListOffer.removeLast();
		System.out.println("  Removing the first object --  " + removeFirst);
		System.out.println( "  Removing the last object --  " + removeLast);
		System.out.println (linkedListOffer );


		/*
		 * @remove() — remove a new object. Between the elements using a value.
		 * */
		linkedListOffer.remove("E");

		/*
		 * @print the organization of LinkedList after a remove the object is.
		 * */
		System.out.println (linkedListOffer );

		/*
		 * @poll() — remove the first object first.
		 * */
		linkedListOffer.poll ();

		/*
		 * @print the organization of LinkedList after a remove the first object.
		 * */
		System.out.println (linkedListOffer );




	}
}
