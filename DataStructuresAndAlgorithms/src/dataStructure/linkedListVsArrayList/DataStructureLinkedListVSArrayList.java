package dataStructure.linkedListVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class compares the performance of LinkedList and ArrayList in Java.
 * It measures the time taken to add 10 million elements to each data structure.
 */
public class DataStructureLinkedListVSArrayList {
	public static void main(String[] args) {
		// Create a LinkedList to store integers
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Create an ArrayList to store integers
		ArrayList<Integer> arrayList = new ArrayList<>();

		// Variables to store the start and end times of the operations
		long startTime;
		long endTime;

		// Add 10 million elements to the LinkedList
		startTime = System.nanoTime(); // Record the start time
		for (int i = 0; i < 10000000; i++) {
			linkedList.add(i); // Add each element to the LinkedList
		}
		endTime = System.nanoTime(); // Record the end time
		System.out.println("Time to add 10,000,000 elements to the LinkedList: " + (endTime - startTime) + " nanoseconds");

		// Add 10 million elements to the ArrayList
		startTime = System.nanoTime(); // Record the start time
		for (int i = 0; i < 10000000; i++) {
			arrayList.add(i); // Add each element to the ArrayList
		}
		endTime = System.nanoTime(); // Record the end time
		System.out.println("Time to add 10,000,000 elements to the ArrayList: " + (endTime - startTime) + " nanoseconds");
	}
}
