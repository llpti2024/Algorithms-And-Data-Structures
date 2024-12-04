package dataStructure.tree.binarysearch;

public class DataStructureTree {

	//first node of the tree
	DataSctructureNode root;

	/***
	 * {@code @method insert} We use this method to start an insert value in our tree and to do the correct conditions about the rules in tree we use a recursion with a helper method.
	 * */
	public void insert ( DataSctructureNode node ) {
		root = insertHelper ( root ,
		                      node );  // use recursion, it is easier if you have a helper method.
	}


	/**
	 * {@code @method insertHelper} We use this method check our root It is assigned or not and start insert value in our tree with the correct conditions help to insert the correct value in the children of left and right.
	 * {@code @return} root
	 * */
	private DataSctructureNode insertHelper ( DataSctructureNode root , DataSctructureNode node ) {
		int data = node.data;
		//Check if your root node is assigne or not.
		if ( root == null ) {
			root = node;       //ir our root is null probably need assignment.
			return root;
		}else if ( data < root.data ) {                                 	//if else we need to see the data is less than root or greater than root.
			root.left = insertHelper ( root.left ,
			                           node );
		}else  {
			root.right = insertHelper ( root.right ,
			                            node );
		}

		return root;

	}


	 /**
	  * {@code @method display}  the first piece of data that's displayed is the least value, and the values will be displayed in increasing order.
	  * */
	public void display ( ) {
			 displayHelper ( root );
	}


	/**
	 * {@code @method displayHelper}    Will be checked if the root node of our subtree is null or not and organized the children of left and right..
	 * */
	private void displayHelper ( DataSctructureNode root ) {
		                    if( root != null ) {                                       //to use this in a traversal(non-decreasing order) we use recursion.
								displayHelper ( root.left );
								System.out.println (root.data );
								displayHelper ( root.right );
							}
	}


	/**
	 * {@code @method search}    will be use recursive mode to search a value in the tree.
	 * */
	public boolean search ( int data ) {
		return searchHelper ( root,data  );
	}


	/**
	 * {@code @method searchHelper}   check if root is null and apply the conditions comparing the data is greater than root or less than root to search for steps in the tree looking both sizes per step.
	 * */
	private boolean searchHelper ( DataSctructureNode root , int data ) {

		if( root != null ) {
			if ( root.data == data ) {
				return true;
			}else if ( data < root.data ) {
				return searchHelper ( root.left , data );
			}else {
				return searchHelper ( root.right , data );
			}
		}
		return false;
	}


	/**
	 * {@code @method remove}  using the helper to do a recursive mode.
	 * */
	public void remove ( int data ) {
		if(search(data)){
			root = removeHelper ( root , data );
		} else{
			System.out.println("Value not found");
		}

	}


	/**
	 * {@code @method removeHelper}  <p Will doing a selection looking the size of the value and change positions with left and rigth and when the </p>
	 * <p>code is found its delete and a process to put a sucessor or predecessor to replace the node start  </p>
	 * */
	private DataSctructureNode removeHelper ( DataSctructureNode root , int data ) {
		if ( root == null ) {
			return root;
		}
		else if ( data < root.data ) {
			root.left = removeHelper ( root.left ,
			                           data );
		}
		else if ( data > root.data ) {
			root.right = removeHelper ( root.right ,
			                            data );
		}
		else {                                   //When the code arrive here it means that the value is found.
			if ( root.left == null && root.right == null ) {
				root = null;
			}
			else if ( root.right != null ) { //find a sucessor to replace this node
				root.data = successor ( root );
				root.right = removeHelper ( root.right ,
				                            root.data );
			}
			else {           //find a predecessor to replace this node
				root.data = predecessor ( root );
				root.left = removeHelper ( root.left ,
				                           root.data );
			}
		}
		         return root;
	}


	/**
	 * {@code @method successor}   will find the least value below the right child of this root node.
	 * */
	private int successor ( DataSctructureNode root ) {
		root = root.right;
		while ( root.left != null ) {
			root = root.left;
		}
		return root.data;
	}


	/**
	 * {@code @method predecessor}  will find the greatest value below the left child of this root node.
	 * */
	private int predecessor ( DataSctructureNode root ) {
		root = root.left;
		while ( root.right != null ) {
			root = root.right;
		}
		return root.data;
	}


}
