package dataStructure.hashTables;

//
//  Hash Tables = A data structure that stores unique key to values ex.<Integer, String>
//                       Each key/value pais is known as an Entry
//                       Fast insertion, look up, deletion of key/value pairs
//                       Not ideal for small data sets great with large data sets
//
//              hashing = takes a key and computes an integer (formula will vary based on key & data type)
//                               In a Hashtable, we use the hash % capacity to calculate an index number
//
//              key.hashCode() % capacity =  index
//
//              bucket = an indexed storage location fo one or more Entries.
//                            Can store multiple Entries if of a collision (linked similar a Linked List)
//
//               collision = hash function generates the same index for more than one key
//                                less collisions = more efficiency.
//
//
//                Runtime complexity: Best Case 0(1)
//                                               Worst Case 0(n)
//
//

import java.util.Hashtable;

public class DataStructureHashTable {

	public static void main ( String[] args ) {

		Hashtable<String,String> table = new Hashtable<String,String>(21);

		table.put("100", "Luffy"); // key, value
		table.put("123", "Zoro");
		table.put("321", "Sanji");
		table.put("555", "Nami");
		table.put("777", "Usopp");
		table.put("634", "WhiteBeard");

		table.remove ( 555 );

		for(String key : table.keySet()){
			System.out.println(key.hashCode ()%21 + " \t" + key.hashCode () + " \t" + key + "\t" +table.get(key));

		}

		System.out.println ( );
		table.remove ( 555 );

		for(String key : table.keySet()){
		System.out.println(key.hashCode ()%21 + " \t" + key.hashCode () + " \t" + key + " \t" + table.get(key));
		}
		


	}







}
