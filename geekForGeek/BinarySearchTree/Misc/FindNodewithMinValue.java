package geekForGeek.BinarySearchTree.Misc;

import geekForGeek.BinarySearchTree.Misc.InorderSuccessor.Node;

public class FindNodewithMinValue {

	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	
	 Node  findSmallest(Node root){
		 Node current =root;

		 System.out.println("Root data:"+current.data);
		 
		    while(current.left!=null){
			current=current.left;
			
		    }
				
				
				
			return current;
				
				
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node root=new Node(20);
		root.left=new Node(8);
		root.right=new Node(22);
		root.left.left=new Node(4);
		root.left.right=new Node(12);
		root.left.right.left=new Node(10);
		root.left.right.right=new Node(14);
  
		FindNodewithMinValue  noe =new FindNodewithMinValue();
		
		
		Node min=noe.findSmallest(root);
		System.out.println("Min Value "+min.data);
		
		
		

	}

}
