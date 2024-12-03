package dataStructure.graph.adjacencyList;

public class DataStructureGraphAdjacencyList {
	//
	//
	//    Adjacency List = An array/arraylist of linked lists.
	//                              Each LinkedList has a unique node at the head.
	//                              All adjacent neighbours to that node are added to that node's linked list.
	//
	//
	//                             Runtime complexity to check an Edge:  O(v)
	//                             space complexity: O( v + e )      

	public static void main ( String[] args ) {

		DataStructureGraph graph = new DataStructureGraph ( );

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


	}


}
