package dataStructure.graph.depthFirstSearch;


public class DataStructureGraphDepthFirstSearch {
	//
	//   DFS = Depth First Search
	//               a search algorithm for traversing a tree, or a graph data structure.
	//               Pick a route, keep going.
	//                If you reach a dead end, or an already visited node,
	//                backtrack to a previous node with unvisited adjacent neighbors.
	//
	//

	public static void main ( String[] args ) {

		DataStructureGraph graph = new DataStructureGraph ( 5 );

		graph.addNode ( new DataStructureNode ( 'A' ) );
		graph.addNode ( new DataStructureNode ( 'B' ) );
		graph.addNode ( new DataStructureNode ( 'C' ) );
		graph.addNode ( new DataStructureNode ( 'D' ) );
		graph.addNode ( new DataStructureNode ( 'E' ) );

		graph.addEdge ( 0 ,
		                1 );
		graph.addEdge ( 1 ,
		                2 );
		graph.addEdge ( 1 ,
		                4 );
		graph.addEdge ( 2 ,
		                3 );
		graph.addEdge ( 2 ,
		                4 );
		graph.addEdge ( 4 ,
		                0 );
		graph.addEdge ( 4 ,
		                2 );

		graph.print ( );

		graph.depthFirstSearch ( 2 );


	}


}
