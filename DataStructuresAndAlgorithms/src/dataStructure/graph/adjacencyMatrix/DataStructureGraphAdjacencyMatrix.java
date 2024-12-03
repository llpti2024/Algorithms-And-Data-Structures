package dataStructure.graph.adjacencyMatrix;

public class DataStructureGraphAdjacencyMatrix {
	//
	//
	//
	//   Adjacency Matrix = A 2D array to store 1's/0's to represent edges between nodes
	//                               # of rows = # of unique nodes
	//                               # of columns = # of unique nodes
	//
	//
	//                               runtime complexity to check if an edge exists: O(1)
	//                               space complexity: O(v^2)
	//
	//
	public static void main ( String[] args ) {

		    DataStructureGraph graph = new DataStructureGraph ( 5 )  ;

				graph.addNode ( new DataStructureNode ( 'A' ) );
				graph.addNode ( new DataStructureNode ( 'B' ) );
				graph.addNode ( new DataStructureNode ( 'C' ) );
				graph.addNode ( new DataStructureNode ( 'D' ) );
				graph.addNode ( new DataStructureNode ( 'E' ) );

                graph.addEdge ( 0 , 1 );
				graph.addEdge ( 1 , 2 );
				graph.addEdge ( 2 , 3 );
				graph.addEdge ( 2 , 4 );
				graph.addEdge ( 4 , 0 );
				graph.addEdge ( 4,  2 );

				graph.print ();

		System.out.println ( graph.checkEdge ( 3 , 2 ) );


	}







}
