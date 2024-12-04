package dataStructure.tree.binarysearch;

//
//  Binary Search Tree = "Binary tree is a tree data structure in which each node has at most two children,
//                                  called the left child and the right child. In a binary tree
//                                  the root node and all subsequent nodes must satisfy the following property:
//                                  the node’s value is greater than its left child's value and less than its right child's value.
//
//                                  Binary Tree exemple:
//
//                                      ( 4 )                                                                                                 ( 4 )
//                                  /           \                                                                                         /           \
//                             ( 2 )            ( 6 )                                       OR                                    ( 2 )            ( 6 )
//                            /    \            /    \                                                                              /    \            /
//                         ( 1 )  ( 3 )    ( 5 )   ( 7 )                                                                       ( 1 )  ( 3 )    ( 5 )
//
//
//  Binary Search Tree = a tree data structure, where each node is greater than it's left child, but less than it's right.
//                                benefit: easy to locate a node when they are in this order.
//                                time complexity: best case O(log n)
//                                                         worst case O(n)
//
//                                 Space complexity: O(n)
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public class DataStructureTreeBinarySearch {

	public static void main ( String[] args ) {

		DataStructureTree tree = new DataStructureTree ();

 tree.insert ( new DataSctructureNode ( 5 ) );
 tree.insert ( new DataSctructureNode ( 1 ) );
 tree.insert ( new DataSctructureNode ( 9 ) );
 tree.insert ( new DataSctructureNode ( 2 ) );
 tree.insert ( new DataSctructureNode ( 7 ) );
 tree.insert ( new DataSctructureNode ( 3 ) );
 tree.insert ( new DataSctructureNode ( 6 ) );
 tree.insert ( new DataSctructureNode ( 4 ) );
 tree.insert ( new DataSctructureNode ( 8 ) );
  tree.remove(7);
 tree.display ();
		System.out.println (tree.search ( 9) );

	}

}
