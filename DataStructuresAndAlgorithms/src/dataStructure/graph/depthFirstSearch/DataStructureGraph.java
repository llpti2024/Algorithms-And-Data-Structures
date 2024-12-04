package dataStructure.graph.depthFirstSearch;

import java.util.ArrayList;

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
		System.out.println ( );
	}

	public void depthFirstSearch ( int source ) {
		boolean[] visited = new boolean[ matrix.length ];
		dFSHelper ( source ,
		            visited );

	}

	private void dFSHelper ( int source , boolean[] visited ) {
		if ( visited[ source ] ) {
		;
		}
		else {
			visited[ source ] = true;
			System.out.println ( nodes.get ( source ).data + " = visited" );
			for ( int i = 0 ; i < matrix.length ; i++ ) ;
			for ( int i = 0 ; i < matrix[ source ].length ; i++ ) {
				if ( matrix[ source ][ i ] == 1 ) {
					dFSHelper ( i ,
					            visited );
				}
			}

		}
	}


}
