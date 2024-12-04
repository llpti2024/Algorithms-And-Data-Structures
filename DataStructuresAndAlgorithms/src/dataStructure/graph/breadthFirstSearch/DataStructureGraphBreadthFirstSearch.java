package dataStructure.graph.breadthFirstSearch;

public class DataStructureGraphBreadthFirstSearch {
	//
	//   BFS = a search algorithm for traversing a tree or graph data structure.
	//            This is done one “Level” at a time, rather than one "branch"at a time.
	//   Breadth FS= Traverse a graph level by level
	//                       Utilizes a Queue
	//                        Better if destination is on average close to start
	//                        Siblings are visited before children.
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
		graph.addEdge ( 2 ,
		                3 );
		graph.addEdge ( 2 ,
		                4 );
		graph.addEdge ( 4 ,
		                0 );
		graph.addEdge ( 4 ,
		                2 );

		graph.print ( );

		System.out.println ( graph.checkEdge ( 3 ,
		                                       2 ) );


		graph.breadthFirstSearch ( 4 );


	}


}
