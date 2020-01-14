package geekForGeek;

import geekForGeek.RoottoLeafSum.Node;

public class BalancedBinaryTree {

	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	boolean findBalanced(Node root){
		
		if(root==null){
			return true;
		}
		
		int left=height(root.left);
		System.out.println("left"+left);
		int right=height(root.right);
		System.out.println("right"+right);
		
		
		if(Math.abs(left-right) <=1 &&  findBalanced(root.left) &&  findBalanced(root.right)){
			return true;
		}
		
		return false;
		 
		
	}
	
	
	int height(Node root){
		if(root==null){
			return 0;
		}else{
			int left=height(root.left);
			int right=height(root.right);
			if(left>=right){
				return 1+left;
			}else{
				return 1+right;
			}
			
		}
	}
	
	public static void main(String[] args) {

		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(2);
		root.right.left=new Node(2);
		root.right.right=new Node(4);
		root.right.left.left=new Node(5);
		/*root.right.left.left.left=new Node(5);*/
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		
		BalancedBinaryTree bal=new BalancedBinaryTree();
		
		boolean res=bal.findBalanced(root);
		System.out.println("res"+res);
		
		
		
		
		
	}

}
