package dataStructure.graph.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class DataStructureGraph {
	ArrayList < LinkedList < DataStructureNode > > alist;


	DataStructureGraph ( ) {
		alist = new ArrayList <> ( );
	}

	public void addNode ( DataStructureNode node ) {
		LinkedList < DataStructureNode > currentList = new LinkedList <> ( );
		currentList.add ( node );
		alist.add ( currentList );
	}

	//Source to be the row and Destination to be the column.
	public void addEdge ( int source , int destination ) {
		LinkedList < DataStructureNode > currentList = alist.get ( source );
		DataStructureNode destinationNode = alist.get ( destination ).get ( 0 );
		currentList.add ( destinationNode );
	}

	public boolean checkEdge ( int source , int destination ) {
		LinkedList < DataStructureNode > currentList = alist.get ( source );
		DataStructureNode destinationNode = alist.get ( destination ).get ( 0 );
		for ( DataStructureNode node : currentList ) {
			if ( node == destinationNode ) {
				return true;
			}
		}
		return false;
	}

	public void print ( ) {

		for ( LinkedList < DataStructureNode > currentList : alist ) {
			for ( DataStructureNode node : currentList ) {
				System.out.print ( node.data + " ->" );
			}
			System.out.println ( );
		}
	}

}
