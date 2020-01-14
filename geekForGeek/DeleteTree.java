package geekForGeek;

import geekForGeek.DiagonalTree.Node;

public class DeleteTree {

	
	static class Node{
		int data;
	    Node left, right;
	  
	    Node(int item) 
	    {
	        data = item;
	        left = right = null;
	    }
	}
	
	
	void deleteTr(Node root){
		
		if(root==null){
			return;
		}
		
		deleteTr(root.left);
		deleteTr(root.right);
		
		System.out.println("deleted Node:"+root.data);
		root=null;
		
	}
	
	
	public static void main(String[] args) {

		
		
		DeleteTree dele =new DeleteTree();
		Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
         
        dele.deleteTr(root);
	}

}
