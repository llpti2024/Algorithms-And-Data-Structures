package dataStructure.graph.breadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DataStructureGraph {
	ArrayList < DataStructureNode > nodes;

	int[][] matrix;

	public DataStructureGraph ( int size ) {
		nodes = new ArrayList <> ( );
		matrix = new int[ size ][ size ];
	}


	public void addNode ( DataStructureNode node ) {

		nodes.add ( node );
	}


	//Source to be the row and Destination to be the column.
	public void addEdge ( int source , int destination ) {
		matrix[ source ][ destination ] = 1;

	}

	public boolean checkEdge ( int source , int destination ) {
		if ( matrix[ source ][ destination ] == 1 ) {
			return true;
		}
		else {
			return false;
		}
	}

	public void print ( ) {
		System.out.println ( "         " );
		for ( DataStructureNode node : nodes ) {
			System.out.print ( " " + node.data );
		}
		System.out.println ( );

		for ( int i = 0 ; i < matrix.length ; i++ ) {
			System.out.print ( nodes.get ( i ).data + " " );
			for ( int j = 0 ; j < matrix.length ; j++ ) {
				System.out.print ( matrix[ i ][ j ] + " " );
			}
			System.out.println ( );
		}
	}

	public void breadthFirstSearch ( int source ) {
		Queue < Integer > queue = new LinkedList <> ( );
		boolean[] visited = new boolean[ matrix.length ];
		queue.offer ( source );
		visited[ source ] = true;
		while ( queue.size ( ) != 0 ) {
			source = queue.poll ( );
			System.out.println ( nodes.get ( source ).data + " = visited" );
			for ( int i = 0 ; i < matrix[source].length ; i++ ) {
				if ( matrix[ source ][ i ] == 1 && ! visited[ i ] ) {
					queue.offer ( i );
					visited[ i ] = true;
				}
			}
		}
	}

}
