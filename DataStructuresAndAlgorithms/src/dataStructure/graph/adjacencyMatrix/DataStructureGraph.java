package dataStructure.graph.adjacencyMatrix;

import java.util.ArrayList;

public class DataStructureGraph {

	ArrayList <DataStructureNode> nodes;

	int[][] matrix;

	DataStructureGraph ( int size ) {
		  nodes = new ArrayList<>();
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
		System.out.println ( "         ");
		for( DataStructureNode node : nodes ) {
		System.out.print ( " "+ node.data  );
	}
		System.out.println ( );
		
 	for( int i = 0 ; i < matrix.length ; i++ ) {
	    System.out.print ( nodes.get ( i ).data + " " );
		for ( int j = 0 ; j < matrix.length ; j++ ) {
			System.out.print ( matrix[ i ][ j ] + " " );
		}
		System.out.println ( );
    }
	}


}
